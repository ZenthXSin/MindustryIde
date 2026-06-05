# mindustry:core/src/mindustry/net/Administration.java

> Source: `/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Administration.java`

## 源码位置

- 仓库：`mindustry`
- 相对路径：`core/src/mindustry/net/Administration.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Mindustry/core/src/mindustry/net/Administration.java`
- SHA1：`9a73d43e17a2f41614775d276791ecffa217001c`
- 大小：27256 bytes
- 行数：747

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class Administration`。

关键词：net

## Package

`mindustry.net`

## 类型声明

- `class Administration`
- `class Config`
- `class PlayerInfoimplements Serializable`
- `interface ChatFilter`
- `interface ActionFilter`
- `class TraceInfo`
- `class PlayerActionimplements Poolable`
- `enum ActionType`

## 字段线索

- `bannedIPs`
- `whitelist`
- `chatFilters`
- `actionFilters`
- `subnetBans`
- `dosBlacklist`
- `kickedIPs`
- `bannedNames`
- `loaded`
- `playerInfo`
- `all`
- `serverName`
- `defaultValue`
- `description`
- `changed`
- `id`
- `lastName`
- `ips`
- `names`
- `adminUsid`

## 方法线索

- `getKickTime`
- `handleKicked`
- `getSubnetBans`
- `removeSubnetBan`
- `addSubnetBan`
- `isSubnetBanned`
- `addNameBan`
- `addChatFilter`
- `addActionFilter`
- `allowAction`
- `getPlayerLimit`
- `setPlayerLimit`
- `isStrict`
- `allowsCustomClients`
- `updatePlayerJoined`
- `banPlayer`
- `banPlayerIP`
- `banPlayerID`
- `unbanPlayerIP`
- `unbanPlayerID`
- `getAdmins`
- `getBanned`
- `getBannedIPs`
- `adminPlayer`
- `unAdminPlayer`
- `isWhitelistEnabled`
- `isWhitelisted`
- `whitelist`
- `unwhitelist`
- `isIPBanned`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
