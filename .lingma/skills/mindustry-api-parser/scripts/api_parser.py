#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import json
import re
import time
import os
import sys
from typing import Dict, List, Any, Optional, Union


class ApiParser:
    def __init__(self, json_data: Union[str, dict]):
        if isinstance(json_data, str):
            self.raw_data = json.loads(json_data)
        else:
            self.raw_data = json_data

        self.api_index: Dict[str, dict] = {}
        self.module_index: Dict[str, dict] = {}
        self._build_index()
        self._build_relationships()

    def _build_index(self):
        for module in self.raw_data.get('apis', []):
            module_name = module.get('name')
            if module_name:
                about = []
                self.module_index[module_name] = {'module': module.copy(), 'about': about}
                for api in module.get('apis', []):
                    api_add_name = api.get('addName', api.get('name'))
                    if api_add_name:
                        self.api_index[api_add_name] = {'module': module.copy(), 'api': api.copy(), 'about': about}

    def _build_relationships(self):
        for module_key, module_info in self.module_index.items():
            current_module = module_info['module']
            add_ref = current_module.get('add')
            if not add_ref:
                continue
            for target_key, target_info in self.module_index.items():
                if module_key == target_key:
                    continue
                target_module = target_info['module']
                target_name = target_module.get('name')
                is_related = False
                if isinstance(add_ref, list):
                    if target_name in add_ref:
                        is_related = True
                elif isinstance(add_ref, str):
                    if target_name and add_ref in target_name:
                        is_related = True
                if is_related:
                    if target_module not in module_info['about']:
                        module_info['about'].append(target_module)
                    if current_module not in target_info['about']:
                        target_info['about'].append(current_module)

        for api_key, api_info in self.api_index.items():
            type_ref = api_info['api'].get('type')
            if type_ref and type_ref in self.module_index:
                ref_module = self.module_index[type_ref]['module']
                if ref_module not in api_info['about']:
                    api_info['about'].append(ref_module)
                current_mod = api_info['module']
                about_list = self.module_index[type_ref].setdefault('about', [])
                if current_mod not in about_list:
                    about_list.append(current_mod)

    def find(self, key: str) -> str:
        if key in self.module_index:
            return self.find_module(key)
        elif key in self.api_index:
            return self.find_api(key)
        else:
            return self.fuzzy_search(key)

    def find_module(self, module_key: str) -> str:
        info = self.module_index.get(module_key)
        if not info:
            return f"未找到模块: {module_key}"
        module = info['module']
        lines = [
            f"模块名称: {module.get('name')}",
            f"模块描述: {module.get('description', '')}"
        ]
        lines.append("模块接口:")
        for api in module.get('apis', []):
            lines.append(f"{api.get('name')} {api.get('description', '')}")
        if info['about']:
            lines.append("\n与此有关的模块: ")
            for m in info['about']:
                lines.append(f"{m.get('name')} {m.get('description', '')}")
        lines.append("\nPS: 查询接口请使用\"模块名-接口名\"")
        return '\n'.join(lines)

    def find_api(self, api_key: str) -> str:
        info = self.api_index.get(api_key)
        if not info:
            return f"未找到接口: {api_key}"
        api = info['api']
        module = info['module']
        lines = [
            f"接口名称: {api.get('name')}",
            f"接口原名: {api.get('addName', api.get('name'))}"
        ]
        chinese_name = api.get('chineseName', '')
        if chinese_name:
            lines.append(chinese_name)
        else:
            lines.append("")
        lines.append(f"接口描述: {api.get('description', '')}")
        lines.append(f"参数类型: {api.get('type', '未知')}")
        if api.get('detail'):
            lines.append(f"详细描述: {api.get('detail')}")
        eg_str = self._format_eg(api)
        if eg_str:
            lines.append(f"参数示例: {eg_str}")
        usage_eg = self._get_api_eg(api_key, True)
        lines.append(f"用法示例: {usage_eg}")
        if info['about']:
            lines.append("与此有关的模块: ")
            for m in info['about']:
                lines.append(f"{m.get('name')} {m.get('description', '')}")
        return '\n'.join(lines)

    def _format_eg(self, api: dict) -> Optional[str]:
        if api.get('eg'):
            return '\n'.join(api['eg'])
        return None

    def _get_api_eg(self, key: str, t: bool = False) -> str:
        api = self.api_index[key]['api']
        msg = ''
        if t:
            msg += '{\n'
            msg += f'"type": "{api.get("name")}",\n'
        msg += f'"{api.get("name")}": '

        api_type = api.get('type', '')
        eg_list = api.get('eg', [])

        if api_type == 'string':
            p = f'"{eg_list[0]}"' if eg_list else '"null"'
        elif api_type == 'number':
            p = f'{eg_list[0]}' if eg_list else '0'
        elif api_type == 'boolean':
            p = f'{eg_list[0]}' if eg_list else 'true'
        elif api_type == 'object':
            p = '{}'
        elif api_type == 'Color':
            p = '"000FFFF"'
        else:
            p = f'null,//Type: {api_type}'

        if '[]' in api_type:
            p = '[]'

        if t:
            p += '\n}'
        return msg + p

    def fuzzy_search(self, keyword: str) -> str:
        pattern = re.compile(keyword, re.IGNORECASE)
        results = []

        for module_data in self.module_index.values():
            module = module_data['module']
            keys_to_check = [
                module.get('name', ''),
                module.get('chineseName', ''),
                module.get('description', ''),
                module.get('detail', '')
            ]
            for key in keys_to_check:
                if key and pattern.search(key):
                    results.append(f"模块名称: {module.get('name')}\n描述: {module.get('description', '')}")
                    break

        for api_data in self.api_index.values():
            api = api_data['api']
            keys_to_check = [
                api.get('name', ''),
                api.get('chineseName', ''),
                api.get('description', ''),
                api.get('detail', '')
            ]
            for key in keys_to_check:
                if key and pattern.search(key):
                    results.append(f"接口名称: {api.get('addName', api.get('name'))}\n描述: {api.get('description', '')}")
                    break

        ret = ''
        for result in results:
            ret += result + '\n'
        return ret

    def get_module_eg(self, module_key: str) -> str:
        start_time = time.time()
        module_info = self.module_index.get(module_key)
        if not module_info:
            return 'Failed'

        module = module_info['module']
        ret = '{\n'
        try:
            ret += f'"type": "{module_key}",\n'
            for api in module.get('apis', []):
                api_add_name = api.get('addName', api.get('name'))
                if f'"{api.get("name")}"' not in ret:
                    ret += '\n' + self._get_api_eg(api_add_name) + ',\n'
                    api_info = self.api_index.get(api_add_name)
                    if api_info:
                        if not api_info['about']:
                            ret += f'//{api_info["api"].get("description", "")}\n'
                            about_names = ' '.join([m.get('name', '') for m in api_info['about']])
                            ret += f'//{about_names}'
                        elif api_info['api'].get('description', ''):
                            ret += f'//{api_info["api"].get("description", "")}'
        except Exception:
            ret = 'Failed'

        execution_time = (time.time() - start_time)
        return self._replace_last_comma(ret) + f'\n生成时间: {execution_time}秒' + f'总接口数: {len(module.get("apis", []))}'

    def _replace_last_comma(self, s: str) -> str:
        index = s.rfind(',')
        if index == -1:
            return s
        return s[:index] + s[index+1:] + '\n}'

    def to_json(self, json_str: str) -> str:
        return json.dumps(json.loads(json_str), indent=2, ensure_ascii=False)

    def get_module_list(self) -> List[dict]:
        result = []
        for info in self.module_index.values():
            m = info['module']
            result.append({'name': m.get('name'), 'chineseName': m.get('chineseName'), 'description': m.get('description')})
        return result


