# mindustry:desktop/src/mindustry/desktop/steam/SNet.java

> Source: `/home/zenxsin/cow/源码和示例/Mindustry/desktop/src/mindustry/desktop/steam/SNet.java`

## 源码位置

- 仓库：`mindustry`
- 相对路径：`desktop/src/mindustry/desktop/steam/SNet.java`
- 绝对路径：`/home/zenxsin/cow/源码和示例/Mindustry/desktop/src/mindustry/desktop/steam/SNet.java`
- SHA1：`93f0cce6c1efd4433b71834793d352701b6ec89e`
- 大小：18916 bytes
- 行数：475

## 文件职责摘要

此页是文件级知识点。当前静态摘要：`class SNetimplements SteamNetworkingCallback, SteamMatchmakingCallback, SteamFriendsCallback, NetProvider`。

关键词：net

## Package

`mindustry.desktop.steam`

## 类型声明

- `class SNetimplements SteamNetworkingCallback, SteamMatchmakingCallback, SteamFriendsCallback, NetProvider`
- `class SteamConnectionextends NetConnection`

## 字段线索

- `snet`
- `smat`
- `friends`
- `provider`
- `serializer`
- `writeBuffer`
- `readBuffer`
- `readCopyBuffer`
- `connections`
- `steamConnections`
- `sid`

## 方法线索

- `update`
- `isSteamClient`
- `connectClient`
- `IOException`
- `sendClient`
- `disconnectClient`
- `discoverServers`
- `pingHost`
- `hostServer`
- `updateLobby`
- `closeServer`
- `onLobbyInvite`
- `onLobbyEnter`
- `onLobbyChatUpdate`
- `onLobbyMatchList`
- `onLobbyCreated`
- `showFriendInvites`
- `onP2PSessionConnectFail`
- `onP2PSessionRequest`
- `onGameLobbyJoinRequested`
- `send`
- `isConnected`
- `kickDisconnect`
- `close`

## 使用方式

- 需要全文时，直接读取上方 Source 路径对应的本地源码文件。
- 本页保留源码位置、hash 和静态分析结果，不复制源码全文。
- 总索引见 [overview](../overview.md)。

## Related

- [Mindustry / Arc Full Source Knowledge Index Plan](../../mindustry-source-index/overview.md)
- [Mindustry & Arc 源码位置](../../mindustry/source-code-locations.md)