def load_api_parser_from_file(file_path: Optional[str] = None) -> ApiParser:
    if file_path is None:
        file_path = input("请输入 JSON 文件路径: ").strip().strip('"')
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
            if not content:
                raise ValueError("JSON 文件为空")
            json_data = json.loads(content)
        if not json_data or not isinstance(json_data.get('apis'), list):
            raise ValueError('无效的 JSON 格式：必须包含 apis 数组')
        return ApiParser(json_data)
    except Exception as e:
        raise Exception(f"加载失败: {e}")


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python api_parser.py <command> [key]")
        print("Commands: query, list_modules, module_eg")
        sys.exit(1)
    command = sys.argv[1]
    key = sys.argv[2] if len(sys.argv) > 2 else ""
    script_dir = os.path.dirname(os.path.abspath(__file__))
    json_path = os.path.join(script_dir, "t.json")
    if not os.path.exists(json_path):
        json_path = os.path.join(os.path.dirname(script_dir), "t.json")
    if not os.path.exists(json_path) and len(sys.argv) > 3:
        json_path = sys.argv[3]
    if not os.path.exists(json_path):
        print(f"Error: 找不到文件 {json_path}")
        sys.exit(1)
    try:
        parser = load_api_parser_from_file(json_path)
        if command == "query":
            if key:
                print(parser.find(key))
            else:
                print("请提供查询关键字")
        elif command == "list_modules":
            print(json.dumps(parser.get_module_list(), indent=2, ensure_ascii=False))
        elif command == "module_eg":
            if key:
                print(parser.get_module_eg(key))
            else:
                print("请提供模块名称")
        else:
            print(f"未知命令: {command}")
    except Exception as e:
        print(f"运行错误: {e}")
        import traceback
        traceback.print_exc()
