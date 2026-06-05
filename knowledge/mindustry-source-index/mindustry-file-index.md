# Mindustry Source File Index

> Source: `/home/zenxsin/cow/源码和示例/Mindustry`

本页是源码级知识索引：每个源文件一条知识点记录。完整源代码不直接复制进知识库页面，原因是体量过大且会制造重复快照；知识页记录路径、大小、hash、包名/类型摘要，读取原文以本地源码路径为准。

## Repository Summary

- Files indexed: 1130
- Source bytes: 13289964

## Files

| File | Size | SHA1-12 | Package / declarations |
|---|---:|---|---|
| `.github/pull_request_template.md` | 394 | `06039004053d` |  |
| `CONTRIBUTING.md` | 6405 | `a3daa7004019` |  |
| `ISSUES.md` | 3289 | `7b282cd2207a` |  |
| `README.md` | 4770 | `13cc56146564` |  |
| `SERVERLIST.md` | 256 | `7a31f5001d57` |  |
| `TRANSLATING.md` | 3359 | `2f08e59a7f3a` |  |
| `android/build.gradle` | 5038 | `8229405479b0` |  |
| `android/src/mindustry/android/AndroidLauncher.java` | 14127 | `e694e13cd786` | mindustry.android; class AndroidLauncher |
| `android/src/mindustry/android/AndroidRhinoContext.java` | 6981 | `8b75a23af431` | mindustry.android; class AndroidRhinoContext, class AndroidContextFactory, class BaseAndroidClassLoader, class FileAndroidClassLoader, class InMemoryAndroidClassLoader |
| `annotations/build.gradle` | 110 | `fe1c3e189905` |  |
| `annotations/src/main/java/mindustry/annotations/Annotations.java` | 9153 | `f311faabc611` | mindustry.annotations; class Annotations, enum PacketPriority, enum Loc, enum Variant |
| `annotations/src/main/java/mindustry/annotations/BaseProcessor.java` | 8052 | `cd1f17e8ba58` | mindustry.annotations; class BaseProcessor |
| `annotations/src/main/java/mindustry/annotations/entity/EntityIO.java` | 14428 | `5b7682dad6a8` | mindustry.annotations.entity; class EntityIO, class Revision, class RevisionField |
| `annotations/src/main/java/mindustry/annotations/entity/EntityProcess.java` | 51395 | `b4303f7842d1` | mindustry.annotations.entity; class EntityProcess |
| `annotations/src/main/java/mindustry/annotations/impl/AssetsProcess.java` | 10207 | `8e77d597cc48` | mindustry.annotations.impl; class AssetsProcess |
| `annotations/src/main/java/mindustry/annotations/impl/StructProcess.java` | 9535 | `bd856a32632b` | mindustry.annotations.impl; class StructProcess |
| `annotations/src/main/java/mindustry/annotations/misc/LoadRegionProcessor.java` | 4599 | `7e017541db58` | mindustry.annotations.misc; class LoadRegionProcessor |
| `annotations/src/main/java/mindustry/annotations/misc/LogicStatementProcessor.java` | 3976 | `606491b994ca` | mindustry.annotations.misc; class LogicStatementProcessor |
| `annotations/src/main/java/mindustry/annotations/remote/CallGenerator.java` | 16224 | `f999efce52f4` | mindustry.annotations.remote; class CallGenerator |
| `annotations/src/main/java/mindustry/annotations/remote/MethodEntry.java` | 2085 | `1f552d63f535` | mindustry.annotations.remote; class MethodEntry |
| `annotations/src/main/java/mindustry/annotations/remote/RemoteProcess.java` | 2715 | `ec5f126fef13` | mindustry.annotations.remote; class RemoteProcess |
| `annotations/src/main/java/mindustry/annotations/remote/SerializerResolver.java` | 789 | `228191844fc6` | mindustry.annotations.remote; class SerializerResolver |
| `annotations/src/main/java/mindustry/annotations/util/AnnotationProxyMaker.java` | 7778 | `8226358c735f` | mindustry.annotations.util; class AnnotationProxyMaker, class ValueVisitor |
| `annotations/src/main/java/mindustry/annotations/util/Selement.java` | 2823 | `86880ba0cde9` | mindustry.annotations.util; class Selement |
| `annotations/src/main/java/mindustry/annotations/util/Smethod.java` | 1707 | `586b0dbda106` | mindustry.annotations.util; class Smethod |
| `annotations/src/main/java/mindustry/annotations/util/Stype.java` | 1965 | `fca163de621c` | mindustry.annotations.util; class Stype |
| `annotations/src/main/java/mindustry/annotations/util/Svar.java` | 814 | `5d749a2cf5d7` | mindustry.annotations.util; class Svar |
| `annotations/src/main/java/mindustry/annotations/util/TypeIOResolver.java` | 3594 | `7cc593c914fe` | mindustry.annotations.util; class TypeIOResolver, class ClassSerializer |
| `annotations/src/main/resources/classids.properties` | 1125 | `ebf219c2e279` |  |
| `annotations/src/main/resources/revisions/BuildingComp/0.json` | 392 | `83be41b81297` |  |
| `annotations/src/main/resources/revisions/BuildingComp/1.json` | 286 | `01c557e353a0` |  |
| `annotations/src/main/resources/revisions/BulletComp/0.json` | 435 | `e995fc63dc0d` |  |
| `annotations/src/main/resources/revisions/BulletComp/1.json` | 390 | `dd1152cc4f77` |  |
| `annotations/src/main/resources/revisions/BulletComp/2.json` | 425 | `c35b5aa349f5` |  |
| `annotations/src/main/resources/revisions/DecalComp/0.json` | 265 | `cc9e02e28edd` |  |
| `annotations/src/main/resources/revisions/EffectStateComp/0.json` | 414 | `d11c9c43a444` |  |
| `annotations/src/main/resources/revisions/EffectStateComp/1.json` | 410 | `180189bc4c29` |  |
| `annotations/src/main/resources/revisions/EffectStateComp/2.json` | 424 | `ebfe5dd87878` |  |
| `annotations/src/main/resources/revisions/EffectStateComp/3.json` | 410 | `5bbbda7625e5` |  |
| `annotations/src/main/resources/revisions/EffectStateComp/4.json` | 410 | `d65385220523` |  |
| `annotations/src/main/resources/revisions/EffectStateComp/5.json` | 410 | `66119e2bde31` |  |
| `annotations/src/main/resources/revisions/EffectStateComp/6.json` | 433 | `e61390fe2997` |  |
| `annotations/src/main/resources/revisions/FireComp/0.json` | 308 | `83a513810430` |  |
| `annotations/src/main/resources/revisions/FireComp/1.json` | 184 | `b615bd5bae60` |  |
| `annotations/src/main/resources/revisions/ForceDrawComp/0.json` | 64 | `4cdca2c5e937` |  |
| `annotations/src/main/resources/revisions/LargeLaunchPayloadComp/0.json` | 197 | `150097046368` |  |
| `annotations/src/main/resources/revisions/LaunchCoreComp/0.json` | 176 | `c298c73e1185` |  |
| `annotations/src/main/resources/revisions/LaunchPayloadComp/0.json` | 241 | `65863328c4ec` |  |
| `annotations/src/main/resources/revisions/PlayerComp/0.json` | 429 | `ef80c0ed752a` |  |
| `annotations/src/main/resources/revisions/PlayerComp/1.json` | 400 | `6ac182d9d7c9` |  |
| `annotations/src/main/resources/revisions/PlayerComp/2.json` | 481 | `42308826afb0` |  |
| `annotations/src/main/resources/revisions/PosTeamDef/0.json` | 87 | `ca2dc22e9d15` |  |
| `annotations/src/main/resources/revisions/PowerGraphUpdaterComp/0.json` | 11 | `3a00183171d5` |  |
| `annotations/src/main/resources/revisions/PuddleComp/0.json` | 225 | `d2832e67f570` |  |
| `annotations/src/main/resources/revisions/PuddleComp/1.json` | 164 | `f0debd9fca1d` |  |
| `annotations/src/main/resources/revisions/WeatherStateComp/0.json` | 213 | `090e688f48b3` |  |
| `annotations/src/main/resources/revisions/WeatherStateComp/1.json` | 260 | `88bad26b8c99` |  |
| `annotations/src/main/resources/revisions/WeatherStateComp/2.json` | 310 | `485794b260c4` |  |
| `annotations/src/main/resources/revisions/WorldLabelComp/0.json` | 154 | `6f3ee1a2c7f3` |  |
| `annotations/src/main/resources/revisions/WorldLabelComp/1.json` | 202 | `aa819f968aaf` |  |
| `annotations/src/main/resources/revisions/alpha/0.json` | 722 | `1b49642304c6` |  |
| `annotations/src/main/resources/revisions/alpha/1.json` | 767 | `f66d2db6737b` |  |
| `annotations/src/main/resources/revisions/alpha/2.json` | 778 | `7b6e53997f54` |  |
| `annotations/src/main/resources/revisions/alpha/3.json` | 841 | `767ec5e1ac68` |  |
| `annotations/src/main/resources/revisions/alpha/4.json` | 887 | `e805d2a7a0b7` |  |
| `annotations/src/main/resources/revisions/alpha/5.json` | 864 | `af4c5d36ca8b` |  |
| `annotations/src/main/resources/revisions/arkyid/0.json` | 722 | `1b49642304c6` |  |
| `annotations/src/main/resources/revisions/arkyid/1.json` | 767 | `f66d2db6737b` |  |
| `annotations/src/main/resources/revisions/arkyid/2.json` | 778 | `7b6e53997f54` |  |
| `annotations/src/main/resources/revisions/arkyid/3.json` | 841 | `767ec5e1ac68` |  |
| `annotations/src/main/resources/revisions/arkyid/4.json` | 887 | `e805d2a7a0b7` |  |
| `annotations/src/main/resources/revisions/arkyid/5.json` | 864 | `af4c5d36ca8b` |  |
| `annotations/src/main/resources/revisions/beta/0.json` | 722 | `1b49642304c6` |  |
| `annotations/src/main/resources/revisions/beta/1.json` | 767 | `f66d2db6737b` |  |
| `annotations/src/main/resources/revisions/beta/2.json` | 778 | `7b6e53997f54` |  |
| `annotations/src/main/resources/revisions/beta/3.json` | 841 | `767ec5e1ac68` |  |
| `annotations/src/main/resources/revisions/beta/4.json` | 887 | `e805d2a7a0b7` |  |
| `annotations/src/main/resources/revisions/beta/5.json` | 864 | `af4c5d36ca8b` |  |
| `annotations/src/main/resources/revisions/block/0.json` | 742 | `3f82cd17c691` |  |
| `annotations/src/main/resources/revisions/block/1.json` | 713 | `f93868802533` |  |
| `annotations/src/main/resources/revisions/block/2.json` | 619 | `4911298274e6` |  |
| `annotations/src/main/resources/revisions/block/3.json` | 661 | `9530aa37e608` |  |
| `annotations/src/main/resources/revisions/block/4.json` | 732 | `447693002c17` |  |
| `annotations/src/main/resources/revisions/block/5.json` | 767 | `0ff9e3e8814e` |  |
| `annotations/src/main/resources/revisions/block/6.json` | 778 | `576e99b7b15c` |  |
| `annotations/src/main/resources/revisions/block/7.json` | 841 | `315cc3dbb0cc` |  |
| `annotations/src/main/resources/revisions/block/8.json` | 887 | `9b062f2ee1c7` |  |
| `annotations/src/main/resources/revisions/block/9.json` | 864 | `613a8ef2c406` |  |
| `annotations/src/main/resources/revisions/corvus/0.json` | 742 | `3f82cd17c691` |  |
| `annotations/src/main/resources/revisions/corvus/1.json` | 713 | `f93868802533` |  |
| `annotations/src/main/resources/revisions/corvus/2.json` | 619 | `4911298274e6` |  |
| `annotations/src/main/resources/revisions/corvus/3.json` | 661 | `9530aa37e608` |  |
| `annotations/src/main/resources/revisions/corvus/4.json` | 732 | `447693002c17` |  |
| `annotations/src/main/resources/revisions/corvus/5.json` | 767 | `0ff9e3e8814e` |  |
| `annotations/src/main/resources/revisions/corvus/6.json` | 778 | `576e99b7b15c` |  |
| `annotations/src/main/resources/revisions/corvus/7.json` | 841 | `315cc3dbb0cc` |  |
| `annotations/src/main/resources/revisions/corvus/8.json` | 887 | `9b062f2ee1c7` |  |
| `annotations/src/main/resources/revisions/corvus/9.json` | 864 | `613a8ef2c406` |  |
| `annotations/src/main/resources/revisions/elude/0.json` | 831 | `edbb13dbbbc9` |  |
| `annotations/src/main/resources/revisions/elude/1.json` | 887 | `b40343e30594` |  |
| `annotations/src/main/resources/revisions/elude/2.json` | 864 | `a7af9c7d40c7` |  |
| `annotations/src/main/resources/revisions/flare/0.json` | 742 | `3f82cd17c691` |  |
| `annotations/src/main/resources/revisions/flare/1.json` | 713 | `f93868802533` |  |
| `annotations/src/main/resources/revisions/flare/2.json` | 619 | `4911298274e6` |  |
| `annotations/src/main/resources/revisions/flare/3.json` | 661 | `9530aa37e608` |  |
| `annotations/src/main/resources/revisions/flare/4.json` | 732 | `447693002c17` |  |
| `annotations/src/main/resources/revisions/flare/5.json` | 767 | `0ff9e3e8814e` |  |
| `annotations/src/main/resources/revisions/flare/6.json` | 778 | `576e99b7b15c` |  |
| `annotations/src/main/resources/revisions/flare/7.json` | 841 | `315cc3dbb0cc` |  |
| `annotations/src/main/resources/revisions/flare/8.json` | 887 | `9b062f2ee1c7` |  |
| `annotations/src/main/resources/revisions/flare/9.json` | 864 | `613a8ef2c406` |  |
| `annotations/src/main/resources/revisions/gamma/0.json` | 722 | `1b49642304c6` |  |
| `annotations/src/main/resources/revisions/gamma/1.json` | 767 | `f66d2db6737b` |  |
| `annotations/src/main/resources/revisions/gamma/2.json` | 778 | `7b6e53997f54` |  |
| `annotations/src/main/resources/revisions/gamma/3.json` | 841 | `767ec5e1ac68` |  |
| `annotations/src/main/resources/revisions/gamma/4.json` | 887 | `e805d2a7a0b7` |  |
| `annotations/src/main/resources/revisions/gamma/5.json` | 864 | `af4c5d36ca8b` |  |
| `annotations/src/main/resources/revisions/latum/0.json` | 831 | `edbb13dbbbc9` |  |
| `annotations/src/main/resources/revisions/latum/1.json` | 887 | `b40343e30594` |  |
| `annotations/src/main/resources/revisions/latum/2.json` | 864 | `a7af9c7d40c7` |  |
| `annotations/src/main/resources/revisions/mace/0.json` | 780 | `dd94f9f882ea` |  |
| `annotations/src/main/resources/revisions/mace/1.json` | 751 | `f2fb8a48eaf7` |  |
| `annotations/src/main/resources/revisions/mace/2.json` | 650 | `5cb445314976` |  |
| `annotations/src/main/resources/revisions/mace/3.json` | 692 | `f7c9a86c1fb2` |  |
| `annotations/src/main/resources/revisions/mace/4.json` | 763 | `14ae76e5eff3` |  |
| `annotations/src/main/resources/revisions/mace/5.json` | 798 | `f1212a462c6e` |  |
| `annotations/src/main/resources/revisions/mace/6.json` | 809 | `ce819676d498` |  |
| `annotations/src/main/resources/revisions/mace/7.json` | 872 | `2005f5a83929` |  |
| `annotations/src/main/resources/revisions/mace/8.json` | 918 | `49c3aa5341f0` |  |
| `annotations/src/main/resources/revisions/mace/9.json` | 895 | `6c6dfb333d8f` |  |
| `annotations/src/main/resources/revisions/manifold/0.json` | 875 | `5dcb01c13361` |  |
| `annotations/src/main/resources/revisions/manifold/1.json` | 948 | `baa98feb1d45` |  |
| `annotations/src/main/resources/revisions/manifold/2.json` | 994 | `412d88fbb98d` |  |
| `annotations/src/main/resources/revisions/manifold/3.json` | 971 | `9da5c3ccdad0` |  |
| `annotations/src/main/resources/revisions/mega/0.json` | 956 | `e113b7f65ad6` |  |
| `annotations/src/main/resources/revisions/mega/1.json` | 927 | `ce73a2278b78` |  |
| `annotations/src/main/resources/revisions/mega/2.json` | 809 | `2e3da96282d2` |  |
| `annotations/src/main/resources/revisions/mega/3.json` | 844 | `62f717b244de` |  |
| `annotations/src/main/resources/revisions/mega/4.json` | 855 | `4d23c65d3dc2` |  |
| `annotations/src/main/resources/revisions/mega/5.json` | 918 | `63703980620d` |  |
| `annotations/src/main/resources/revisions/mega/6.json` | 964 | `0a1f03884da7` |  |
| `annotations/src/main/resources/revisions/mega/7.json` | 941 | `fffa8952e41d` |  |
| `annotations/src/main/resources/revisions/missile/0.json` | 818 | `96978e198d8f` |  |
| `annotations/src/main/resources/revisions/missile/1.json` | 891 | `b2bbea832058` |  |
| `annotations/src/main/resources/revisions/missile/2.json` | 937 | `4ad8e8d9619b` |  |
| `annotations/src/main/resources/revisions/missile/3.json` | 914 | `d3a0301aafa7` |  |
| `annotations/src/main/resources/revisions/mono/0.json` | 792 | `4ddebcfd33ee` |  |
| `annotations/src/main/resources/revisions/mono/1.json` | 763 | `3b30c63b8179` |  |
| `annotations/src/main/resources/revisions/mono/2.json` | 661 | `b90e5134688a` |  |
| `annotations/src/main/resources/revisions/mono/3.json` | 732 | `19e19d95bde6` |  |
| `annotations/src/main/resources/revisions/mono/4.json` | 767 | `a510b27c607a` |  |
| `annotations/src/main/resources/revisions/mono/5.json` | 778 | `c2d4f61b4355` |  |
| `annotations/src/main/resources/revisions/mono/6.json` | 841 | `9afddbb993a2` |  |
| `annotations/src/main/resources/revisions/mono/7.json` | 887 | `a35baec56661` |  |
| `annotations/src/main/resources/revisions/mono/8.json` | 864 | `9d7b0c6197b2` |  |
| `annotations/src/main/resources/revisions/nova/0.json` | 909 | `969eb19cd32d` |  |
| `annotations/src/main/resources/revisions/nova/1.json` | 880 | `db8d7c67a465` |  |
| `annotations/src/main/resources/revisions/nova/2.json` | 763 | `aaa47cb9506a` |  |
| `annotations/src/main/resources/revisions/nova/3.json` | 798 | `bc193b5f1e27` |  |
| `annotations/src/main/resources/revisions/nova/4.json` | 809 | `1a2f02f210cc` |  |
| `annotations/src/main/resources/revisions/nova/5.json` | 872 | `cdd4c301c8e7` |  |
| `annotations/src/main/resources/revisions/nova/6.json` | 918 | `551559f4b66c` |  |
| `annotations/src/main/resources/revisions/nova/7.json` | 895 | `e2e4ff822dc8` |  |
| `annotations/src/main/resources/revisions/oct/0.json` | 733 | `67a8e9680312` |  |
| `annotations/src/main/resources/revisions/oct/1.json` | 767 | `7511a763950f` |  |
| `annotations/src/main/resources/revisions/oct/2.json` | 809 | `2e3da96282d2` |  |
| `annotations/src/main/resources/revisions/oct/3.json` | 844 | `62f717b244de` |  |
| `annotations/src/main/resources/revisions/oct/4.json` | 855 | `4d23c65d3dc2` |  |
| `annotations/src/main/resources/revisions/oct/5.json` | 918 | `63703980620d` |  |
| `annotations/src/main/resources/revisions/oct/6.json` | 964 | `0a1f03884da7` |  |
| `annotations/src/main/resources/revisions/oct/7.json` | 941 | `fffa8952e41d` |  |
| `annotations/src/main/resources/revisions/osc/0.json` | 831 | `edbb13dbbbc9` |  |
| `annotations/src/main/resources/revisions/poly/0.json` | 871 | `8fd97392cd42` |  |
| `annotations/src/main/resources/revisions/poly/1.json` | 842 | `faae926e117b` |  |
| `annotations/src/main/resources/revisions/poly/2.json` | 732 | `6347bc467906` |  |
| `annotations/src/main/resources/revisions/poly/3.json` | 767 | `67c8ce82ea55` |  |
| `annotations/src/main/resources/revisions/poly/4.json` | 778 | `99939b2e88cb` |  |
| `annotations/src/main/resources/revisions/poly/5.json` | 841 | `d95941d9aeac` |  |
| `annotations/src/main/resources/revisions/poly/6.json` | 887 | `8a32a6e11b7f` |  |
| `annotations/src/main/resources/revisions/poly/7.json` | 864 | `bf4471ebbd9c` |  |
| `annotations/src/main/resources/revisions/pulsar/0.json` | 753 | `3ed6e798fe3e` |  |
| `annotations/src/main/resources/revisions/pulsar/1.json` | 798 | `8e11aa8fed65` |  |
| `annotations/src/main/resources/revisions/pulsar/2.json` | 809 | `b4fe066a5b46` |  |
| `annotations/src/main/resources/revisions/pulsar/3.json` | 872 | `13beda8c6527` |  |
| `annotations/src/main/resources/revisions/pulsar/4.json` | 918 | `a096f053f5f4` |  |
| `annotations/src/main/resources/revisions/pulsar/5.json` | 895 | `11cab51cb07b` |  |
| `annotations/src/main/resources/revisions/quad/0.json` | 906 | `fc978b70b65d` |  |
| `annotations/src/main/resources/revisions/quad/1.json` | 877 | `84b980170400` |  |
| `annotations/src/main/resources/revisions/quad/2.json` | 767 | `68046c035650` |  |
| `annotations/src/main/resources/revisions/quad/3.json` | 809 | `440976a594a9` |  |
| `annotations/src/main/resources/revisions/quad/4.json` | 844 | `2d15ed4a61cc` |  |
| `annotations/src/main/resources/revisions/quad/5.json` | 855 | `bac15bdcd2e5` |  |
| `annotations/src/main/resources/revisions/quad/6.json` | 918 | `a668a7a2dd18` |  |
| `annotations/src/main/resources/revisions/quad/7.json` | 964 | `1faa4d7c9904` |  |
| `annotations/src/main/resources/revisions/quad/8.json` | 941 | `2719e8d79b6a` |  |
| `annotations/src/main/resources/revisions/quasar/0.json` | 753 | `3ed6e798fe3e` |  |
| `annotations/src/main/resources/revisions/quasar/1.json` | 798 | `8e11aa8fed65` |  |
| `annotations/src/main/resources/revisions/quasar/2.json` | 809 | `b4fe066a5b46` |  |
| `annotations/src/main/resources/revisions/quasar/3.json` | 872 | `13beda8c6527` |  |
| `annotations/src/main/resources/revisions/quasar/4.json` | 918 | `a096f053f5f4` |  |
| `annotations/src/main/resources/revisions/quasar/5.json` | 895 | `11cab51cb07b` |  |
| `annotations/src/main/resources/revisions/risso/0.json` | 742 | `3f82cd17c691` |  |
| `annotations/src/main/resources/revisions/risso/1.json` | 713 | `f93868802533` |  |
| `annotations/src/main/resources/revisions/risso/2.json` | 619 | `4911298274e6` |  |
| `annotations/src/main/resources/revisions/risso/3.json` | 661 | `9530aa37e608` |  |
| `annotations/src/main/resources/revisions/risso/4.json` | 732 | `447693002c17` |  |
| `annotations/src/main/resources/revisions/risso/5.json` | 767 | `0ff9e3e8814e` |  |
| `annotations/src/main/resources/revisions/risso/6.json` | 778 | `576e99b7b15c` |  |
| `annotations/src/main/resources/revisions/risso/7.json` | 841 | `315cc3dbb0cc` |  |
| `annotations/src/main/resources/revisions/risso/8.json` | 887 | `9b062f2ee1c7` |  |
| `annotations/src/main/resources/revisions/risso/9.json` | 864 | `613a8ef2c406` |  |
| `annotations/src/main/resources/revisions/scuttler/0.json` | 768 | `47cac45f35d9` |  |
| `annotations/src/main/resources/revisions/scuttler/1.json` | 841 | `2bc22bb88335` |  |
| `annotations/src/main/resources/revisions/spiroct/0.json` | 821 | `f2d5568bfb88` |  |
| `annotations/src/main/resources/revisions/spiroct/1.json` | 792 | `93b2cd254b8e` |  |
| `annotations/src/main/resources/revisions/spiroct/2.json` | 690 | `ac0682f3bc45` |  |
| `annotations/src/main/resources/revisions/spiroct/3.json` | 732 | `19e19d95bde6` |  |
| `annotations/src/main/resources/revisions/spiroct/4.json` | 767 | `a510b27c607a` |  |
| `annotations/src/main/resources/revisions/spiroct/5.json` | 778 | `c2d4f61b4355` |  |
| `annotations/src/main/resources/revisions/spiroct/6.json` | 841 | `9afddbb993a2` |  |
| `annotations/src/main/resources/revisions/spiroct/7.json` | 887 | `a35baec56661` |  |
| `annotations/src/main/resources/revisions/spiroct/8.json` | 864 | `9d7b0c6197b2` |  |
| `annotations/src/main/resources/revisions/stell/0.json` | 831 | `edbb13dbbbc9` |  |
| `annotations/src/main/resources/revisions/stell/1.json` | 887 | `b40343e30594` |  |
| `annotations/src/main/resources/revisions/stell/2.json` | 864 | `a7af9c7d40c7` |  |
| `annotations/src/main/resources/revisions/toxopid/0.json` | 722 | `1b49642304c6` |  |
| `annotations/src/main/resources/revisions/toxopid/1.json` | 767 | `f66d2db6737b` |  |
| `annotations/src/main/resources/revisions/toxopid/2.json` | 778 | `7b6e53997f54` |  |
| `annotations/src/main/resources/revisions/toxopid/3.json` | 841 | `767ec5e1ac68` |  |
| `annotations/src/main/resources/revisions/toxopid/4.json` | 887 | `e805d2a7a0b7` |  |
| `annotations/src/main/resources/revisions/toxopid/5.json` | 864 | `af4c5d36ca8b` |  |
| `annotations/src/main/resources/revisions/vanquish/0.json` | 768 | `47cac45f35d9` |  |
| `annotations/src/main/resources/revisions/vanquish/1.json` | 841 | `2bc22bb88335` |  |
| `build.gradle` | 17440 | `2fe09e99cb2e` |  |
| `core/assets-raw/fontgen/config.json` | 56437 | `c45218f06879` |  |
| `core/assets-raw/sprites/blocks/environment/pack.json` | 165 | `79b2a46a13e7` |  |
| `core/assets-raw/sprites/pack.json` | 206 | `296a246731f0` |  |
| `core/assets-raw/sprites/rubble/pack.json` | 164 | `89f70a3e7e08` |  |
| `core/assets-raw/sprites/ui/pack.json` | 164 | `7f2b1029e56b` |  |
| `core/assets/bloomshaders/alpha_bloom.frag` | 551 | `dabc6caf3ae8` |  |
| `core/assets/bloomshaders/alpha_gaussian.frag` | 545 | `a5a345f4efac` |  |
| `core/assets/bloomshaders/alpha_threshold.frag` | 358 | `41ba6d299942` |  |
| `core/assets/bloomshaders/bloom.frag` | 418 | `265b365995e6` |  |
| `core/assets/bloomshaders/blurspace.vert` | 635 | `dda77b4d4518` |  |
| `core/assets/bloomshaders/gaussian.frag` | 571 | `6d9ee28b35d8` |  |
| `core/assets/bloomshaders/screenspace.vert` | 153 | `0bfd65c38928` |  |
| `core/assets/bloomshaders/threshold.frag` | 212 | `f8040140c272` |  |
| `core/assets/bundles/bundle.properties` | 167137 | `8dd74b07e55f` |  |
| `core/assets/bundles/bundle_be.properties` | 243267 | `bcb3fe7e2498` |  |
| `core/assets/bundles/bundle_bg.properties` | 247120 | `7d2eeabafe12` |  |
| `core/assets/bundles/bundle_ca.properties` | 191196 | `184f51c52eac` |  |
| `core/assets/bundles/bundle_cs.properties` | 180318 | `06ae8a35b8c8` |  |
| `core/assets/bundles/bundle_da.properties` | 170683 | `af20e8652b24` |  |
| `core/assets/bundles/bundle_de.properties` | 178902 | `d9ff049966e2` |  |
| `core/assets/bundles/bundle_es.properties` | 188329 | `3f714559cac7` |  |
| `core/assets/bundles/bundle_et.properties` | 172567 | `564a4c9f42dc` |  |
| `core/assets/bundles/bundle_eu.properties` | 179641 | `ae41755117aa` |  |
| `core/assets/bundles/bundle_fi.properties` | 179947 | `97b87523c67a` |  |
| `core/assets/bundles/bundle_fil.properties` | 178693 | `a0a97fffae82` |  |
| `core/assets/bundles/bundle_fr.properties` | 199065 | `4d9bec3f1ef5` |  |
| `core/assets/bundles/bundle_hu.properties` | 197132 | `75886196f9b6` |  |
| `core/assets/bundles/bundle_id_ID.properties` | 179226 | `da3b0d80e0ee` |  |
| `core/assets/bundles/bundle_it.properties` | 175160 | `2329b496f636` |  |
| `core/assets/bundles/bundle_ja.properties` | 208417 | `724b597c4ce6` |  |
| `core/assets/bundles/bundle_ko.properties` | 195774 | `8cffc72457c2` |  |
| `core/assets/bundles/bundle_lt.properties` | 175530 | `dea32568243b` |  |
| `core/assets/bundles/bundle_nl.properties` | 173028 | `d9ca9cf3ccdf` |  |
| `core/assets/bundles/bundle_nl_BE.properties` | 169420 | `60ca90a90169` |  |
| `core/assets/bundles/bundle_pl.properties` | 188774 | `5ce8ad800f6c` |  |
| `core/assets/bundles/bundle_pt_BR.properties` | 180816 | `cdf94da98014` |  |
| `core/assets/bundles/bundle_pt_PT.properties` | 181502 | `81ca852e2185` |  |
| `core/assets/bundles/bundle_ro.properties` | 176528 | `ea37f494a86c` |  |
| `core/assets/bundles/bundle_ru.properties` | 273735 | `302668c8e03a` |  |
| `core/assets/bundles/bundle_sr.properties` | 171593 | `256989b2e32a` |  |
| `core/assets/bundles/bundle_sv.properties` | 170443 | `30ef92610518` |  |
| `core/assets/bundles/bundle_th.properties` | 343868 | `e71e6fc8d1c3` |  |
| `core/assets/bundles/bundle_tk.properties` | 168367 | `5d284d12f64e` |  |
| `core/assets/bundles/bundle_tr.properties` | 176656 | `7b30f5242a4b` |  |
| `core/assets/bundles/bundle_uk_UA.properties` | 283110 | `41ae0bd58239` |  |
| `core/assets/bundles/bundle_vi.properties` | 210670 | `2c07cec3874c` |  |
| `core/assets/bundles/bundle_zh_CN.properties` | 158616 | `3d017333f4b1` |  |
| `core/assets/bundles/bundle_zh_TW.properties` | 162859 | `97ecb8fff730` |  |
| `core/assets/bundles/global.properties` | 1612 | `685898e4af10` |  |
| `core/assets/icons/icons.properties` | 25149 | `ebc33fdc23dc` |  |
| `core/assets/planets/serpulo.json` | 709 | `86706e562593` |  |
| `core/assets/scripts/base.js` | 1501 | `38eae7fcba32` |  |
| `core/assets/scripts/global.js` | 11737 | `b3ac97719843` |  |
| `core/assets/shaders/arkycite.frag` | 1319 | `be4694147906` |  |
| `core/assets/shaders/atmosphere.frag` | 2793 | `c8614d218b71` |  |
| `core/assets/shaders/atmosphere.vert` | 244 | `2abfe548178d` |  |
| `core/assets/shaders/blockbuild.frag` | 1764 | `4f3da816e1bb` |  |
| `core/assets/shaders/buildbeam.frag` | 479 | `51f8b13444a6` |  |
| `core/assets/shaders/caustics.frag` | 724 | `29ad86ed0291` |  |
| `core/assets/shaders/clouds.vert` | 464 | `659c09dd922d` |  |
| `core/assets/shaders/cryofluid.frag` | 991 | `f1fa6afeac6d` |  |
| `core/assets/shaders/cubemap.frag` | 131 | `d51df1d4e178` |  |
| `core/assets/shaders/cubemap.vert` | 207 | `508c55b11dea` |  |
| `core/assets/shaders/darkness.frag` | 213 | `51910afc24e8` |  |
| `core/assets/shaders/default.frag` | 257 | `0f71d87e8511` |  |
| `core/assets/shaders/default.vert` | 302 | `4f8733c3b0d4` |  |
| `core/assets/shaders/fog.frag` | 296 | `5f37687572e6` |  |
| `core/assets/shaders/light.frag` | 248 | `f2851ace8c04` |  |
| `core/assets/shaders/mesh.vert` | 192 | `3ea84012b51f` |  |
| `core/assets/shaders/mud.frag` | 795 | `207d9c3e76a0` |  |
| `core/assets/shaders/planet.frag` | 62 | `98bfd1a74ea3` |  |
| `core/assets/shaders/planet.vert` | 1151 | `1ca1e5ae63d6` |  |
| `core/assets/shaders/planetgrid.frag` | 198 | `0c329d5eb966` |  |
| `core/assets/shaders/planetgrid.vert` | 256 | `80a11b0bdcfd` |  |
| `core/assets/shaders/screenspace.frag` | 123 | `c7b6a5c6ded2` |  |
| `core/assets/shaders/screenspace.vert` | 159 | `a3ad65f33b1b` |  |
| `core/assets/shaders/shield.frag` | 1128 | `a8a79197e741` |  |
| `core/assets/shaders/shockwave.frag` | 1164 | `8497caa03140` |  |
| `core/assets/shaders/slag.frag` | 1131 | `60a19a0fa12a` |  |
| `core/assets/shaders/space.frag` | 528 | `b3f9716ba1b5` |  |
| `core/assets/shaders/tar.frag` | 713 | `1d6de985f969` |  |
| `core/assets/shaders/unitarmor.frag` | 476 | `e8cf56680c4f` |  |
| `core/assets/shaders/unitbuild.frag` | 616 | `f6346945bbb6` |  |
| `core/assets/shaders/unlit.vert` | 223 | `d782cb3404a6` |  |
| `core/assets/shaders/unlitwhite.vert` | 223 | `a70378f4f27e` |  |
| `core/assets/shaders/water.frag` | 1097 | `2d50e36e10bc` |  |
| `core/build.gradle` | 142 | `cf0fa62bf9a7` |  |
| `core/src/mindustry/ClientLauncher.java` | 11320 | `8eb0a4bd6525` | mindustry; class ClientLauncher |
| `core/src/mindustry/Vars.java` | 23562 | `f9050c7b2819` | mindustry; class Vars |
| `core/src/mindustry/ai/Astar.java` | 3470 | `f4787dc6251e` | mindustry.ai; class Astar, interface DistanceHeuristic, interface TileHeuristic |
| `core/src/mindustry/ai/BaseBuilderAI.java` | 9726 | `2279484060e7` | mindustry.ai; class BaseBuilderAI |
| `core/src/mindustry/ai/BaseRegistry.java` | 4706 | `48459232a2dc` | mindustry.ai; class BaseRegistry, class BasePart |
| `core/src/mindustry/ai/BlockIndexer.java` | 24454 | `90f3c23d59c2` | mindustry.ai; class BlockIndexer |
| `core/src/mindustry/ai/ControlPathfinder.java` | 66890 | `bf830e036896` | mindustry.ai; class ControlPathfinder, class PathRequest, class FieldCache, class Cluster |
| `core/src/mindustry/ai/ItemUnitStance.java` | 1097 | `ee1ed6a2a4f8` | mindustry.ai; class ItemUnitStance |
| `core/src/mindustry/ai/PathfindQueue.java` | 5116 | `46b0e48d007c` | mindustry.ai; class PathfindQueue |
| `core/src/mindustry/ai/Pathfinder.java` | 26682 | `9cc2d62bac53` | mindustry.ai; class Pathfinder, class EnemyCoreField |
| `core/src/mindustry/ai/RtsAI.java` | 13459 | `2418efb41f7e` | mindustry.ai; class RtsAI |
| `core/src/mindustry/ai/UnitCommand.java` | 4719 | `186c655e1dee` | mindustry.ai; class UnitCommand |
| `core/src/mindustry/ai/UnitGroup.java` | 7430 | `5fe8a2f34853` | mindustry.ai; class UnitGroup |
| `core/src/mindustry/ai/UnitStance.java` | 3807 | `f2649ac67ef7` | mindustry.ai; class UnitStance |
| `core/src/mindustry/ai/WaveSpawner.java` | 8617 | `9524e55aa564` | mindustry.ai; class WaveSpawner, interface SpawnConsumer |
| `core/src/mindustry/ai/types/AssemblerAI.java` | 587 | `7a51a980ebf5` | mindustry.ai.types; class AssemblerAI |
| `core/src/mindustry/ai/types/BoostAI.java` | 651 | `3cfa594f7a36` | mindustry.ai.types; class BoostAI |
| `core/src/mindustry/ai/types/BuilderAI.java` | 10455 | `dfe8de0b10c5` | mindustry.ai.types; class BuilderAI |
| `core/src/mindustry/ai/types/CargoAI.java` | 6459 | `df8922bdfa56` | mindustry.ai.types; class CargoAI |
| `core/src/mindustry/ai/types/CommandAI.java` | 22895 | `2b1c6700fad7` | mindustry.ai.types; class CommandAI |
| `core/src/mindustry/ai/types/DefenderAI.java` | 1381 | `1543d3f22ccb` | mindustry.ai.types; class DefenderAI |
| `core/src/mindustry/ai/types/FlyingAI.java` | 2688 | `83baaae06cd1` | mindustry.ai.types; class FlyingAI |
| `core/src/mindustry/ai/types/FlyingFollowAI.java` | 1765 | `8cb6838f1584` | mindustry.ai.types; class FlyingFollowAI |
| `core/src/mindustry/ai/types/GroundAI.java` | 3018 | `cce358e9d4fe` | mindustry.ai.types; class GroundAI |
| `core/src/mindustry/ai/types/HugAI.java` | 2091 | `722584768fab` | mindustry.ai.types; class HugAI |
| `core/src/mindustry/ai/types/LogicAI.java` | 5179 | `488ea01c4d16` | mindustry.ai.types; class LogicAI |
| `core/src/mindustry/ai/types/MinerAI.java` | 3439 | `6280431b9414` | mindustry.ai.types; class MinerAI |
| `core/src/mindustry/ai/types/MissileAI.java` | 1625 | `d206f61beab7` | mindustry.ai.types; class MissileAI |
| `core/src/mindustry/ai/types/PrebuildAI.java` | 9004 | `44f9d736f642` | mindustry.ai.types; class PrebuildAI |
| `core/src/mindustry/ai/types/RepairAI.java` | 2414 | `35e1bd37af57` | mindustry.ai.types; class RepairAI |
| `core/src/mindustry/ai/types/SuicideAI.java` | 3735 | `a13bbd04d438` | mindustry.ai.types; class SuicideAI |
| `core/src/mindustry/async/AsyncCore.java` | 2321 | `3583d1e4f5e4` | mindustry.async; class AsyncCore |
| `core/src/mindustry/async/AsyncProcess.java` | 515 | `3cd5668db426` | mindustry.async; interface AsyncProcess |
| `core/src/mindustry/async/AvoidanceProcess.java` | 3310 | `73492e75d621` | mindustry.async; class AvoidanceProcess |
| `core/src/mindustry/async/PhysicsProcess.java` | 6566 | `93a007d9ccb8` | mindustry.async; class PhysicsProcess, class PhysicRef, class PhysicsWorld, class PhysicsBody |
| `core/src/mindustry/audio/SoundControl.java` | 11215 | `f5d17818d20b` | mindustry.audio; class SoundControl |
| `core/src/mindustry/audio/SoundLoop.java` | 1513 | `8a3694c16ac3` | mindustry.audio; class SoundLoop |
| `core/src/mindustry/audio/SoundPriority.java` | 3129 | `bb663cae387f` | mindustry.audio; class SoundPriority |
| `core/src/mindustry/content/Blocks.java` | 255282 | `622764961f69` | mindustry.content; class Blocks |
| `core/src/mindustry/content/Bullets.java` | 1661 | `1f130ba3a4db` | mindustry.content; class Bullets |
| `core/src/mindustry/content/ErekirTechTree.java` | 19892 | `20934503b0dd` | mindustry.content; class ErekirTechTree |
| `core/src/mindustry/content/Fx.java` | 99543 | `589680bd1770` | mindustry.content; class Fx |
| `core/src/mindustry/content/Items.java` | 4436 | `db7108654014` | mindustry.content; class Items |
| `core/src/mindustry/content/Liquids.java` | 2950 | `8cac075d9749` | mindustry.content; class Liquids |
| `core/src/mindustry/content/Loadouts.java` | 899 | `78962a0077f9` | mindustry.content; class Loadouts |
| `core/src/mindustry/content/Planets.java` | 7647 | `abe40e035f3e` | mindustry.content; class Planets |
| `core/src/mindustry/content/SectorPresets.java` | 6907 | `b6c2024d8155` | mindustry.content; class SectorPresets |
| `core/src/mindustry/content/SerpuloTechTree.java` | 32656 | `f9b5986cf56f` | mindustry.content; class SerpuloTechTree |
| `core/src/mindustry/content/StatusEffects.java` | 6733 | `177c1920f754` | mindustry.content; class StatusEffects |
| `core/src/mindustry/content/TeamEntries.java` | 325 | `df5cda38489e` | mindustry.content; class TeamEntries |
| `core/src/mindustry/content/TechTree.java` | 7861 | `1da43307c60d` | mindustry.content; class TechTree, class TechNode |
| `core/src/mindustry/content/UnitTypes.java` | 155481 | `5eb17ac4e578` | mindustry.content; class UnitTypes |
| `core/src/mindustry/content/Weathers.java` | 3578 | `7654933a97a3` | mindustry.content; class Weathers |
| `core/src/mindustry/core/ContentLoader.java` | 11963 | `2f2cbbca4cb4` | mindustry.core; class ContentLoader |
| `core/src/mindustry/core/Control.java` | 28847 | `3b78a12fba62` | mindustry.core; class Control |
| `core/src/mindustry/core/FileTree.java` | 3278 | `0a49994e8b67` | mindustry.core; class FileTree |
| `core/src/mindustry/core/GameState.java` | 3648 | `a1ccd9e9e3dd` | mindustry.core; class GameState, enum State |
| `core/src/mindustry/core/Logic.java` | 21769 | `9d912758182a` | mindustry.core; class Logic |
| `core/src/mindustry/core/NetClient.java` | 25949 | `f8eebceb4c89` | mindustry.core; class NetClient |
| `core/src/mindustry/core/NetServer.java` | 52539 | `c5a7880300fb` | mindustry.core; class NetServer |
| `core/src/mindustry/core/PerfCounter.java` | 1293 | `e12a9b758ffe` | mindustry.core; enum PerfCounter |
| `core/src/mindustry/core/Platform.java` | 5827 | `bc677e4d61a7` | mindustry.core; interface Platform, interface FileWriter |
| `core/src/mindustry/core/Renderer.java` | 20823 | `4bafb3ca964d` | mindustry.core; class Renderer |
| `core/src/mindustry/core/UI.java` | 30545 | `b2552c808749` | mindustry.core; class UI |
| `core/src/mindustry/core/Version.java` | 3500 | `142c2ade04fd` | mindustry.core; class Version |
| `core/src/mindustry/core/World.java` | 20519 | `b511b7c7d90c` | mindustry.core; class World, class Context, class FilterContext |
| `core/src/mindustry/ctype/Content.java` | 2361 | `a8d3174891c7` | mindustry.ctype; class Content, class ModContentInfo |
| `core/src/mindustry/ctype/ContentType.java` | 923 | `2b76ba14d4a8` | mindustry.ctype; enum ContentType |
| `core/src/mindustry/ctype/MappableContent.java` | 391 | `27db3e2953de` | mindustry.ctype; class MappableContent |
| `core/src/mindustry/ctype/UnlockableContent.java` | 10702 | `b1395d40063f` | mindustry.ctype; class UnlockableContent |
| `core/src/mindustry/editor/BannedContentDialog.java` | 7722 | `c11f6fd0bed7` | mindustry.editor; class BannedContentDialog |
| `core/src/mindustry/editor/DrawOperation.java` | 4029 | `672ca7c6e0eb` | mindustry.editor; class DrawOperation, class TileOpStruct, class TileOpDataStruct |
| `core/src/mindustry/editor/EditorRenderer.java` | 8547 | `bb30599fb615` | mindustry.editor; class EditorRenderer |
| `core/src/mindustry/editor/EditorSpriteCache.java` | 5312 | `f2e06bac5632` | mindustry.editor; class EditorSpriteCache |
| `core/src/mindustry/editor/EditorTile.java` | 5219 | `3a34de776078` | mindustry.editor; class EditorTile |
| `core/src/mindustry/editor/EditorTool.java` | 12991 | `1327bac77853` | mindustry.editor; enum EditorTool |
| `core/src/mindustry/editor/MapEditor.java` | 14104 | `e673617f5faa` | mindustry.editor; class MapEditor, class Context |
| `core/src/mindustry/editor/MapEditorDialog.java` | 31152 | `c3d0b0c9b27f` | mindustry.editor; class MapEditorDialog |
| `core/src/mindustry/editor/MapGenerateDialog.java` | 16284 | `579c90535378` | mindustry.editor; class MapGenerateDialog |
| `core/src/mindustry/editor/MapInfoDialog.java` | 4553 | `4a773243d58d` | mindustry.editor; class MapInfoDialog |
| `core/src/mindustry/editor/MapLoadDialog.java` | 2032 | `4d67c548423d` | mindustry.editor; class MapLoadDialog |
| `core/src/mindustry/editor/MapLocalesDialog.java` | 29372 | `7be9af6d9da0` | mindustry.editor; class MapLocalesDialog |
| `core/src/mindustry/editor/MapObjectivesCanvas.java` | 20810 | `17a8d874e797` | mindustry.editor; class MapObjectivesCanvas, class ObjectiveTilemap, class ObjectiveTile, class Mover, class Connector |
| `core/src/mindustry/editor/MapObjectivesDialog.java` | 33961 | `fe6f165da71b` | mindustry.editor; class MapObjectivesDialog |
| `core/src/mindustry/editor/MapPatchesDialog.java` | 5759 | `964921ae7fa2` | mindustry.editor; class MapPatchesDialog |
| `core/src/mindustry/editor/MapProcessorsDialog.java` | 5857 | `be2a1e470246` | mindustry.editor; class MapProcessorsDialog |
| `core/src/mindustry/editor/MapResizeDialog.java` | 2078 | `ad634017c20d` | mindustry.editor; class MapResizeDialog, interface ResizeListener |
| `core/src/mindustry/editor/MapView.java` | 12255 | `11a40a6cd542` | mindustry.editor; class MapView |
| `core/src/mindustry/editor/OperationStack.java` | 964 | `754fceec7006` | mindustry.editor; class OperationStack |
| `core/src/mindustry/editor/SectorGenerateDialog.java` | 3470 | `dee730e3ad4b` | mindustry.editor; class SectorGenerateDialog |
| `core/src/mindustry/editor/WaveGraph.java` | 11674 | `27de8fa07777` | mindustry.editor; class WaveGraph, enum Mode |
| `core/src/mindustry/editor/WaveInfoDialog.java` | 19768 | `86b676e7f93d` | mindustry.editor; class WaveInfoDialog, enum Sort |
| `core/src/mindustry/entities/Damage.java` | 27666 | `3e334b0d81a4` | mindustry.entities; class Damage |
| `core/src/mindustry/entities/Effect.java` | 10088 | `f7c2dd66ae7e` | mindustry.entities; class Effect, class EffectContainer |
| `core/src/mindustry/entities/EntityCollisions.java` | 7872 | `62226cc69514` | mindustry.entities; class EntityCollisions, interface SolidPred |
| `core/src/mindustry/entities/EntityGroup.java` | 7698 | `eb7a15fcb466` | mindustry.entities; class EntityGroup |
| `core/src/mindustry/entities/EntityIndexer.java` | 127 | `f7af77a9caa8` | mindustry.entities; interface EntityIndexer |
| `core/src/mindustry/entities/Fires.java` | 2430 | `31c6f5c4501b` | mindustry.entities; class Fires |
| `core/src/mindustry/entities/GroupDefs.java` | 803 | `925a70a801a8` | mindustry.entities; class GroupDefs |
| `core/src/mindustry/entities/Leg.java` | 208 | `4e9cb01a9cd0` | mindustry.entities; class Leg |
| `core/src/mindustry/entities/LegDestroyData.java` | 309 | `5a3784366d8c` | mindustry.entities; class LegDestroyData |
| `core/src/mindustry/entities/Lightning.java` | 4124 | `c8475d02444f` | mindustry.entities; class Lightning |
| `core/src/mindustry/entities/Mover.java` | 154 | `e8ff16e66054` | mindustry.entities; interface Mover |
| `core/src/mindustry/entities/Predict.java` | 3553 | `98b809aad854` | mindustry.entities; class Predict |
| `core/src/mindustry/entities/Puddles.java` | 5218 | `49cfdf3c1173` | mindustry.entities; class Puddles |
| `core/src/mindustry/entities/Sized.java` | 118 | `816c84c096bb` | mindustry.entities; interface Sized |
| `core/src/mindustry/entities/TargetPriority.java` | 627 | `1b9312657ad4` | mindustry.entities; class TargetPriority |
| `core/src/mindustry/entities/UnitSorts.java` | 916 | `2b4066711b41` | mindustry.entities; class UnitSorts |
| `core/src/mindustry/entities/Units.java` | 19193 | `05c71d945b88` | mindustry.entities; class Units, interface Sortf, interface BuildingPriorityf, class UnitSyncContainer |
| `core/src/mindustry/entities/abilities/Ability.java` | 1944 | `5b0d9a01c262` | mindustry.entities.abilities; class Ability |
| `core/src/mindustry/entities/abilities/ArmorPlateAbility.java` | 2458 | `aa24ef246ca9` | mindustry.entities.abilities; class ArmorPlateAbility |
| `core/src/mindustry/entities/abilities/EnergyFieldAbility.java` | 7126 | `8092787eee5e` | mindustry.entities.abilities; class EnergyFieldAbility |
| `core/src/mindustry/entities/abilities/ForceFieldAbility.java` | 4942 | `b6ea572a7f31` | mindustry.entities.abilities; class ForceFieldAbility |
| `core/src/mindustry/entities/abilities/LiquidExplodeAbility.java` | 1513 | `f3cd19662d89` | mindustry.entities.abilities; class LiquidExplodeAbility |
| `core/src/mindustry/entities/abilities/LiquidRegenAbility.java` | 2152 | `341175d7f4ec` | mindustry.entities.abilities; class LiquidRegenAbility |
| `core/src/mindustry/entities/abilities/MoveEffectAbility.java` | 1894 | `2b027a2bdfb1` | mindustry.entities.abilities; class MoveEffectAbility |
| `core/src/mindustry/entities/abilities/MoveLightningAbility.java` | 3917 | `41e2c8a1e5bc` | mindustry.entities.abilities; class MoveLightningAbility |
| `core/src/mindustry/entities/abilities/RegenAbility.java` | 926 | `674d73c20f08` | mindustry.entities.abilities; class RegenAbility |
| `core/src/mindustry/entities/abilities/RepairFieldAbility.java` | 2954 | `0977ff83d831` | mindustry.entities.abilities; class RepairFieldAbility |
| `core/src/mindustry/entities/abilities/ShieldArcAbility.java` | 9580 | `ad99888a6daf` | mindustry.entities.abilities; class ShieldArcAbility |
| `core/src/mindustry/entities/abilities/ShieldRegenFieldAbility.java` | 2243 | `8827ea67b827` | mindustry.entities.abilities; class ShieldRegenFieldAbility |
| `core/src/mindustry/entities/abilities/SpawnDeathAbility.java` | 1453 | `9cfcddb251eb` | mindustry.entities.abilities; class SpawnDeathAbility |
| `core/src/mindustry/entities/abilities/StatusFieldAbility.java` | 2000 | `11cb21564050` | mindustry.entities.abilities; class StatusFieldAbility |
| `core/src/mindustry/entities/abilities/SuppressionFieldAbility.java` | 3013 | `39ec23cd9bc6` | mindustry.entities.abilities; class SuppressionFieldAbility |
| `core/src/mindustry/entities/abilities/UnitSpawnAbility.java` | 2407 | `5f3ae6989dfe` | mindustry.entities.abilities; class UnitSpawnAbility |
| `core/src/mindustry/entities/bullet/ArtilleryBulletType.java` | 1446 | `0b45707a2da4` | mindustry.entities.bullet; class ArtilleryBulletType |
| `core/src/mindustry/entities/bullet/BasicBulletType.java` | 2218 | `0d3434d3f8f8` | mindustry.entities.bullet; class BasicBulletType |
| `core/src/mindustry/entities/bullet/BombBulletType.java` | 740 | `a8de3ee02350` | mindustry.entities.bullet; class BombBulletType |
| `core/src/mindustry/entities/bullet/BulletType.java` | 42698 | `178612fd8bcd` | mindustry.entities.bullet; class BulletType |
| `core/src/mindustry/entities/bullet/ContinuousBulletType.java` | 2443 | `5c96fabd4a42` | mindustry.entities.bullet; class ContinuousBulletType |
| `core/src/mindustry/entities/bullet/ContinuousFlameBulletType.java` | 3415 | `77bd142471e6` | mindustry.entities.bullet; class ContinuousFlameBulletType |
| `core/src/mindustry/entities/bullet/ContinuousLaserBulletType.java` | 2909 | `7c537c4d88f9` | mindustry.entities.bullet; class ContinuousLaserBulletType |
| `core/src/mindustry/entities/bullet/EmpBulletType.java` | 2873 | `3120c4396bfb` | mindustry.entities.bullet; class EmpBulletType |
| `core/src/mindustry/entities/bullet/EmptyBulletType.java` | 247 | `fe68883f1494` | mindustry.entities.bullet; class EmptyBulletType |
| `core/src/mindustry/entities/bullet/ExplosionBulletType.java` | 829 | `3f58da5cf5be` | mindustry.entities.bullet; class ExplosionBulletType |
| `core/src/mindustry/entities/bullet/FireBulletType.java` | 1605 | `65a9dad1ade2` | mindustry.entities.bullet; class FireBulletType |
| `core/src/mindustry/entities/bullet/FlakBulletType.java` | 1522 | `0723bb6d42d9` | mindustry.entities.bullet; class FlakBulletType |
| `core/src/mindustry/entities/bullet/InterceptorBulletType.java` | 1598 | `b023b84cf24e` | mindustry.entities.bullet; class InterceptorBulletType |
| `core/src/mindustry/entities/bullet/LaserBoltBulletType.java` | 948 | `5e35741bf65d` | mindustry.entities.bullet; class LaserBoltBulletType |
| `core/src/mindustry/entities/bullet/LaserBulletType.java` | 3983 | `c7a89d71573d` | mindustry.entities.bullet; class LaserBulletType |
| `core/src/mindustry/entities/bullet/LightningBulletType.java` | 1069 | `5e307848aa59` | mindustry.entities.bullet; class LightningBulletType |
| `core/src/mindustry/entities/bullet/LiquidBulletType.java` | 3011 | `b0180e357d91` | mindustry.entities.bullet; class LiquidBulletType |
| `core/src/mindustry/entities/bullet/MassDriverBolt.java` | 3313 | `843a2133bf3f` | mindustry.entities.bullet; class MassDriverBolt |
| `core/src/mindustry/entities/bullet/MissileBulletType.java` | 717 | `86fca9d59a2d` | mindustry.entities.bullet; class MissileBulletType |
| `core/src/mindustry/entities/bullet/MultiBulletType.java` | 1643 | `39af8ff32465` | mindustry.entities.bullet; class MultiBulletType |
| `core/src/mindustry/entities/bullet/PointBulletType.java` | 1815 | `0cabdef170af` | mindustry.entities.bullet; class PointBulletType |
| `core/src/mindustry/entities/bullet/PointLaserBulletType.java` | 3729 | `d7bc4cdf4dbc` | mindustry.entities.bullet; class PointLaserBulletType |
| `core/src/mindustry/entities/bullet/RailBulletType.java` | 2587 | `e84061bf600d` | mindustry.entities.bullet; class RailBulletType |
| `core/src/mindustry/entities/bullet/SapBulletType.java` | 2609 | `3b36b3676df0` | mindustry.entities.bullet; class SapBulletType |
| `core/src/mindustry/entities/bullet/ShrapnelBulletType.java` | 2295 | `d739e9bdd487` | mindustry.entities.bullet; class ShrapnelBulletType |
| `core/src/mindustry/entities/bullet/SpaceLiquidBulletType.java` | 843 | `86d4b822ef6c` | mindustry.entities.bullet; class SpaceLiquidBulletType |
| `core/src/mindustry/entities/comp/BlockUnitComp.java` | 1752 | `0c4064a211e2` | mindustry.entities.comp; class BlockUnitComp |
| `core/src/mindustry/entities/comp/BuilderComp.java` | 14505 | `3346ce58848b` | mindustry.entities.comp; class BuilderComp |
| `core/src/mindustry/entities/comp/BuildingComp.java` | 75637 | `2cdf6e82b589` | mindustry.entities.comp; class BuildingComp |
| `core/src/mindustry/entities/comp/BuildingTetherComp.java` | 597 | `1acb23690f8d` | mindustry.entities.comp; class BuildingTetherComp |
| `core/src/mindustry/entities/comp/BulletComp.java` | 13116 | `28454a555106` | mindustry.entities.comp; class BulletComp |
| `core/src/mindustry/entities/comp/ChildComp.java` | 1815 | `7623b0af56c8` | mindustry.entities.comp; class ChildComp |
| `core/src/mindustry/entities/comp/CrawlComp.java` | 3501 | `aede078e898e` | mindustry.entities.comp; class CrawlComp |
| `core/src/mindustry/entities/comp/DamageComp.java` | 137 | `80131718632d` | mindustry.entities.comp; class DamageComp |
| `core/src/mindustry/entities/comp/DecalComp.java` | 773 | `f4368a50c358` | mindustry.entities.comp; class DecalComp |
| `core/src/mindustry/entities/comp/DrawComp.java` | 243 | `ac42495c5cd5` | mindustry.entities.comp; class DrawComp |
| `core/src/mindustry/entities/comp/EffectStateComp.java` | 701 | `ae2262b8a130` | mindustry.entities.comp; class EffectStateComp |
| `core/src/mindustry/entities/comp/ElevationMoveComp.java` | 433 | `07973fa12511` | mindustry.entities.comp; class ElevationMoveComp |
| `core/src/mindustry/entities/comp/EntityComp.java` | 1290 | `69fa9ccf4b11` | mindustry.entities.comp; class EntityComp |
| `core/src/mindustry/entities/comp/FireComp.java` | 4350 | `87bb2156045b` | mindustry.entities.comp; class FireComp |
| `core/src/mindustry/entities/comp/HealthComp.java` | 2640 | `3dfd82478e5a` | mindustry.entities.comp; class HealthComp |
| `core/src/mindustry/entities/comp/HitboxComp.java` | 1569 | `fdfe1c7ddde2` | mindustry.entities.comp; class HitboxComp |
| `core/src/mindustry/entities/comp/ItemsComp.java` | 1207 | `fa379e4ced19` | mindustry.entities.comp; class ItemsComp |
| `core/src/mindustry/entities/comp/LaunchCoreComp.java` | 2119 | `182d824e4188` | mindustry.entities.comp; class LaunchCoreComp |
| `core/src/mindustry/entities/comp/LegsComp.java` | 9352 | `df0939cc9534` | mindustry.entities.comp; class LegsComp |
| `core/src/mindustry/entities/comp/MechComp.java` | 3585 | `8e4334da6d08` | mindustry.entities.comp; class MechComp |
| `core/src/mindustry/entities/comp/MinerComp.java` | 4258 | `fb3dc8ae977b` | mindustry.entities.comp; class MinerComp |
| `core/src/mindustry/entities/comp/OwnerComp.java` | 152 | `e0ece8294d49` | mindustry.entities.comp; class OwnerComp |
| `core/src/mindustry/entities/comp/PayloadComp.java` | 7993 | `b517880be094` | mindustry.entities.comp; class PayloadComp |
| `core/src/mindustry/entities/comp/PhysicsComp.java` | 978 | `774d5dc09716` | mindustry.entities.comp; class PhysicsComp |
| `core/src/mindustry/entities/comp/PlayerComp.java` | 16125 | `b1415895b278` | mindustry.entities.comp; class PlayerComp |
| `core/src/mindustry/entities/comp/PosComp.java` | 1543 | `250994d7cb10` | mindustry.entities.comp; class PosComp |
| `core/src/mindustry/entities/comp/PosTeamDef.java` | 220 | `c93762080730` | mindustry.entities.comp; class PosTeamDef |
| `core/src/mindustry/entities/comp/PowerGraphUpdaterComp.java` | 401 | `0d82ac88bd01` | mindustry.entities.comp; class PowerGraphUpdaterComp |
| `core/src/mindustry/entities/comp/PuddleComp.java` | 4286 | `43884dde4133` | mindustry.entities.comp; class PuddleComp |
| `core/src/mindustry/entities/comp/RotComp.java` | 208 | `711245850dcd` | mindustry.entities.comp; class RotComp |
| `core/src/mindustry/entities/comp/SegmentComp.java` | 4064 | `ab0ab732db86` | mindustry.entities.comp; class SegmentComp |
| `core/src/mindustry/entities/comp/ShieldComp.java` | 2384 | `957a153be7ff` | mindustry.entities.comp; class ShieldComp |
| `core/src/mindustry/entities/comp/ShielderComp.java` | 204 | `964e9e95f348` | mindustry.entities.comp; class ShielderComp |
| `core/src/mindustry/entities/comp/StatusComp.java` | 8904 | `84c379180a61` | mindustry.entities.comp; class StatusComp |
| `core/src/mindustry/entities/comp/SyncComp.java` | 1194 | `0df52cb225a5` | mindustry.entities.comp; class SyncComp |
| `core/src/mindustry/entities/comp/TankComp.java` | 4927 | `bf9228b05009` | mindustry.entities.comp; class TankComp |
| `core/src/mindustry/entities/comp/TeamComp.java` | 921 | `e939e50ab99c` | mindustry.entities.comp; class TeamComp |
| `core/src/mindustry/entities/comp/TimedComp.java` | 554 | `0ea7c736f341` | mindustry.entities.comp; class TimedComp |
| `core/src/mindustry/entities/comp/TimedKillComp.java` | 623 | `6bcb0545a39b` | mindustry.entities.comp; class TimedKillComp |
| `core/src/mindustry/entities/comp/TimerComp.java` | 329 | `e847321badde` | mindustry.entities.comp; class TimerComp |
| `core/src/mindustry/entities/comp/UnderwaterMoveComp.java` | 814 | `ed02aedc9dbe` | mindustry.entities.comp; class UnderwaterMoveComp |
| `core/src/mindustry/entities/comp/UnitComp.java` | 33147 | `d3c07ff29c55` | mindustry.entities.comp; class UnitComp |
| `core/src/mindustry/entities/comp/UnitTetherComp.java` | 1056 | `487e5c6c3aab` | mindustry.entities.comp; class UnitTetherComp |
| `core/src/mindustry/entities/comp/VelComp.java` | 2154 | `a506d028e7ae` | mindustry.entities.comp; class VelComp |
| `core/src/mindustry/entities/comp/WaterCrawlComp.java` | 1027 | `746a168a4323` | mindustry.entities.comp; class WaterCrawlComp |
| `core/src/mindustry/entities/comp/WaterMoveComp.java` | 2482 | `19ab0c146cee` | mindustry.entities.comp; class WaterMoveComp |
| `core/src/mindustry/entities/comp/WeaponsComp.java` | 2561 | `1fb98593f50b` | mindustry.entities.comp; class WeaponsComp |
| `core/src/mindustry/entities/comp/WorldLabelComp.java` | 3517 | `165aad2dd6a0` | mindustry.entities.comp; class WorldLabelComp |
| `core/src/mindustry/entities/effect/ExplosionEffect.java` | 1612 | `f12625cf426f` | mindustry.entities.effect; class ExplosionEffect |
| `core/src/mindustry/entities/effect/MultiEffect.java` | 574 | `0e0d43b85e98` | mindustry.entities.effect; class MultiEffect |
| `core/src/mindustry/entities/effect/ParticleEffect.java` | 3930 | `34d186aad19b` | mindustry.entities.effect; class ParticleEffect |
| `core/src/mindustry/entities/effect/RadialEffect.java` | 1415 | `5955c1b01be1` | mindustry.entities.effect; class RadialEffect |
| `core/src/mindustry/entities/effect/SeqEffect.java` | 1188 | `2093a6488eaa` | mindustry.entities.effect; class SeqEffect |
| `core/src/mindustry/entities/effect/SoundEffect.java` | 1378 | `2a139ab7ca85` | mindustry.entities.effect; class SoundEffect |
| `core/src/mindustry/entities/effect/WaveEffect.java` | 1497 | `df42a7d2ee20` | mindustry.entities.effect; class WaveEffect |
| `core/src/mindustry/entities/effect/WrapEffect.java` | 988 | `9c7df4975ec7` | mindustry.entities.effect; class WrapEffect |
| `core/src/mindustry/entities/part/DrawPart.java` | 6360 | `8bc0ff674b1b` | mindustry.entities.part; class DrawPart, class PartParams, class PartMove, interface PartProgress, interface PartFunc |
| `core/src/mindustry/entities/part/EffectSpawnerPart.java` | 2715 | `0ae7367af94f` | mindustry.entities.part; class EffectSpawnerPart |
| `core/src/mindustry/entities/part/FlarePart.java` | 1675 | `6dd002c47537` | mindustry.entities.part; class FlarePart |
| `core/src/mindustry/entities/part/HaloPart.java` | 3357 | `d6e4c30ca061` | mindustry.entities.part; class HaloPart |
| `core/src/mindustry/entities/part/HoverPart.java` | 1525 | `0c482e575de0` | mindustry.entities.part; class HoverPart |
| `core/src/mindustry/entities/part/RegionPart.java` | 8589 | `2c00330e8818` | mindustry.entities.part; class RegionPart |
| `core/src/mindustry/entities/part/ShapePart.java` | 2630 | `da96e9b25898` | mindustry.entities.part; class ShapePart |
| `core/src/mindustry/entities/pattern/ShootAlternate.java` | 1070 | `0eb52d97616d` | mindustry.entities.pattern; class ShootAlternate |
| `core/src/mindustry/entities/pattern/ShootBarrel.java` | 914 | `a5eaa2dc6ba4` | mindustry.entities.pattern; class ShootBarrel |
| `core/src/mindustry/entities/pattern/ShootHelix.java` | 854 | `9be2d81478b2` | mindustry.entities.pattern; class ShootHelix |
| `core/src/mindustry/entities/pattern/ShootMulti.java` | 1258 | `1cf8998f5258` | mindustry.entities.pattern; class ShootMulti |
| `core/src/mindustry/entities/pattern/ShootPattern.java` | 1997 | `c2ce40076eb9` | mindustry.entities.pattern; class ShootPattern, interface BulletHandler |
| `core/src/mindustry/entities/pattern/ShootSine.java` | 730 | `bd4b26fb3d90` | mindustry.entities.pattern; class ShootSine |
| `core/src/mindustry/entities/pattern/ShootSpread.java` | 763 | `7ab901bf08a1` | mindustry.entities.pattern; class ShootSpread |
| `core/src/mindustry/entities/pattern/ShootSummon.java` | 721 | `6df5400d08b8` | mindustry.entities.pattern; class ShootSummon |
| `core/src/mindustry/entities/units/AIController.java` | 14290 | `403faffe5b05` | mindustry.entities.units; class AIController |
| `core/src/mindustry/entities/units/BuildPlan.java` | 5920 | `94c95f001b6a` | mindustry.entities.units; class BuildPlan |
| `core/src/mindustry/entities/units/StatusEntry.java` | 574 | `45febf445f67` | mindustry.entities.units; class StatusEntry |
| `core/src/mindustry/entities/units/UnitController.java` | 534 | `a358f0a4dc65` | mindustry.entities.units; interface UnitController |
| `core/src/mindustry/entities/units/WeaponMount.java` | 2085 | `85c0b5428460` | mindustry.entities.units; class WeaponMount |
| `core/src/mindustry/game/AttackIndicators.java` | 1836 | `482c90b2364c` | mindustry.game; class AttackIndicators, class IndicatorStruct |
| `core/src/mindustry/game/CampaignRules.java` | 1756 | `5efa62a0f314` | mindustry.game; class CampaignRules |
| `core/src/mindustry/game/CampaignStats.java` | 1459 | `4daef0eea8fa` | mindustry.game; class CampaignStats |
| `core/src/mindustry/game/Difficulty.java` | 1612 | `b2b428a89778` | mindustry.game; enum Difficulty |
| `core/src/mindustry/game/EventType.java` | 23277 | `616cefcf74a0` | mindustry.game; class EventType, enum Trigger, class WinEvent, class LoseEvent, class ResizeEvent |
| `core/src/mindustry/game/FogControl.java` | 18463 | `b53da3335228` | mindustry.game; class FogControl, class StaticFogThread, class DynamicFogThread, class FogData, class FogEventStruct |
| `core/src/mindustry/game/GameStats.java` | 1390 | `c3e0c4fcd2f5` | mindustry.game; class GameStats |
| `core/src/mindustry/game/Gamemode.java` | 2257 | `dd332dc25dd1` | mindustry.game; enum Gamemode |
| `core/src/mindustry/game/MapMarkers.java` | 2155 | `b0396047d774` | mindustry.game; class MapMarkers |
| `core/src/mindustry/game/MapObjectives.java` | 51223 | `34a4d51feeae` | mindustry.game; class MapObjectives, class MapObjective, class ResearchObjective, class ProduceObjective, class ItemObjective |
| `core/src/mindustry/game/Objectives.java` | 4009 | `f366b4051c4f` | mindustry.game; class Objectives, class Research, class Produce, class SectorComplete, class OnSector |
| `core/src/mindustry/game/Rules.java` | 18423 | `f521477ca84f` | mindustry.game; class Rules, class TeamRule, class TeamRules |
| `core/src/mindustry/game/Saves.java` | 15572 | `2e6c02e044d0` | mindustry.game; class Saves, class Remap, class SaveSlot |
| `core/src/mindustry/game/Schematic.java` | 4021 | `8f4ea746ff11` | mindustry.game; class Schematic, class Stile |
| `core/src/mindustry/game/Schematics.java` | 27285 | `48d706f250a7` | mindustry.game; class Schematics |
| `core/src/mindustry/game/SectorInfo.java` | 13712 | `6a6bdf3dacf0` | mindustry.game; class SectorInfo, class ExportStat |
| `core/src/mindustry/game/SpawnGroup.java` | 7519 | `03c94f204e0e` | mindustry.game; class SpawnGroup |
| `core/src/mindustry/game/Team.java` | 5973 | `87bf6e5e8a7f` | mindustry.game; class Team |
| `core/src/mindustry/game/Teams.java` | 16700 | `d7c1e0aa0e9b` | mindustry.game; class Teams, class TeamData, class BlockPlan |
| `core/src/mindustry/game/Universe.java` | 11834 | `0e44734d440c` | mindustry.game; class Universe |
| `core/src/mindustry/game/Waves.java` | 13524 | `a040b95c7959` | mindustry.game; class Waves |
| `core/src/mindustry/graphics/BlockRenderer.java` | 22682 | `18c48fb407fb` | mindustry.graphics; class BlockRenderer |
| `core/src/mindustry/graphics/CacheLayer.java` | 3313 | `41ae5b2cf295` | mindustry.graphics; class CacheLayer, class ShaderLayer |
| `core/src/mindustry/graphics/CubemapMesh.java` | 2096 | `98a6ba58c4ff` | mindustry.graphics; class CubemapMesh |
| `core/src/mindustry/graphics/DebugCollisionRenderer.java` | 3254 | `227f4f126be1` | mindustry.graphics; class DebugCollisionRenderer |
| `core/src/mindustry/graphics/Drawf.java` | 22485 | `3f4a10519cd9` | mindustry.graphics; class Drawf |
| `core/src/mindustry/graphics/EnvRenderers.java` | 3912 | `93a5c56f77d0` | mindustry.graphics; class EnvRenderers |
| `core/src/mindustry/graphics/FloorRenderer.java` | 18673 | `73c3ce0e1fa5` | mindustry.graphics; class FloorRenderer, class ChunkMesh, class FloorRenderBatch |
| `core/src/mindustry/graphics/FogRenderer.java` | 5374 | `054a53dd811d` | mindustry.graphics; class FogRenderer |
| `core/src/mindustry/graphics/IntelGpuCheck.java` | 1355 | `61d22029efa7` | mindustry.graphics; class IntelGpuCheck |
| `core/src/mindustry/graphics/InverseKinematics.java` | 1898 | `dd78717a743d` | mindustry.graphics; class InverseKinematics |
| `core/src/mindustry/graphics/Layer.java` | 2262 | `6d2890d33da1` | mindustry.graphics; class Layer |
| `core/src/mindustry/graphics/LightRenderer.java` | 6809 | `1f6d3e0c21e7` | mindustry.graphics; class LightRenderer, class CircleLight |
| `core/src/mindustry/graphics/LoadRenderer.java` | 21601 | `43d579cbae15` | mindustry.graphics; class LoadRenderer |
| `core/src/mindustry/graphics/MenuRenderer.java` | 9436 | `fa941f6c846c` | mindustry.graphics; class MenuRenderer |
| `core/src/mindustry/graphics/MinimapRenderer.java` | 14689 | `511bec72587d` | mindustry.graphics; class MinimapRenderer |
| `core/src/mindustry/graphics/MultiPacker.java` | 4535 | `8757da276d0d` | mindustry.graphics; class MultiPacker, enum PageType |
| `core/src/mindustry/graphics/NvGpuInfo.java` | 883 | `e1a13432407e` | mindustry.graphics; class NvGpuInfo |
| `core/src/mindustry/graphics/OverlayRenderer.java` | 11519 | `8357f9538b03` | mindustry.graphics; class OverlayRenderer, class CoreEdge |
| `core/src/mindustry/graphics/Pal.java` | 4970 | `18d7ef10ab37` | mindustry.graphics; class Pal |
| `core/src/mindustry/graphics/ParticleRenderer.java` | 6585 | `45ff43acc8b6` | mindustry.graphics; class ParticleRenderer |
| `core/src/mindustry/graphics/Pixelator.java` | 1868 | `098867c1349d` | mindustry.graphics; class Pixelator |
| `core/src/mindustry/graphics/Shaders.java` | 16059 | `4e37589a0c84` | mindustry.graphics; class Shaders, class AtmosphereShader, class PlanetShader, class CloudShader, class MeshShader |
| `core/src/mindustry/graphics/Trail.java` | 4418 | `b9488b27e2f1` | mindustry.graphics; class Trail |
| `core/src/mindustry/graphics/Voronoi.java` | 18128 | `c33bab2bd323` | mindustry.graphics; class Voronoi, class Site, class Halfedge, class GraphEdge, class Edge |
| `core/src/mindustry/graphics/g3d/GenericMesh.java` | 201 | `a173323c52c5` | mindustry.graphics.g3d; interface GenericMesh |
| `core/src/mindustry/graphics/g3d/HexMesh.java` | 965 | `92e318f01eae` | mindustry.graphics.g3d; class HexMesh |
| `core/src/mindustry/graphics/g3d/HexMesher.java` | 495 | `9e8c61cad82d` | mindustry.graphics.g3d; interface HexMesher |
| `core/src/mindustry/graphics/g3d/HexSkyMesh.java` | 2162 | `34c51fe2fe37` | mindustry.graphics.g3d; class HexSkyMesh |
| `core/src/mindustry/graphics/g3d/MatMesh.java` | 661 | `9cedacc2d63d` | mindustry.graphics.g3d; class MatMesh |
| `core/src/mindustry/graphics/g3d/MeshBuilder.java` | 10408 | `71d5f7fddea9` | mindustry.graphics.g3d; class MeshBuilder |
| `core/src/mindustry/graphics/g3d/MultiMesh.java` | 526 | `f7b5f00d1f53` | mindustry.graphics.g3d; class MultiMesh |
| `core/src/mindustry/graphics/g3d/NoiseMesh.java` | 1747 | `92361fb25686` | mindustry.graphics.g3d; class NoiseMesh |
| `core/src/mindustry/graphics/g3d/PlanetGrid.java` | 8290 | `93470942b4db` | mindustry.graphics.g3d; class PlanetGrid, class Ptile, class Corner, class Edge |
| `core/src/mindustry/graphics/g3d/PlanetMesh.java` | 1159 | `9de188ec22d8` | mindustry.graphics.g3d; class PlanetMesh |
| `core/src/mindustry/graphics/g3d/PlanetParams.java` | 1550 | `578f883f01ec` | mindustry.graphics.g3d; class PlanetParams |
| `core/src/mindustry/graphics/g3d/PlanetRenderer.java` | 9599 | `259fe338fdef` | mindustry.graphics.g3d; class PlanetRenderer, interface PlanetInterfaceRenderer |
| `core/src/mindustry/graphics/g3d/ShaderSphereMesh.java` | 303 | `8a640e22aac0` | mindustry.graphics.g3d; class ShaderSphereMesh |
| `core/src/mindustry/graphics/g3d/SunMesh.java` | 922 | `1568f4cf855d` | mindustry.graphics.g3d; class SunMesh |
| `core/src/mindustry/input/Binding.java` | 6132 | `873aea15c457` | mindustry.input; class Binding |
| `core/src/mindustry/input/DesktopInput.java` | 40225 | `9b47fae05bd7` | mindustry.input; class DesktopInput |
| `core/src/mindustry/input/InputHandler.java` | 97042 | `75899b1de113` | mindustry.input; class InputHandler |
| `core/src/mindustry/input/MobileInput.java` | 39707 | `7b5cb83ab74a` | mindustry.input; class MobileInput |
| `core/src/mindustry/input/PlaceMode.java` | 111 | `b902be593d43` | mindustry.input; enum PlaceMode |
| `core/src/mindustry/input/Placement.java` | 17896 | `99f7f4511042` | mindustry.input; class Placement, class NormalizeDrawResult, class NormalizeResult |
| `core/src/mindustry/io/JsonIO.java` | 13729 | `b5064b7238b1` | mindustry.io; class JsonIO, class CustomJson |
| `core/src/mindustry/io/MapIO.java` | 9923 | `7ae87911060c` | mindustry.io; class MapIO |
| `core/src/mindustry/io/SaveFileReader.java` | 8333 | `d184d1002289` | mindustry.io; class SaveFileReader, interface IORunner, interface IORunnerLength, interface CustomChunk |
| `core/src/mindustry/io/SaveIO.java` | 6334 | `59667a3165f4` | mindustry.io; class SaveIO, class SaveException |
| `core/src/mindustry/io/SaveMeta.java` | 880 | `8d8152b59af8` | mindustry.io; class SaveMeta |
| `core/src/mindustry/io/SavePreviewLoader.java` | 615 | `fef2770ae0ad` | mindustry.io; class SavePreviewLoader |
| `core/src/mindustry/io/SaveVersion.java` | 23319 | `9cdef6cfbae1` | mindustry.io; class SaveVersion |
| `core/src/mindustry/io/TypeIO.java` | 44217 | `b608ee3aca8c` | mindustry.io; class TypeIO |
| `core/src/mindustry/io/versions/LegacyIO.java` | 1326 | `1a767e4e3576` | mindustry.io.versions; class LegacyIO |
| `core/src/mindustry/io/versions/LegacyRegionSaveVersion.java` | 864 | `c44b8e7d9444` | mindustry.io.versions; class LegacyRegionSaveVersion |
| `core/src/mindustry/io/versions/LegacySaveVersion.java` | 4409 | `e84564abe8af` | mindustry.io.versions; class LegacySaveVersion |
| `core/src/mindustry/io/versions/LegacySaveVersion2.java` | 868 | `b4c40d7fc649` | mindustry.io.versions; class LegacySaveVersion2 |
| `core/src/mindustry/io/versions/Save1.java` | 268 | `ccead8731930` | mindustry.io.versions; class Save1 |
| `core/src/mindustry/io/versions/Save10.java` | 226 | `7462b78abcb7` | mindustry.io.versions; class Save10 |
| `core/src/mindustry/io/versions/Save11.java` | 185 | `e0c1dc889bb7` | mindustry.io.versions; class Save11 |
| `core/src/mindustry/io/versions/Save2.java` | 268 | `a0a3f863c9aa` | mindustry.io.versions; class Save2 |
| `core/src/mindustry/io/versions/Save3.java` | 806 | `cb044e752c14` | mindustry.io.versions; class Save3 |
| `core/src/mindustry/io/versions/Save4.java` | 411 | `bbb6e6105014` | mindustry.io.versions; class Save4 |
| `core/src/mindustry/io/versions/Save5.java` | 196 | `48f5e263d8a7` | mindustry.io.versions; class Save5 |
| `core/src/mindustry/io/versions/Save6.java` | 184 | `280a2a0618a4` | mindustry.io.versions; class Save6 |
| `core/src/mindustry/io/versions/Save7.java` | 129 | `406602ca9c04` | mindustry.io.versions; class Save7 |
| `core/src/mindustry/io/versions/Save8.java` | 287 | `82e5ed0b90b8` | mindustry.io.versions; class Save8 |
| `core/src/mindustry/io/versions/Save9.java` | 349 | `b77722f20370` | mindustry.io.versions; class Save9 |
| `core/src/mindustry/io/versions/ShortChunkSaveVersion.java` | 5620 | `3512b4280e49` | mindustry.io.versions; class ShortChunkSaveVersion |
| `core/src/mindustry/logic/ConditionOp.java` | 1630 | `b7d740d1f982` | mindustry.logic; enum ConditionOp, interface CondObjOpLambda, interface CondOpLambda |
| `core/src/mindustry/logic/Controllable.java` | 306 | `397f4fdb5743` | mindustry.logic; interface Controllable |
| `core/src/mindustry/logic/CutsceneAction.java` | 143 | `7deae6fab49b` | mindustry.logic; enum CutsceneAction |
| `core/src/mindustry/logic/FetchType.java` | 210 | `a61b2636408e` | mindustry.logic; enum FetchType |
| `core/src/mindustry/logic/GlobalVars.java` | 11475 | `2eff7de4124e` | mindustry.logic; class GlobalVars, class VarEntry |
| `core/src/mindustry/logic/GlobalVarsDialog.java` | 2134 | `971cccdb43d9` | mindustry.logic; class GlobalVarsDialog |
| `core/src/mindustry/logic/LAccess.java` | 2033 | `d511ac342ad7` | mindustry.logic; enum LAccess |
| `core/src/mindustry/logic/LAssembler.java` | 5533 | `3e2d795f2aee` | mindustry.logic; class LAssembler |
| `core/src/mindustry/logic/LCanvas.java` | 24944 | `651d3c1e236d` | mindustry.logic; class LCanvas, class DragLayout, class StatementElem, class JumpButton |
| `core/src/mindustry/logic/LCategory.java` | 1526 | `17e675107930` | mindustry.logic; class LCategory |
| `core/src/mindustry/logic/LExecutor.java` | 86207 | `a0dd705281e7` | mindustry.logic; class LExecutor, interface LInstruction, class UnitBindI, class UnitLocateI, class Cache |
| `core/src/mindustry/logic/LLocate.java` | 147 | `17b99f9a1195` | mindustry.logic; enum LLocate |
| `core/src/mindustry/logic/LMarkerControl.java` | 879 | `85c777649679` | mindustry.logic; enum LMarkerControl |
| `core/src/mindustry/logic/LParser.java` | 6637 | `30fc6d82ba1e` | mindustry.logic; class LParser, class JumpIndex |
| `core/src/mindustry/logic/LReadable.java` | 137 | `083e1197784b` | mindustry.logic; interface LReadable |
| `core/src/mindustry/logic/LStatement.java` | 10019 | `54de67f067c7` | mindustry.logic; class LStatement |
| `core/src/mindustry/logic/LStatements.java` | 83536 | `08fe46cbf219` | mindustry.logic; class LStatements, class CommentStatement, class InvalidStatement, class ReadStatement, class WriteStatement |
| `core/src/mindustry/logic/LUnitControl.java` | 763 | `3a53e618dd3a` | mindustry.logic; enum LUnitControl |
| `core/src/mindustry/logic/LVar.java` | 3244 | `d383454f07c2` | mindustry.logic; class LVar |
| `core/src/mindustry/logic/LWritable.java` | 137 | `2e996653ee50` | mindustry.logic; interface LWritable |
| `core/src/mindustry/logic/LogicDialog.java` | 14392 | `5f7407ca023c` | mindustry.logic; class LogicDialog |
| `core/src/mindustry/logic/LogicFx.java` | 3979 | `9e7090d92e23` | mindustry.logic; class LogicFx, class EffectEntry |
| `core/src/mindustry/logic/LogicOp.java` | 3716 | `23753ce539d3` | mindustry.logic; enum LogicOp, interface OpObjLambda2, interface OpLambda2, interface OpLambda1 |
| `core/src/mindustry/logic/LogicRule.java` | 603 | `df159954c4af` | mindustry.logic; enum LogicRule |
| `core/src/mindustry/logic/MessageType.java` | 158 | `5ddf54f4eea3` | mindustry.logic; enum MessageType |
| `core/src/mindustry/logic/QueryShape.java` | 69 | `11773da79f14` | mindustry.logic; enum QueryShape |
| `core/src/mindustry/logic/QueryType.java` | 237 | `46084417f462` | mindustry.logic; enum QueryType |
| `core/src/mindustry/logic/RadarSort.java` | 575 | `a6c016249dc9` | mindustry.logic; enum RadarSort, interface RadarSortFunc |
| `core/src/mindustry/logic/RadarTarget.java` | 751 | `e927ddd99c2c` | mindustry.logic; enum RadarTarget, interface RadarTargetFunc |
| `core/src/mindustry/logic/Ranged.java` | 117 | `41a1cb0d5f53` | mindustry.logic; interface Ranged |
| `core/src/mindustry/logic/Senseable.java` | 302 | `1c8fb6b1e343` | mindustry.logic; interface Senseable |
| `core/src/mindustry/logic/Settable.java` | 233 | `041aa46aad43` | mindustry.logic; interface Settable |
| `core/src/mindustry/logic/TileLayer.java` | 181 | `cddc13f60808` | mindustry.logic; enum TileLayer |
| `core/src/mindustry/maps/Map.java` | 7540 | `2ef8eb54b60f` | mindustry.maps; class Map |
| `core/src/mindustry/maps/MapException.java` | 198 | `880db605d5b8` | mindustry.maps; class MapException |
| `core/src/mindustry/maps/MapPreviewLoader.java` | 3727 | `da1c18fba770` | mindustry.maps; class MapPreviewLoader, class MapPreviewParameter |
| `core/src/mindustry/maps/Maps.java` | 17142 | `9c3fcdb84c76` | mindustry.maps; class Maps, interface MapProvider, enum ShuffleMode |
| `core/src/mindustry/maps/SectorDamage.java` | 7081 | `9e7092802b18` | mindustry.maps; class SectorDamage |
| `core/src/mindustry/maps/SectorSubmissions.java` | 16145 | `b8c2bf21bcba` | mindustry.maps; class SectorSubmissions, class MapSubmission |
| `core/src/mindustry/maps/filters/BlendFilter.java` | 1771 | `c4f2886b9a5f` | mindustry.maps.filters; class BlendFilter |
| `core/src/mindustry/maps/filters/ClearFilter.java` | 1617 | `c119d2867f53` | mindustry.maps.filters; class ClearFilter |
| `core/src/mindustry/maps/filters/CoreSpawnFilter.java` | 1186 | `67ece2003cd5` | mindustry.maps.filters; class CoreSpawnFilter |
| `core/src/mindustry/maps/filters/DistortFilter.java` | 957 | `442c4e2fe5fd` | mindustry.maps.filters; class DistortFilter |
| `core/src/mindustry/maps/filters/EnemySpawnFilter.java` | 1129 | `8b1f41c680ea` | mindustry.maps.filters; class EnemySpawnFilter |
| `core/src/mindustry/maps/filters/FilterOption.java` | 6562 | `b96522a03e10` | mindustry.maps.filters; class FilterOption, class SliderOption, class BlockOption, class ToggleOption |
| `core/src/mindustry/maps/filters/GenerateFilter.java` | 6165 | `80e45c899ef1` | mindustry.maps.filters; class GenerateFilter, class GenerateInput, interface TileProvider, class PackTileStruct |
| `core/src/mindustry/maps/filters/LogicFilter.java` | 1411 | `ec9c49004532` | mindustry.maps.filters; class LogicFilter |
| `core/src/mindustry/maps/filters/MedianFilter.java` | 1654 | `42e78f00e0bf` | mindustry.maps.filters; class MedianFilter |
| `core/src/mindustry/maps/filters/MirrorFilter.java` | 3469 | `ba909a7f6b13` | mindustry.maps.filters; class MirrorFilter |
| `core/src/mindustry/maps/filters/NoiseFilter.java` | 1635 | `aaab9515660a` | mindustry.maps.filters; class NoiseFilter |
| `core/src/mindustry/maps/filters/OreFilter.java` | 1464 | `d08c8ff6cd99` | mindustry.maps.filters; class OreFilter |
| `core/src/mindustry/maps/filters/OreMedianFilter.java` | 2064 | `930c46eaf71c` | mindustry.maps.filters; class OreMedianFilter |
| `core/src/mindustry/maps/filters/RandomItemFilter.java` | 946 | `fb6387209ccf` | mindustry.maps.filters; class RandomItemFilter |
| `core/src/mindustry/maps/filters/RiverNoiseFilter.java` | 1911 | `5c90f754e558` | mindustry.maps.filters; class RiverNoiseFilter |
| `core/src/mindustry/maps/filters/ScatterFilter.java` | 1377 | `5bb997fb2bfa` | mindustry.maps.filters; class ScatterFilter |
| `core/src/mindustry/maps/filters/SpawnPathFilter.java` | 2262 | `97f2f884ea34` | mindustry.maps.filters; class SpawnPathFilter |
| `core/src/mindustry/maps/filters/TerrainFilter.java` | 1723 | `610569af20e9` | mindustry.maps.filters; class TerrainFilter |
| `core/src/mindustry/maps/generators/BaseGenerator.java` | 11215 | `4a2c0a73750d` | mindustry.maps.generators; class BaseGenerator |
| `core/src/mindustry/maps/generators/BasicGenerator.java` | 16331 | `35559274d29b` | mindustry.maps.generators; class BasicGenerator |
| `core/src/mindustry/maps/generators/BlankPlanetGenerator.java` | 619 | `b41c65395fbb` | mindustry.maps.generators; class BlankPlanetGenerator |
| `core/src/mindustry/maps/generators/FileMapGenerator.java` | 5192 | `861ed082fd24` | mindustry.maps.generators; class FileMapGenerator |
| `core/src/mindustry/maps/generators/PlanetGenerator.java` | 7376 | `a6f0324aa632` | mindustry.maps.generators; class PlanetGenerator |
| `core/src/mindustry/maps/generators/WorldGenerator.java` | 277 | `0e6c9c3e967b` | mindustry.maps.generators; interface WorldGenerator |
| `core/src/mindustry/maps/planet/AsteroidGenerator.java` | 5882 | `251b637b5f4c` | mindustry.maps.planet; class AsteroidGenerator |
| `core/src/mindustry/maps/planet/ErekirPlanetGenerator.java` | 16401 | `196f21cdcd2d` | mindustry.maps.planet; class ErekirPlanetGenerator |
| `core/src/mindustry/maps/planet/SerpuloPlanetGenerator.java` | 31866 | `ed998a43c14e` | mindustry.maps.planet; class SerpuloPlanetGenerator, class Room |
| `core/src/mindustry/maps/planet/TantrosPlanetGenerator.java` | 2847 | `77c6638e08ea` | mindustry.maps.planet; class TantrosPlanetGenerator |
| `core/src/mindustry/mod/ClassLoaderCloser.java` | 310 | `dda4ef033cf5` | mindustry.mod; class ClassLoaderCloser |
| `core/src/mindustry/mod/ClassMap.java` | 46787 | `73cc406ef762` | mindustry.mod; class ClassMap |
| `core/src/mindustry/mod/ContentParser.java` | 64073 | `dc58f1d96fd7` | mindustry.mod; class ContentParser |
| `core/src/mindustry/mod/DataPatcher.java` | 28918 | `3999159fab5f` | mindustry.mod; class DataPatcher |
| `core/src/mindustry/mod/Mod.java` | 1156 | `754bf2a7480f` | mindustry.mod; class Mod |
| `core/src/mindustry/mod/ModClassLoader.java` | 1409 | `3fc748968366` | mindustry.mod; class ModClassLoader |
| `core/src/mindustry/mod/ModListing.java` | 822 | `511408658725` | mindustry.mod; class ModListing |
| `core/src/mindustry/mod/Mods.java` | 59294 | `5c5b267b4954` | mindustry.mod; class Mods, class RegionEntry |
| `core/src/mindustry/mod/NoPatch.java` | 239 | `8bc72c672e40` | mindustry.mod;  |
| `core/src/mindustry/mod/Plugin.java` | 129 | `853c17128569` | mindustry.mod; class Plugin |
| `core/src/mindustry/mod/Scripts.java` | 5093 | `5b4e71bac1e9` | mindustry.mod; class Scripts, class ScriptModuleProvider |
| `core/src/mindustry/net/Administration.java` | 27256 | `9a73d43e17a2` | mindustry.net; class Administration, class Config |
| `core/src/mindustry/net/ArcNetProvider.java` | 21384 | `e63906ab0ec0` | mindustry.net; class ArcNetProvider, class ArcConnection, class PacketSerializer |
| `core/src/mindustry/net/BeControl.java` | 8204 | `e08b57cb03ec` | mindustry.net; class BeControl |
| `core/src/mindustry/net/CrashHandler.java` | 6791 | `164f4d31b10d` | mindustry.net; class CrashHandler |
| `core/src/mindustry/net/Host.java` | 1423 | `8814ae506d4f` | mindustry.net; class Host |
| `core/src/mindustry/net/Net.java` | 14148 | `88fc1c83985c` | mindustry.net; class Net, interface NetProvider |
| `core/src/mindustry/net/NetConnection.java` | 3797 | `2d3d59379193` | mindustry.net; class NetConnection |
| `core/src/mindustry/net/NetworkIO.java` | 5990 | `274db07e08a7` | mindustry.net; class NetworkIO |
| `core/src/mindustry/net/Packet.java` | 1180 | `94188c6928f7` | mindustry.net; class Packet |
| `core/src/mindustry/net/Packets.java` | 4580 | `dd12ca6fc004` | mindustry.net; class Packets, enum KickReason, enum AdminAction, class Connect, class Disconnect |
| `core/src/mindustry/net/ServerGroup.java` | 1025 | `79901fdc9d49` | mindustry.net; class ServerGroup |
| `core/src/mindustry/net/SteamAdmin.java` | 2725 | `1b372b890436` | mindustry.net; class SteamAdmin, class SteamAdminData |
| `core/src/mindustry/net/Streamable.java` | 1273 | `e4e10f3605b7` | mindustry.net; class Streamable, class StreamBuilder |
| `core/src/mindustry/net/ValidateException.java` | 309 | `2539e384f30e` | mindustry.net; class ValidateException |
| `core/src/mindustry/net/WorldReloader.java` | 1611 | `f860ddab7953` | mindustry.net; class WorldReloader |
| `core/src/mindustry/service/Achievement.java` | 3913 | `307dd4709d34` | mindustry.service; enum Achievement |
| `core/src/mindustry/service/GameService.java` | 21333 | `fc8df493ec08` | mindustry.service; class GameService |
| `core/src/mindustry/service/SStat.java` | 1010 | `c818f1c1a6ca` | mindustry.service; enum SStat |
| `core/src/mindustry/type/Category.java` | 853 | `736281dcdbde` | mindustry.type; enum Category |
| `core/src/mindustry/type/CellLiquid.java` | 4919 | `c09ff7c65027` | mindustry.type; class CellLiquid |
| `core/src/mindustry/type/ErrorContent.java` | 293 | `16f1c07c859b` | mindustry.type; class ErrorContent |
| `core/src/mindustry/type/Item.java` | 5366 | `d8930dc2789c` | mindustry.type; class Item |
| `core/src/mindustry/type/ItemSeq.java` | 3967 | `880cd74520b8` | mindustry.type; class ItemSeq |
| `core/src/mindustry/type/ItemStack.java` | 2335 | `cda37725cb88` | mindustry.type; class ItemStack |
| `core/src/mindustry/type/Liquid.java` | 6716 | `73859371a734` | mindustry.type; class Liquid |
| `core/src/mindustry/type/LiquidStack.java` | 2268 | `bb0ce2b8a92f` | mindustry.type; class LiquidStack |
| `core/src/mindustry/type/MapLocales.java` | 3035 | `94ba280c6255` | mindustry.type; class MapLocales |
| `core/src/mindustry/type/PayloadSeq.java` | 2917 | `8a1f22413af3` | mindustry.type; class PayloadSeq |
| `core/src/mindustry/type/PayloadStack.java` | 1546 | `3846718f9046` | mindustry.type; class PayloadStack |
| `core/src/mindustry/type/Planet.java` | 27892 | `de7757ad59ad` | mindustry.type; class Planet |
| `core/src/mindustry/type/Publishable.java` | 1724 | `2be8a4793a6e` | mindustry.type; interface Publishable |
| `core/src/mindustry/type/Sector.java` | 10365 | `05b5db15d948` | mindustry.type; class Sector, class SectorRect |
| `core/src/mindustry/type/SectorPreset.java` | 4067 | `cfabd85309e7` | mindustry.type; class SectorPreset |
| `core/src/mindustry/type/StatusEffect.java` | 8695 | `77346032bf39` | mindustry.type; class StatusEffect, interface TransitionHandler |
| `core/src/mindustry/type/TeamEntry.java` | 752 | `c2f1459f570f` | mindustry.type; class TeamEntry |
| `core/src/mindustry/type/UnitType.java` | 79938 | `8583a068a90d` | mindustry.type; class UnitType |
| `core/src/mindustry/type/Weapon.java` | 25494 | `4499ce19fc86` | mindustry.type; class Weapon |
| `core/src/mindustry/type/Weather.java` | 13416 | `3f955ffabf49` | mindustry.type; class Weather, class WeatherEntry, class WeatherStateComp |
| `core/src/mindustry/type/unit/ErekirUnitType.java` | 399 | `d1355f8b0590` | mindustry.type.unit; class ErekirUnitType |
| `core/src/mindustry/type/unit/MissileUnitType.java` | 1226 | `355af9c76d8a` | mindustry.type.unit; class MissileUnitType |
| `core/src/mindustry/type/unit/NeoplasmUnitType.java` | 1141 | `09e7af77b24d` | mindustry.type.unit; class NeoplasmUnitType |
| `core/src/mindustry/type/unit/TankUnitType.java` | 354 | `b8433bf1db86` | mindustry.type.unit; class TankUnitType |
| `core/src/mindustry/type/weapons/BuildWeapon.java` | 2071 | `7899f0d39ce9` | mindustry.type.weapons; class BuildWeapon |
| `core/src/mindustry/type/weapons/MineWeapon.java` | 2085 | `65edcc8ecaca` | mindustry.type.weapons; class MineWeapon |
| `core/src/mindustry/type/weapons/PointDefenseBulletWeapon.java` | 1470 | `bbcef7d58734` | mindustry.type.weapons; class PointDefenseBulletWeapon |
| `core/src/mindustry/type/weapons/PointDefenseWeapon.java` | 2435 | `58c3bf563c86` | mindustry.type.weapons; class PointDefenseWeapon |
| `core/src/mindustry/type/weapons/RepairBeamWeapon.java` | 6583 | `17fbecce4011` | mindustry.type.weapons; class RepairBeamWeapon, class HealBeamMount |
| `core/src/mindustry/type/weather/MagneticStorm.java` | 179 | `e2590b08b317` | mindustry.type.weather; class MagneticStorm |
| `core/src/mindustry/type/weather/ParticleWeather.java` | 3186 | `acd8f34bbfc0` | mindustry.type.weather; class ParticleWeather |
| `core/src/mindustry/type/weather/RainWeather.java` | 1120 | `a361e22c3467` | mindustry.type.weather; class RainWeather |
| `core/src/mindustry/type/weather/SolarFlare.java` | 173 | `db1529c59b8e` | mindustry.type.weather; class SolarFlare |
| `core/src/mindustry/ui/Bar.java` | 3760 | `807db4ab43d5` | mindustry.ui; class Bar |
| `core/src/mindustry/ui/BorderImage.java` | 1132 | `4054f3290e89` | mindustry.ui; class BorderImage |
| `core/src/mindustry/ui/CoreItemsDisplay.java` | 1579 | `d179557f3b84` | mindustry.ui; class CoreItemsDisplay |
| `core/src/mindustry/ui/Displayable.java` | 252 | `d65aa7275d11` | mindustry.ui; interface Displayable |
| `core/src/mindustry/ui/Fonts.java` | 14557 | `c317dab9f994` | mindustry.ui; class Fonts |
| `core/src/mindustry/ui/GridImage.java` | 1006 | `86add9fb3686` | mindustry.ui; class GridImage |
| `core/src/mindustry/ui/IntFormat.java` | 1142 | `1b547ef724ea` | mindustry.ui; class IntFormat |
| `core/src/mindustry/ui/ItemsDisplay.java` | 2155 | `4d86e3703a21` | mindustry.ui; class ItemsDisplay |
| `core/src/mindustry/ui/Links.java` | 2580 | `cf4ff8e636a6` | mindustry.ui; class Links, class LinkEntry |
| `core/src/mindustry/ui/Menus.java` | 7717 | `afdc04c56fac` | mindustry.ui; class Menus, interface MenuListener, interface TextInputListener |
| `core/src/mindustry/ui/Minimap.java` | 3753 | `dd3ca21ff32a` | mindustry.ui; class Minimap |
| `core/src/mindustry/ui/MobileButton.java` | 373 | `7a9e062e2fb4` | mindustry.ui; class MobileButton |
| `core/src/mindustry/ui/MultiReqImage.java` | 750 | `62c2c41e0c4b` | mindustry.ui; class MultiReqImage |
| `core/src/mindustry/ui/ReqImage.java` | 989 | `d2a8bfe73dae` | mindustry.ui; class ReqImage |
| `core/src/mindustry/ui/Styles.java` | 15890 | `90f32c5c8193` | mindustry.ui; class Styles |
| `core/src/mindustry/ui/WarningBar.java` | 862 | `c8fd08ccc779` | mindustry.ui; class WarningBar |
| `core/src/mindustry/ui/dialogs/AboutDialog.java` | 3491 | `54d2707b2320` | mindustry.ui.dialogs; class AboutDialog |
| `core/src/mindustry/ui/dialogs/AdminsDialog.java` | 1602 | `3186f4e9a48c` | mindustry.ui.dialogs; class AdminsDialog |
| `core/src/mindustry/ui/dialogs/BansDialog.java` | 1340 | `e7d0c4b235f5` | mindustry.ui.dialogs; class BansDialog |
| `core/src/mindustry/ui/dialogs/BaseDialog.java` | 2342 | `1716622997ec` | mindustry.ui.dialogs; class BaseDialog |
| `core/src/mindustry/ui/dialogs/CampaignCompleteDialog.java` | 1288 | `3715adcd1277` | mindustry.ui.dialogs; class CampaignCompleteDialog |
| `core/src/mindustry/ui/dialogs/CampaignRulesDialog.java` | 3272 | `e4b38c17024e` | mindustry.ui.dialogs; class CampaignRulesDialog |
| `core/src/mindustry/ui/dialogs/CanvasEditDialog.java` | 10336 | `7020cd33df65` | mindustry.ui.dialogs; class CanvasEditDialog |
| `core/src/mindustry/ui/dialogs/ColorPicker.java` | 5727 | `9e8829eadec4` | mindustry.ui.dialogs; class ColorPicker |
| `core/src/mindustry/ui/dialogs/ContentInfoDialog.java` | 4455 | `471e751bc148` | mindustry.ui.dialogs; class ContentInfoDialog |
| `core/src/mindustry/ui/dialogs/CustomGameDialog.java` | 317 | `2ca3ee3d7b68` | mindustry.ui.dialogs; class CustomGameDialog |
| `core/src/mindustry/ui/dialogs/CustomRulesDialog.java` | 27581 | `57da8322e0fc` | mindustry.ui.dialogs; class CustomRulesDialog |
| `core/src/mindustry/ui/dialogs/DatabaseDialog.java` | 9977 | `afd95452fa46` | mindustry.ui.dialogs; class DatabaseDialog |
| `core/src/mindustry/ui/dialogs/DiscordDialog.java` | 1395 | `e48a83888eba` | mindustry.ui.dialogs; class DiscordDialog |
| `core/src/mindustry/ui/dialogs/EditorMapsDialog.java` | 5584 | `a259f3ed2cad` | mindustry.ui.dialogs; class EditorMapsDialog |
| `core/src/mindustry/ui/dialogs/EffectsDialog.java` | 6856 | `1c7e8e24c6c6` | mindustry.ui.dialogs; class EffectsDialog, class BoundsBatch, class EffectCell |
| `core/src/mindustry/ui/dialogs/FileChooser.java` | 8930 | `c593f228e29a` | mindustry.ui.dialogs; class FileChooser, class FileHistory |
| `core/src/mindustry/ui/dialogs/FullTextDialog.java` | 413 | `efa06e1f6cbd` | mindustry.ui.dialogs; class FullTextDialog |
| `core/src/mindustry/ui/dialogs/GameOverDialog.java` | 7010 | `a735dc69f34e` | mindustry.ui.dialogs; class GameOverDialog, class StatLabel |
| `core/src/mindustry/ui/dialogs/HostDialog.java` | 3815 | `07ace2822438` | mindustry.ui.dialogs; class HostDialog |
| `core/src/mindustry/ui/dialogs/IconSelectDialog.java` | 2357 | `74e9a4a93f9b` | mindustry.ui.dialogs; class IconSelectDialog |
| `core/src/mindustry/ui/dialogs/JoinDialog.java` | 28893 | `6ff0b06dce81` | mindustry.ui.dialogs; class JoinDialog |
| `core/src/mindustry/ui/dialogs/KeybindDialog.java` | 6439 | `bd3a127302b5` | mindustry.ui.dialogs; class KeybindDialog |
| `core/src/mindustry/ui/dialogs/LanguageDialog.java` | 3555 | `8ffdca9765ff` | mindustry.ui.dialogs; class LanguageDialog |
| `core/src/mindustry/ui/dialogs/LaunchLoadoutDialog.java` | 7844 | `983665d9ba52` | mindustry.ui.dialogs; class LaunchLoadoutDialog |
| `core/src/mindustry/ui/dialogs/LoadDialog.java` | 8252 | `a8c04fd4bc24` | mindustry.ui.dialogs; class LoadDialog |
| `core/src/mindustry/ui/dialogs/LoadoutDialog.java` | 4562 | `0efc16563f08` | mindustry.ui.dialogs; class LoadoutDialog |
| `core/src/mindustry/ui/dialogs/MapListDialog.java` | 16974 | `d7b581b6b269` | mindustry.ui.dialogs; class MapListDialog |
| `core/src/mindustry/ui/dialogs/MapPlayDialog.java` | 3655 | `e28f1f58f83d` | mindustry.ui.dialogs; class MapPlayDialog |
| `core/src/mindustry/ui/dialogs/ModsDialog.java` | 33257 | `514952fe3b4f` | mindustry.ui.dialogs; class ModsDialog |
| `core/src/mindustry/ui/dialogs/PaletteDialog.java` | 1033 | `cfac11c3df2b` | mindustry.ui.dialogs; class PaletteDialog |
| `core/src/mindustry/ui/dialogs/PausedDialog.java` | 7014 | `140a6820b0ce` | mindustry.ui.dialogs; class PausedDialog |
| `core/src/mindustry/ui/dialogs/PlanetDialog.java` | 57537 | `121d5c672cef` | mindustry.ui.dialogs; class PlanetDialog |
| `core/src/mindustry/ui/dialogs/ResearchDialog.java` | 30325 | `486deb3c3f9a` | mindustry.ui.dialogs; class ResearchDialog, class LayoutNode, class TechTreeNode, class View |
| `core/src/mindustry/ui/dialogs/SaveDialog.java` | 1393 | `a27c0fc40dd6` | mindustry.ui.dialogs; class SaveDialog |
| `core/src/mindustry/ui/dialogs/SchematicsDialog.java` | 30765 | `6ad4e0b42fcf` | mindustry.ui.dialogs; class SchematicsDialog |
| `core/src/mindustry/ui/dialogs/SectorSelectDialog.java` | 2346 | `d97131610bce` | mindustry.ui.dialogs; class SectorSelectDialog |
| `core/src/mindustry/ui/dialogs/SettingsMenuDialog.java` | 33904 | `1201ea348e94` | mindustry.ui.dialogs; class SettingsMenuDialog |
| `core/src/mindustry/ui/dialogs/TraceDialog.java` | 2288 | `f2c1575e299c` | mindustry.ui.dialogs; class TraceDialog |
| `core/src/mindustry/ui/fragments/BlockConfigFragment.java` | 2162 | `52fb278607a2` | mindustry.ui.fragments; class BlockConfigFragment |
| `core/src/mindustry/ui/fragments/BlockInventoryFragment.java` | 7607 | `cc0bbe821213` | mindustry.ui.fragments; class BlockInventoryFragment |
| `core/src/mindustry/ui/fragments/ChatFragment.java` | 11205 | `b27aac71c042` | mindustry.ui.fragments; class ChatFragment, enum ChatMode |
| `core/src/mindustry/ui/fragments/ConsoleFragment.java` | 8983 | `865810821816` | mindustry.ui.fragments; class ConsoleFragment |
| `core/src/mindustry/ui/fragments/FadeInFragment.java` | 970 | `711c75b11c5d` | mindustry.ui.fragments; class FadeInFragment |
| `core/src/mindustry/ui/fragments/HintsFragment.java` | 14665 | `f333fd483038` | mindustry.ui.fragments; class HintsFragment, enum DefaultHint, interface Hint |
| `core/src/mindustry/ui/fragments/HudFragment.java` | 45989 | `b1d6789ba681` | mindustry.ui.fragments; class HudFragment |
| `core/src/mindustry/ui/fragments/LoadingFragment.java` | 3824 | `99093168f07a` | mindustry.ui.fragments; class LoadingFragment |
| `core/src/mindustry/ui/fragments/MenuFragment.java` | 13877 | `94514bf1a451` | mindustry.ui.fragments; class MenuFragment, class MenuButton |
| `core/src/mindustry/ui/fragments/MinimapFragment.java` | 6648 | `44347b4ab7a8` | mindustry.ui.fragments; class MinimapFragment |
| `core/src/mindustry/ui/fragments/PlacementFragment.java` | 38247 | `a40331eef73e` | mindustry.ui.fragments; class PlacementFragment |
| `core/src/mindustry/ui/fragments/PlanConfigFragment.java` | 2408 | `378ec32a93f6` | mindustry.ui.fragments; class PlanConfigFragment |
| `core/src/mindustry/ui/fragments/PlayerListFragment.java` | 11150 | `22fc6a821903` | mindustry.ui.fragments; class PlayerListFragment |
| `core/src/mindustry/ui/layout/BranchTreeLayout.java` | 9195 | `ef5b5bbdd1f1` | mindustry.ui.layout; class BranchTreeLayout, enum TreeLocation, enum TreeAlignment |
| `core/src/mindustry/ui/layout/RadialTreeLayout.java` | 1867 | `8d26c2db160e` | mindustry.ui.layout; class RadialTreeLayout |
| `core/src/mindustry/ui/layout/RowTreeLayout.java` | 823 | `11ce4afe62a7` | mindustry.ui.layout; class RowTreeLayout |
| `core/src/mindustry/ui/layout/TreeLayout.java` | 886 | `c468d3002428` | mindustry.ui.layout; interface TreeLayout, class TreeNode |
| `core/src/mindustry/world/Block.java` | 65123 | `0264ec5beee6` | mindustry.world; class Block |
| `core/src/mindustry/world/Build.java` | 14114 | `315207a1c9df` | mindustry.world; class Build |
| `core/src/mindustry/world/CachedTile.java` | 1005 | `9f47ca01f5e2` | mindustry.world; class CachedTile |
| `core/src/mindustry/world/ColorMapper.java` | 567 | `765082b8bb65` | mindustry.world; class ColorMapper |
| `core/src/mindustry/world/DirectionalItemBuffer.java` | 2344 | `6908cbe05433` | mindustry.world; class DirectionalItemBuffer, class BufferItemStruct, class BufferItemLegacyStruct |
| `core/src/mindustry/world/Edges.java` | 3088 | `aa9e97e2bf31` | mindustry.world; class Edges |
| `core/src/mindustry/world/ItemBuffer.java` | 1660 | `511d99ce19ec` | mindustry.world; class ItemBuffer, class TimeItemStruct |
| `core/src/mindustry/world/Tile.java` | 27233 | `567321aa78f8` | mindustry.world; class Tile |
| `core/src/mindustry/world/TileGen.java` | 303 | `51e016dee517` | mindustry.world; class TileGen |
| `core/src/mindustry/world/Tiles.java` | 4161 | `bd42b1c57723` | mindustry.world; class Tiles, class TileIterator |
| `core/src/mindustry/world/WorldContext.java` | 1017 | `aa82e24facd0` | mindustry.world; interface WorldContext |
| `core/src/mindustry/world/WorldParams.java` | 530 | `a728592119ba` | mindustry.world; class WorldParams |
| `core/src/mindustry/world/blocks/Attributes.java` | 2050 | `f26768798d58` | mindustry.world.blocks; class Attributes |
| `core/src/mindustry/world/blocks/Autotiler.java` | 9451 | `bcc9c0c9d572` | mindustry.world.blocks; interface Autotiler, class AutotilerHolder, enum SliceMode |
| `core/src/mindustry/world/blocks/ConstructBlock.java` | 20281 | `cec51f926aa9` | mindustry.world.blocks; class ConstructBlock, class ConstructBuild |
| `core/src/mindustry/world/blocks/ControlBlock.java` | 605 | `ef3c92aa35b6` | mindustry.world.blocks; interface ControlBlock |
| `core/src/mindustry/world/blocks/ExplosionShield.java` | 374 | `73fc36948cf3` | mindustry.world.blocks; interface ExplosionShield |
| `core/src/mindustry/world/blocks/ItemSelection.java` | 4566 | `104e4d6a95f3` | mindustry.world.blocks; class ItemSelection |
| `core/src/mindustry/world/blocks/LaunchAnimator.java` | 417 | `60c0bef194fb` | mindustry.world.blocks; interface LaunchAnimator |
| `core/src/mindustry/world/blocks/RotBlock.java` | 135 | `4c5839dbfc83` | mindustry.world.blocks; interface RotBlock |
| `core/src/mindustry/world/blocks/TileBitmask.java` | 1934 | `7194e63a3431` | mindustry.world.blocks; class TileBitmask |
| `core/src/mindustry/world/blocks/UnitTetherBlock.java` | 95 | `d52a7ff11881` | mindustry.world.blocks; interface UnitTetherBlock |
| `core/src/mindustry/world/blocks/campaign/Accelerator.java` | 24373 | `74806dccd1cb` | mindustry.world.blocks.campaign; class Accelerator, class AcceleratorBuild |
| `core/src/mindustry/world/blocks/campaign/LandingPad.java` | 16785 | `1ccf82d0dd8f` | mindustry.world.blocks.campaign; class LandingPad, class LandingPadBuild |
| `core/src/mindustry/world/blocks/campaign/LaunchPad.java` | 10291 | `f951fc00cca7` | mindustry.world.blocks.campaign; class LaunchPad, class LaunchPadBuild, class LaunchPayloadComp |
| `core/src/mindustry/world/blocks/defense/AutoDoor.java` | 3045 | `899b1300bdd4` | mindustry.world.blocks.defense; class AutoDoor, class AutoDoorBuild |
| `core/src/mindustry/world/blocks/defense/BaseShield.java` | 4783 | `c1db14b1dde6` | mindustry.world.blocks.defense; class BaseShield, class BaseShieldBuild |
| `core/src/mindustry/world/blocks/defense/BuildTurret.java` | 9933 | `58fdb9dc5cf9` | mindustry.world.blocks.defense; class BuildTurret, class BuildTurretBuild |
| `core/src/mindustry/world/blocks/defense/DirectionalForceProjector.java` | 8818 | `c2e580f30d57` | mindustry.world.blocks.defense; class DirectionalForceProjector, class DirectionalForceProjectorBuild |
| `core/src/mindustry/world/blocks/defense/Door.java` | 4773 | `402129432bc7` | mindustry.world.blocks.defense; class Door, class DoorBuild |
| `core/src/mindustry/world/blocks/defense/ForceProjector.java` | 12846 | `c875cc59db7f` | mindustry.world.blocks.defense; class ForceProjector, class ForceBuild |
| `core/src/mindustry/world/blocks/defense/MendProjector.java` | 5622 | `a2486edb4c5b` | mindustry.world.blocks.defense; class MendProjector, class MendBuild |
| `core/src/mindustry/world/blocks/defense/OverdriveProjector.java` | 5882 | `f2234841c1b2` | mindustry.world.blocks.defense; class OverdriveProjector, class OverdriveBuild |
| `core/src/mindustry/world/blocks/defense/Radar.java` | 2968 | `7a5499fe8210` | mindustry.world.blocks.defense; class Radar, class RadarBuild |
| `core/src/mindustry/world/blocks/defense/RegenProjector.java` | 6556 | `0228382df998` | mindustry.world.blocks.defense; class RegenProjector, class RegenProjectorBuild |
| `core/src/mindustry/world/blocks/defense/ShieldWall.java` | 3455 | `8347a832f9ea` | mindustry.world.blocks.defense; class ShieldWall, class ShieldWallBuild |
| `core/src/mindustry/world/blocks/defense/ShockMine.java` | 2390 | `db132bee9769` | mindustry.world.blocks.defense; class ShockMine, class ShockMineBuild |
| `core/src/mindustry/world/blocks/defense/ShockwaveTower.java` | 4567 | `ced907759f3a` | mindustry.world.blocks.defense; class ShockwaveTower, class ShockwaveTowerBuild |
| `core/src/mindustry/world/blocks/defense/Thruster.java` | 917 | `19a891ee1279` | mindustry.world.blocks.defense; class Thruster, class ThrusterBuild |
| `core/src/mindustry/world/blocks/defense/Wall.java` | 4174 | `0ccf11531517` | mindustry.world.blocks.defense; class Wall, class WallBuild |
| `core/src/mindustry/world/blocks/defense/turrets/BaseTurret.java` | 4286 | `27bff62cbfae` | mindustry.world.blocks.defense.turrets; class BaseTurret, class BaseTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/ContinuousLiquidTurret.java` | 4127 | `506bfc7160d9` | mindustry.world.blocks.defense.turrets; class ContinuousLiquidTurret, class ContinuousLiquidTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/ContinuousTurret.java` | 6159 | `a60c8523edf1` | mindustry.world.blocks.defense.turrets; class ContinuousTurret, class ContinuousTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/ItemTurret.java` | 7197 | `3095cb2a7af7` | mindustry.world.blocks.defense.turrets; class ItemTurret, class ItemTurretBuild, class ItemEntry |
| `core/src/mindustry/world/blocks/defense/turrets/LaserTurret.java` | 4823 | `9da6be9f337c` | mindustry.world.blocks.defense.turrets; class LaserTurret, class LaserTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/LiquidTurret.java` | 4515 | `8c1db940ac37` | mindustry.world.blocks.defense.turrets; class LiquidTurret, class LiquidTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/PayloadAmmoTurret.java` | 5178 | `b761555c75d0` | mindustry.world.blocks.defense.turrets; class PayloadAmmoTurret, class PayloadTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/PointDefenseTurret.java` | 3957 | `d4aa731d7981` | mindustry.world.blocks.defense.turrets; class PointDefenseTurret, class PointDefenseBuild |
| `core/src/mindustry/world/blocks/defense/turrets/PowerTurret.java` | 1422 | `436d7fac0459` | mindustry.world.blocks.defense.turrets; class PowerTurret, class PowerTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/ReloadTurret.java` | 1686 | `0487fbac3d06` | mindustry.world.blocks.defense.turrets; class ReloadTurret, class ReloadTurretBuild |
| `core/src/mindustry/world/blocks/defense/turrets/TractorBeamTurret.java` | 5965 | `843445bf0878` | mindustry.world.blocks.defense.turrets; class TractorBeamTurret, class TractorBeamBuild |
| `core/src/mindustry/world/blocks/defense/turrets/Turret.java` | 30768 | `d06943faaf3c` | mindustry.world.blocks.defense.turrets; class Turret, class AmmoEntry, class TurretBuild |
| `core/src/mindustry/world/blocks/distribution/ArmoredConveyor.java` | 1628 | `72b68d44f416` | mindustry.world.blocks.distribution; class ArmoredConveyor, class ArmoredConveyorBuild |
| `core/src/mindustry/world/blocks/distribution/BufferedItemBridge.java` | 1752 | `7341894cef3f` | mindustry.world.blocks.distribution; class BufferedItemBridge, class BufferedItemBridgeBuild |
| `core/src/mindustry/world/blocks/distribution/ChainedBuilding.java` | 127 | `b82a18c27e55` | mindustry.world.blocks.distribution; interface ChainedBuilding |
| `core/src/mindustry/world/blocks/distribution/Conveyor.java` | 16241 | `a81ec9b121e1` | mindustry.world.blocks.distribution; class Conveyor, class ConveyorBuild |
| `core/src/mindustry/world/blocks/distribution/DirectionBridge.java` | 9112 | `66d75371425d` | mindustry.world.blocks.distribution; class DirectionBridge, class DirectionBridgeBuild |
| `core/src/mindustry/world/blocks/distribution/DirectionLiquidBridge.java` | 2981 | `76954f9f315d` | mindustry.world.blocks.distribution; class DirectionLiquidBridge, class DuctBridgeBuild |
| `core/src/mindustry/world/blocks/distribution/DirectionalUnloader.java` | 5242 | `88dd6b2edf93` | mindustry.world.blocks.distribution; class DirectionalUnloader, class DirectionalUnloaderBuild |
| `core/src/mindustry/world/blocks/distribution/Duct.java` | 10197 | `cd10b116d217` | mindustry.world.blocks.distribution; class Duct, class DuctBuild |
| `core/src/mindustry/world/blocks/distribution/DuctBridge.java` | 2131 | `c45e84fba236` | mindustry.world.blocks.distribution; class DuctBridge, class DuctBridgeBuild |
| `core/src/mindustry/world/blocks/distribution/DuctJunction.java` | 5041 | `a30942b30bc3` | mindustry.world.blocks.distribution; class DuctJunction, class DuctJunctionBuild |
| `core/src/mindustry/world/blocks/distribution/DuctRouter.java` | 5614 | `112959b93e9f` | mindustry.world.blocks.distribution; class DuctRouter, class DuctRouterBuild |
| `core/src/mindustry/world/blocks/distribution/ItemBridge.java` | 17845 | `947138bdb8a6` | mindustry.world.blocks.distribution; class ItemBridge, class ItemBridgeBuild |
| `core/src/mindustry/world/blocks/distribution/Junction.java` | 3380 | `25f0fe3f2446` | mindustry.world.blocks.distribution; class Junction, class JunctionBuild |
| `core/src/mindustry/world/blocks/distribution/MassDriver.java` | 13942 | `b4814cea60ef` | mindustry.world.blocks.distribution; class MassDriver, class DriverBulletData, class MassDriverBuild, enum DriverState |
| `core/src/mindustry/world/blocks/distribution/OverflowDuct.java` | 4692 | `2fb2217853d8` | mindustry.world.blocks.distribution; class OverflowDuct, class OverflowDuctBuild |
| `core/src/mindustry/world/blocks/distribution/OverflowGate.java` | 2970 | `cf055984906c` | mindustry.world.blocks.distribution; class OverflowGate, class OverflowGateBuild |
| `core/src/mindustry/world/blocks/distribution/Router.java` | 3853 | `2b31faccc491` | mindustry.world.blocks.distribution; class Router, class RouterBuild |
| `core/src/mindustry/world/blocks/distribution/Sorter.java` | 5015 | `ddf7f87841ed` | mindustry.world.blocks.distribution; class Sorter, class SorterBuild |
| `core/src/mindustry/world/blocks/distribution/StackConveyor.java` | 14462 | `b906af80d7f7` | mindustry.world.blocks.distribution; class StackConveyor, class StackConveyorBuild |
| `core/src/mindustry/world/blocks/distribution/StackRouter.java` | 2840 | `389dbd6d80d7` | mindustry.world.blocks.distribution; class StackRouter, class StackRouterBuild |
| `core/src/mindustry/world/blocks/environment/AirBlock.java` | 953 | `87c0c4b41057` | mindustry.world.blocks.environment; class AirBlock |
| `core/src/mindustry/world/blocks/environment/CharacterOverlay.java` | 3090 | `e901078b7ec9` | mindustry.world.blocks.environment; class CharacterOverlay, class CharOverlayDataStruct |
| `core/src/mindustry/world/blocks/environment/Cliff.java` | 898 | `981b8bf623eb` | mindustry.world.blocks.environment; class Cliff |
| `core/src/mindustry/world/blocks/environment/ColoredFloor.java` | 6864 | `e0d3105c72ba` | mindustry.world.blocks.environment; class ColoredFloor |
| `core/src/mindustry/world/blocks/environment/ColoredWall.java` | 2741 | `d377e5c7209f` | mindustry.world.blocks.environment; class ColoredWall |
| `core/src/mindustry/world/blocks/environment/EmptyFloor.java` | 703 | `425244a525d1` | mindustry.world.blocks.environment; class EmptyFloor |
| `core/src/mindustry/world/blocks/environment/Floor.java` | 15562 | `cfde6fdfab9d` | mindustry.world.blocks.environment; class Floor, class UpdateRenderState |
| `core/src/mindustry/world/blocks/environment/OreBlock.java` | 2515 | `ac50dd57d7af` | mindustry.world.blocks.environment; class OreBlock |
| `core/src/mindustry/world/blocks/environment/OverlayFloor.java` | 671 | `a69baad4d7ba` | mindustry.world.blocks.environment; class OverlayFloor |
| `core/src/mindustry/world/blocks/environment/Prop.java` | 945 | `6e33203c7475` | mindustry.world.blocks.environment; class Prop |
| `core/src/mindustry/world/blocks/environment/RemoveOre.java` | 1282 | `1b3373ffeee8` | mindustry.world.blocks.environment; class RemoveOre |
| `core/src/mindustry/world/blocks/environment/RemoveWall.java` | 1375 | `98b31f36e37a` | mindustry.world.blocks.environment; class RemoveWall |
| `core/src/mindustry/world/blocks/environment/RuneOverlay.java` | 3079 | `ab13ff6d55fa` | mindustry.world.blocks.environment; class RuneOverlay |
| `core/src/mindustry/world/blocks/environment/SeaBush.java` | 1689 | `67e2f26a575d` | mindustry.world.blocks.environment; class SeaBush |
| `core/src/mindustry/world/blocks/environment/Seaweed.java` | 1171 | `660da1450b78` | mindustry.world.blocks.environment; class Seaweed |
| `core/src/mindustry/world/blocks/environment/ShallowLiquid.java` | 1778 | `c6955059e190` | mindustry.world.blocks.environment; class ShallowLiquid |
| `core/src/mindustry/world/blocks/environment/SpawnBlock.java` | 405 | `9ce29be753a4` | mindustry.world.blocks.environment; class SpawnBlock |
| `core/src/mindustry/world/blocks/environment/StaticTree.java` | 1349 | `273921837933` | mindustry.world.blocks.environment; class StaticTree |
| `core/src/mindustry/world/blocks/environment/StaticWall.java` | 3981 | `5820ebfb0ef5` | mindustry.world.blocks.environment; class StaticWall |
| `core/src/mindustry/world/blocks/environment/SteamVent.java` | 2632 | `5dbc25da6aa7` | mindustry.world.blocks.environment; class SteamVent |
| `core/src/mindustry/world/blocks/environment/TallBlock.java` | 1585 | `97800b983a63` | mindustry.world.blocks.environment; class TallBlock |
| `core/src/mindustry/world/blocks/environment/TiledFloor.java` | 4657 | `39e9809b42ca` | mindustry.world.blocks.environment; class TiledFloor, class TiledStateStruct |
| `core/src/mindustry/world/blocks/environment/TiledWall.java` | 4110 | `d62c9b595458` | mindustry.world.blocks.environment; class TiledWall |
| `core/src/mindustry/world/blocks/environment/TreeBlock.java` | 1719 | `43fdcf571f5e` | mindustry.world.blocks.environment; class TreeBlock |
| `core/src/mindustry/world/blocks/environment/WobbleProp.java` | 953 | `809ca057e081` | mindustry.world.blocks.environment; class WobbleProp |
| `core/src/mindustry/world/blocks/heat/HeatBlock.java` | 214 | `fab5b62657f0` | mindustry.world.blocks.heat; interface HeatBlock |
| `core/src/mindustry/world/blocks/heat/HeatConductor.java` | 2530 | `9ff7cb8dfe0f` | mindustry.world.blocks.heat; class HeatConductor, class HeatConductorBuild |
| `core/src/mindustry/world/blocks/heat/HeatConsumer.java` | 124 | `209ae91e7867` | mindustry.world.blocks.heat; interface HeatConsumer |
| `core/src/mindustry/world/blocks/heat/HeatProducer.java` | 1898 | `fda7026450bd` | mindustry.world.blocks.heat; class HeatProducer, class HeatProducerBuild |
| `core/src/mindustry/world/blocks/legacy/LegacyBlock.java` | 443 | `586abccafcdc` | mindustry.world.blocks.legacy; class LegacyBlock |
| `core/src/mindustry/world/blocks/legacy/LegacyCommandCenter.java` | 563 | `3d97fc33172f` | mindustry.world.blocks.legacy; class LegacyCommandCenter, class CommandBuild |
| `core/src/mindustry/world/blocks/legacy/LegacyMechPad.java` | 560 | `3a0d2e543e4a` | mindustry.world.blocks.legacy; class LegacyMechPad, class LegacyMechPadBuild |
| `core/src/mindustry/world/blocks/legacy/LegacyUnitFactory.java` | 919 | `50d8ef832760` | mindustry.world.blocks.legacy; class LegacyUnitFactory, class LegacyUnitFactoryBuild |
| `core/src/mindustry/world/blocks/liquid/ArmoredConduit.java` | 1263 | `58a055d47184` | mindustry.world.blocks.liquid; class ArmoredConduit, class ArmoredConduitBuild |
| `core/src/mindustry/world/blocks/liquid/Conduit.java` | 9423 | `ddf71c4e466b` | mindustry.world.blocks.liquid; class Conduit, class ConduitBuild |
| `core/src/mindustry/world/blocks/liquid/LiquidBlock.java` | 3097 | `01c7104026b8` | mindustry.world.blocks.liquid; class LiquidBlock, class LiquidBuild |
| `core/src/mindustry/world/blocks/liquid/LiquidBridge.java` | 808 | `f4931d33dd23` | mindustry.world.blocks.liquid; class LiquidBridge, class LiquidBridgeBuild |
| `core/src/mindustry/world/blocks/liquid/LiquidJunction.java` | 1256 | `3e79cd989292` | mindustry.world.blocks.liquid; class LiquidJunction, class LiquidJunctionBuild |
| `core/src/mindustry/world/blocks/liquid/LiquidRouter.java` | 1168 | `8e3b309f2bea` | mindustry.world.blocks.liquid; class LiquidRouter, class LiquidRouterBuild |
| `core/src/mindustry/world/blocks/logic/CanvasBlock.java` | 10777 | `6deff470b901` | mindustry.world.blocks.logic; class CanvasBlock, class CanvasBuild |
| `core/src/mindustry/world/blocks/logic/LogicBlock.java` | 28577 | `8809ee09b8f2` | mindustry.world.blocks.logic; class LogicBlock, class LogicLink, class LogicBuild |
| `core/src/mindustry/world/blocks/logic/LogicDisplay.java` | 11477 | `734f623b7869` | mindustry.world.blocks.logic; class LogicDisplay, class LogicDisplayBuild, enum GraphicsType, class DisplayCmdStruct |
| `core/src/mindustry/world/blocks/logic/MemoryBlock.java` | 3106 | `e4c49f795abc` | mindustry.world.blocks.logic; class MemoryBlock, class MemoryBuild |
| `core/src/mindustry/world/blocks/logic/MessageBlock.java` | 7548 | `f1a94f9c6ed9` | mindustry.world.blocks.logic; class MessageBlock, class MessageBuild |
| `core/src/mindustry/world/blocks/logic/SwitchBlock.java` | 2235 | `9a89b675344b` | mindustry.world.blocks.logic; class SwitchBlock, class SwitchBuild |
| `core/src/mindustry/world/blocks/logic/TileableLogicDisplay.java` | 9585 | `9a894ec5999f` | mindustry.world.blocks.logic; class TileableLogicDisplay, class MergeBuffer, class TileableLogicDisplayBuild |
| `core/src/mindustry/world/blocks/payloads/BlockProducer.java` | 5759 | `5c17ec2638c5` | mindustry.world.blocks.payloads; class BlockProducer, class BlockProducerBuild |
| `core/src/mindustry/world/blocks/payloads/BuildPayload.java` | 3063 | `70fb9eff8de8` | mindustry.world.blocks.payloads; class BuildPayload |
| `core/src/mindustry/world/blocks/payloads/Constructor.java` | 3279 | `9c397c49d4c5` | mindustry.world.blocks.payloads; class Constructor, class ConstructorBuild |
| `core/src/mindustry/world/blocks/payloads/Payload.java` | 3079 | `d9e68c441119` | mindustry.world.blocks.payloads; interface Payload |
| `core/src/mindustry/world/blocks/payloads/PayloadBlock.java` | 9627 | `e73375c5089c` | mindustry.world.blocks.payloads; class PayloadBlock, class PayloadBlockBuild |
| `core/src/mindustry/world/blocks/payloads/PayloadConveyor.java` | 12801 | `983cf21b538e` | mindustry.world.blocks.payloads; class PayloadConveyor, class PayloadConveyorBuild |
| `core/src/mindustry/world/blocks/payloads/PayloadDeconstructor.java` | 8883 | `96867a301695` | mindustry.world.blocks.payloads; class PayloadDeconstructor, class PayloadDeconstructorBuild |
| `core/src/mindustry/world/blocks/payloads/PayloadLoader.java` | 9831 | `f1a32775fcc1` | mindustry.world.blocks.payloads; class PayloadLoader, class PayloadLoaderBuild |
| `core/src/mindustry/world/blocks/payloads/PayloadMassDriver.java` | 20146 | `bfb8f59f27bc` | mindustry.world.blocks.payloads; class PayloadMassDriver, class PayloadDriverBuild, class PayloadMassDriverData |
| `core/src/mindustry/world/blocks/payloads/PayloadRouter.java` | 7140 | `4f53146fb30a` | mindustry.world.blocks.payloads; class PayloadRouter, class PayloadRouterBuild |
| `core/src/mindustry/world/blocks/payloads/PayloadSource.java` | 5751 | `b60c49812e31` | mindustry.world.blocks.payloads; class PayloadSource, class PayloadSourceBuild |
| `core/src/mindustry/world/blocks/payloads/PayloadUnloader.java` | 4190 | `cae1fa5656e0` | mindustry.world.blocks.payloads; class PayloadUnloader, class PayloadUnloaderBuild |
| `core/src/mindustry/world/blocks/payloads/PayloadVoid.java` | 1622 | `e960cb08a232` | mindustry.world.blocks.payloads; class PayloadVoid, class PayloadVoidBuild |
| `core/src/mindustry/world/blocks/payloads/UnitPayload.java` | 4578 | `01329ebcf18f` | mindustry.world.blocks.payloads; class UnitPayload |
| `core/src/mindustry/world/blocks/power/Battery.java` | 2828 | `d74a9751c544` | mindustry.world.blocks.power; class Battery, class BatteryBuild |
| `core/src/mindustry/world/blocks/power/BeamNode.java` | 11079 | `dbab0b272545` | mindustry.world.blocks.power; class BeamNode, class BeamNodeBuild |
| `core/src/mindustry/world/blocks/power/ConsumeGenerator.java` | 5977 | `bf67ae74e588` | mindustry.world.blocks.power; class ConsumeGenerator, class ConsumeGeneratorBuild |
| `core/src/mindustry/world/blocks/power/HeaterGenerator.java` | 1900 | `295c03cd0448` | mindustry.world.blocks.power; class HeaterGenerator, class HeaterGeneratorBuild |
| `core/src/mindustry/world/blocks/power/ImpactReactor.java` | 4184 | `78633e993bc3` | mindustry.world.blocks.power; class ImpactReactor, class ImpactReactorBuild |
| `core/src/mindustry/world/blocks/power/LightBlock.java` | 4109 | `4e6fe4327723` | mindustry.world.blocks.power; class LightBlock, class LightBuild |
| `core/src/mindustry/world/blocks/power/LongPowerNode.java` | 1298 | `1780f349ae7f` | mindustry.world.blocks.power; class LongPowerNode, class LongPowerNodeBuild |
| `core/src/mindustry/world/blocks/power/NuclearReactor.java` | 6180 | `f6970a14d311` | mindustry.world.blocks.power; class NuclearReactor, class NuclearReactorBuild |
| `core/src/mindustry/world/blocks/power/PowerBlock.java` | 306 | `de54c3ebdb3c` | mindustry.world.blocks.power; class PowerBlock |
| `core/src/mindustry/world/blocks/power/PowerDiode.java` | 2899 | `541bac0cc0f6` | mindustry.world.blocks.power; class PowerDiode, class PowerDiodeBuild |
| `core/src/mindustry/world/blocks/power/PowerDistributor.java` | 221 | `52d85a802716` | mindustry.world.blocks.power; class PowerDistributor |
| `core/src/mindustry/world/blocks/power/PowerGenerator.java` | 5007 | `1b90519e1e8c` | mindustry.world.blocks.power; class PowerGenerator, class GeneratorBuild |
| `core/src/mindustry/world/blocks/power/PowerGraph.java` | 13315 | `b2aee2355ab3` | mindustry.world.blocks.power; class PowerGraph |
| `core/src/mindustry/world/blocks/power/PowerNode.java` | 19378 | `18065943e87c` | mindustry.world.blocks.power; class PowerNode, class PowerNodeBuild |
| `core/src/mindustry/world/blocks/power/SolarGenerator.java` | 1044 | `79d9d0a7af43` | mindustry.world.blocks.power; class SolarGenerator, class SolarGeneratorBuild |
| `core/src/mindustry/world/blocks/power/ThermalGenerator.java` | 3603 | `44cc3907cba3` | mindustry.world.blocks.power; class ThermalGenerator, class ThermalGeneratorBuild |
| `core/src/mindustry/world/blocks/power/VariableReactor.java` | 5419 | `ae6a6a896b20` | mindustry.world.blocks.power; class VariableReactor, class VariableReactorBuild |
| `core/src/mindustry/world/blocks/production/AttributeCrafter.java` | 2854 | `430af2130f6f` | mindustry.world.blocks.production; class AttributeCrafter, class AttributeCrafterBuild |
| `core/src/mindustry/world/blocks/production/BeamDrill.java` | 15757 | `116b1626f1ff` | mindustry.world.blocks.production; class BeamDrill, class BeamDrillBuild |
| `core/src/mindustry/world/blocks/production/BurstDrill.java` | 6305 | `854ef4d907d9` | mindustry.world.blocks.production; class BurstDrill, class BurstDrillBuild |
| `core/src/mindustry/world/blocks/production/Drill.java` | 13235 | `e30411de789a` | mindustry.world.blocks.production; class Drill, class DrillBuild |
| `core/src/mindustry/world/blocks/production/Fracker.java` | 1178 | `a3d2b849a395` | mindustry.world.blocks.production; class Fracker, class FrackerBuild |
| `core/src/mindustry/world/blocks/production/GenericCrafter.java` | 11520 | `e8a07fcdc34f` | mindustry.world.blocks.production; class GenericCrafter, class GenericCrafterBuild |
| `core/src/mindustry/world/blocks/production/HeatCrafter.java` | 2367 | `9334d3cc03f0` | mindustry.world.blocks.production; class HeatCrafter, class HeatCrafterBuild |
| `core/src/mindustry/world/blocks/production/Incinerator.java` | 2136 | `720570f6d342` | mindustry.world.blocks.production; class Incinerator, class IncineratorBuild |
| `core/src/mindustry/world/blocks/production/ItemIncinerator.java` | 1841 | `e73f4bee9c41` | mindustry.world.blocks.production; class ItemIncinerator, class ItemIncineratorBuild |
| `core/src/mindustry/world/blocks/production/Pump.java` | 6002 | `208f33603ff4` | mindustry.world.blocks.production; class Pump, class PumpBuild |
| `core/src/mindustry/world/blocks/production/Separator.java` | 5230 | `d335631ecdcd` | mindustry.world.blocks.production; class Separator, class SeparatorBuild |
| `core/src/mindustry/world/blocks/production/SingleBlockProducer.java` | 514 | `1c7b23cbeb5b` | mindustry.world.blocks.production; class SingleBlockProducer, class SingleBlockProducerBuild |
| `core/src/mindustry/world/blocks/production/SolidPump.java` | 5221 | `c9b901fec86b` | mindustry.world.blocks.production; class SolidPump, class SolidPumpBuild |
| `core/src/mindustry/world/blocks/production/WallCrafter.java` | 8307 | `386997e83da7` | mindustry.world.blocks.production; class WallCrafter, class WallCrafterBuild |
| `core/src/mindustry/world/blocks/sandbox/ItemSource.java` | 3346 | `6a4af1881d84` | mindustry.world.blocks.sandbox; class ItemSource, class ItemSourceBuild |
| `core/src/mindustry/world/blocks/sandbox/ItemVoid.java` | 961 | `f96448e8de60` | mindustry.world.blocks.sandbox; class ItemVoid, class ItemVoidBuild |
| `core/src/mindustry/world/blocks/sandbox/LiquidSource.java` | 3181 | `151b0bbe5984` | mindustry.world.blocks.sandbox; class LiquidSource, class LiquidSourceBuild |
| `core/src/mindustry/world/blocks/sandbox/LiquidVoid.java` | 983 | `5f84043a32f2` | mindustry.world.blocks.sandbox; class LiquidVoid, class LiquidVoidBuild |
| `core/src/mindustry/world/blocks/sandbox/PowerSource.java` | 813 | `3051368170e8` | mindustry.world.blocks.sandbox; class PowerSource, class PowerSourceBuild |
| `core/src/mindustry/world/blocks/sandbox/PowerVoid.java` | 435 | `08c9e36850fc` | mindustry.world.blocks.sandbox; class PowerVoid |
| `core/src/mindustry/world/blocks/storage/CoreBlock.java` | 31545 | `1efdf66b5068` | mindustry.world.blocks.storage; class CoreBlock, class CoreBuild |
| `core/src/mindustry/world/blocks/storage/StorageBlock.java` | 4320 | `694f953f8d84` | mindustry.world.blocks.storage; class StorageBlock, class StorageBuild |
| `core/src/mindustry/world/blocks/storage/Unloader.java` | 9723 | `abd39986b1c2` | mindustry.world.blocks.storage; class Unloader, class ContainerStat, class UnloaderBuild |
| `core/src/mindustry/world/blocks/units/DroneCenter.java` | 4777 | `19d1a0bfc99e` | mindustry.world.blocks.units; class DroneCenter, class DroneCenterBuild, class EffectDroneAI |
| `core/src/mindustry/world/blocks/units/Reconstructor.java` | 13961 | `8e7eec28c215` | mindustry.world.blocks.units; class Reconstructor, class ReconstructorBuild |
| `core/src/mindustry/world/blocks/units/RepairTower.java` | 3654 | `48230656dc89` | mindustry.world.blocks.units; class RepairTower, class RepairTowerBuild |
| `core/src/mindustry/world/blocks/units/RepairTurret.java` | 8484 | `35babf70289f` | mindustry.world.blocks.units; class RepairTurret, class RepairPointBuild |
| `core/src/mindustry/world/blocks/units/UnitAssembler.java` | 27248 | `f17be1556fda` | mindustry.world.blocks.units; class UnitAssembler, class AssemblerUnitPlan, class YeetData, class UnitAssemblerBuild |
| `core/src/mindustry/world/blocks/units/UnitAssemblerModule.java` | 4227 | `944f3a68dfec` | mindustry.world.blocks.units; class UnitAssemblerModule, class UnitAssemblerModuleBuild |
| `core/src/mindustry/world/blocks/units/UnitBlock.java` | 1013 | `ade6b14edc06` | mindustry.world.blocks.units; class UnitBlock, class UnitBuild |
| `core/src/mindustry/world/blocks/units/UnitCargoLoader.java` | 5567 | `0a95fb6183e7` | mindustry.world.blocks.units; class UnitCargoLoader, class UnitTransportSourceBuild |
| `core/src/mindustry/world/blocks/units/UnitCargoUnloadPoint.java` | 2920 | `eb1343f3a572` | mindustry.world.blocks.units; class UnitCargoUnloadPoint, class UnitCargoUnloadPointBuild |
| `core/src/mindustry/world/blocks/units/UnitFactory.java` | 16889 | `fca98bc2ab8d` | mindustry.world.blocks.units; class UnitFactory, class UnitPlan, class UnitFactoryBuild |
| `core/src/mindustry/world/consumers/Consume.java` | 1991 | `a58751bd033a` | mindustry.world.consumers; class Consume |
| `core/src/mindustry/world/consumers/ConsumeCoolant.java` | 818 | `4de4e46a7438` | mindustry.world.consumers; class ConsumeCoolant |
| `core/src/mindustry/world/consumers/ConsumeItemCharged.java` | 506 | `3195c23b8ce9` | mindustry.world.consumers; class ConsumeItemCharged |
| `core/src/mindustry/world/consumers/ConsumeItemDynamic.java` | 1892 | `277138ff3642` | mindustry.world.consumers; class ConsumeItemDynamic |
| `core/src/mindustry/world/consumers/ConsumeItemEfficiency.java` | 718 | `2322a9178af6` | mindustry.world.consumers; class ConsumeItemEfficiency |
| `core/src/mindustry/world/consumers/ConsumeItemExplode.java` | 1744 | `c31bb5cf2a01` | mindustry.world.consumers; class ConsumeItemExplode |
| `core/src/mindustry/world/consumers/ConsumeItemExplosive.java` | 506 | `bd19635d4820` | mindustry.world.consumers; class ConsumeItemExplosive |
| `core/src/mindustry/world/consumers/ConsumeItemFilter.java` | 2139 | `a1bc49e422e1` | mindustry.world.consumers; class ConsumeItemFilter |
| `core/src/mindustry/world/consumers/ConsumeItemFlammable.java` | 513 | `2b62c9c68273` | mindustry.world.consumers; class ConsumeItemFlammable |
| `core/src/mindustry/world/consumers/ConsumeItemList.java` | 931 | `d2f9c9d94834` | mindustry.world.consumers; class ConsumeItemList |
| `core/src/mindustry/world/consumers/ConsumeItemRadioactive.java` | 526 | `1cb1abe26831` | mindustry.world.consumers; class ConsumeItemRadioactive |
| `core/src/mindustry/world/consumers/ConsumeItems.java` | 1695 | `8f965c8dcb81` | mindustry.world.consumers; class ConsumeItems |
| `core/src/mindustry/world/consumers/ConsumeLiquid.java` | 1567 | `22acc3b1a483` | mindustry.world.consumers; class ConsumeLiquid |
| `core/src/mindustry/world/consumers/ConsumeLiquidBase.java` | 464 | `9995a9d152cf` | mindustry.world.consumers; class ConsumeLiquidBase |
| `core/src/mindustry/world/consumers/ConsumeLiquidFilter.java` | 2602 | `7eb3834cf92e` | mindustry.world.consumers; class ConsumeLiquidFilter |
| `core/src/mindustry/world/consumers/ConsumeLiquidFlammable.java` | 883 | `0925600421a7` | mindustry.world.consumers; class ConsumeLiquidFlammable |
| `core/src/mindustry/world/consumers/ConsumeLiquids.java` | 1839 | `82ba56560f8c` | mindustry.world.consumers; class ConsumeLiquids |
| `core/src/mindustry/world/consumers/ConsumeLiquidsDynamic.java` | 2021 | `7d4d3690646f` | mindustry.world.consumers; class ConsumeLiquidsDynamic |
| `core/src/mindustry/world/consumers/ConsumePayloadDynamic.java` | 2224 | `a33cf8c297bc` | mindustry.world.consumers; class ConsumePayloadDynamic |
| `core/src/mindustry/world/consumers/ConsumePayloadFilter.java` | 1831 | `67cd22cda13a` | mindustry.world.consumers; class ConsumePayloadFilter |
| `core/src/mindustry/world/consumers/ConsumePayloads.java` | 1722 | `886f5c94e477` | mindustry.world.consumers; class ConsumePayloads |
| `core/src/mindustry/world/consumers/ConsumePower.java` | 1784 | `f4b92e9f3a8b` | mindustry.world.consumers; class ConsumePower |
| `core/src/mindustry/world/consumers/ConsumePowerCondition.java` | 500 | `95a90e0d596e` | mindustry.world.consumers; class ConsumePowerCondition |
| `core/src/mindustry/world/consumers/ConsumePowerDynamic.java` | 911 | `15a70ba0ca8d` | mindustry.world.consumers; class ConsumePowerDynamic |
| `core/src/mindustry/world/draw/DrawArcSmelt.java` | 1898 | `446c3877a956` | mindustry.world.draw; class DrawArcSmelt |
| `core/src/mindustry/world/draw/DrawBlock.java` | 1973 | `067b59bc1823` | mindustry.world.draw; class DrawBlock |
| `core/src/mindustry/world/draw/DrawBlockParts.java` | 1493 | `0a1d839e3109` | mindustry.world.draw; class DrawBlockParts |
| `core/src/mindustry/world/draw/DrawBlurSpin.java` | 979 | `b7362378158d` | mindustry.world.draw; class DrawBlurSpin |
| `core/src/mindustry/world/draw/DrawBubbles.java` | 1307 | `a4bd1401d9a6` | mindustry.world.draw; class DrawBubbles |
| `core/src/mindustry/world/draw/DrawCells.java` | 1491 | `98c88b49cb7b` | mindustry.world.draw; class DrawCells |
| `core/src/mindustry/world/draw/DrawCircles.java` | 1051 | `034e59f56dfe` | mindustry.world.draw; class DrawCircles |
| `core/src/mindustry/world/draw/DrawCrucibleFlame.java` | 1987 | `ad39e414c5ae` | mindustry.world.draw; class DrawCrucibleFlame |
| `core/src/mindustry/world/draw/DrawCultivator.java` | 1395 | `87af80f891d6` | mindustry.world.draw; class DrawCultivator |
| `core/src/mindustry/world/draw/DrawDefault.java` | 611 | `363955eebef7` | mindustry.world.draw; class DrawDefault |
| `core/src/mindustry/world/draw/DrawFade.java` | 635 | `e5a7365dee49` | mindustry.world.draw; class DrawFade |
| `core/src/mindustry/world/draw/DrawFlame.java` | 2052 | `ecba1f0e3015` | mindustry.world.draw; class DrawFlame |
| `core/src/mindustry/world/draw/DrawFrames.java` | 1092 | `f8af9cbff7fc` | mindustry.world.draw; class DrawFrames |
| `core/src/mindustry/world/draw/DrawGlowRegion.java` | 1515 | `38844615a2f3` | mindustry.world.draw; class DrawGlowRegion |
| `core/src/mindustry/world/draw/DrawHeatInput.java` | 1506 | `4aa3fe6d13b8` | mindustry.world.draw; class DrawHeatInput |
| `core/src/mindustry/world/draw/DrawHeatOutput.java` | 2103 | `d423dfbaf7ed` | mindustry.world.draw; class DrawHeatOutput |
| `core/src/mindustry/world/draw/DrawHeatRegion.java` | 1363 | `88da1db72513` | mindustry.world.draw; class DrawHeatRegion |
| `core/src/mindustry/world/draw/DrawLiquidOutputs.java` | 2070 | `dfd9e6cfd0d6` | mindustry.world.draw; class DrawLiquidOutputs |
| `core/src/mindustry/world/draw/DrawLiquidRegion.java` | 1076 | `639b3c0dfa47` | mindustry.world.draw; class DrawLiquidRegion |
| `core/src/mindustry/world/draw/DrawLiquidTile.java` | 1175 | `843d81c93fa0` | mindustry.world.draw; class DrawLiquidTile |
| `core/src/mindustry/world/draw/DrawMulti.java` | 1571 | `83ffdcf4abb0` | mindustry.world.draw; class DrawMulti |
| `core/src/mindustry/world/draw/DrawMultiWeave.java` | 1520 | `69491b9839c8` | mindustry.world.draw; class DrawMultiWeave |
| `core/src/mindustry/world/draw/DrawParticles.java` | 2219 | `ec9beea9fa54` | mindustry.world.draw; class DrawParticles |
| `core/src/mindustry/world/draw/DrawPistons.java` | 1952 | `98826c889c7b` | mindustry.world.draw; class DrawPistons |
| `core/src/mindustry/world/draw/DrawPlasma.java` | 1571 | `f8a88f57780f` | mindustry.world.draw; class DrawPlasma |
| `core/src/mindustry/world/draw/DrawPower.java` | 2228 | `78816766324a` | mindustry.world.draw; class DrawPower |
| `core/src/mindustry/world/draw/DrawPulseShape.java` | 1670 | `04f065475001` | mindustry.world.draw; class DrawPulseShape |
| `core/src/mindustry/world/draw/DrawPumpLiquid.java` | 675 | `67f720b998a2` | mindustry.world.draw; class DrawPumpLiquid |
| `core/src/mindustry/world/draw/DrawRegion.java` | 2378 | `5643e1c960e3` | mindustry.world.draw; class DrawRegion |
| `core/src/mindustry/world/draw/DrawShape.java` | 688 | `cc903264f50d` | mindustry.world.draw; class DrawShape |
| `core/src/mindustry/world/draw/DrawSideRegion.java` | 886 | `d68d900c5e45` | mindustry.world.draw; class DrawSideRegion |
| `core/src/mindustry/world/draw/DrawSoftParticles.java` | 1969 | `cc1946fcaa41` | mindustry.world.draw; class DrawSoftParticles |
| `core/src/mindustry/world/draw/DrawSpikes.java` | 924 | `2c211d188015` | mindustry.world.draw; class DrawSpikes |
| `core/src/mindustry/world/draw/DrawTurret.java` | 5456 | `2d43bdb4fc8e` | mindustry.world.draw; class DrawTurret |
| `core/src/mindustry/world/draw/DrawWarmupRegion.java` | 903 | `47f5382ad5c9` | mindustry.world.draw; class DrawWarmupRegion |
| `core/src/mindustry/world/draw/DrawWeave.java` | 943 | `152ffd22f9d0` | mindustry.world.draw; class DrawWeave |
| `core/src/mindustry/world/meta/Attribute.java` | 2099 | `d2c115ce5885` | mindustry.world.meta; class Attribute |
| `core/src/mindustry/world/meta/BlockFlag.java` | 1068 | `f6ee99ab5f37` | mindustry.world.meta; enum BlockFlag |
| `core/src/mindustry/world/meta/BlockGroup.java` | 468 | `decc64beb4d7` | mindustry.world.meta; enum BlockGroup |
| `core/src/mindustry/world/meta/BlockStatus.java` | 371 | `733dd0bdcfdd` | mindustry.world.meta; enum BlockStatus |
| `core/src/mindustry/world/meta/BuildVisibility.java` | 1803 | `3ebdd31af90b` | mindustry.world.meta; class BuildVisibility |
| `core/src/mindustry/world/meta/Env.java` | 672 | `ab61498fd3d5` | mindustry.world.meta; class Env |
| `core/src/mindustry/world/meta/Stat.java` | 5295 | `e81e653e0b56` | mindustry.world.meta; class Stat |
| `core/src/mindustry/world/meta/StatCat.java` | 929 | `53f5e0e85fbd` | mindustry.world.meta; class StatCat |
| `core/src/mindustry/world/meta/StatUnit.java` | 2023 | `ecc855db3ebc` | mindustry.world.meta; class StatUnit |
| `core/src/mindustry/world/meta/StatValue.java` | 387 | `4e208d54242e` | mindustry.world.meta; interface StatValue |
| `core/src/mindustry/world/meta/StatValues.java` | 37504 | `071706cbeccf` | mindustry.world.meta; class StatValues |
| `core/src/mindustry/world/meta/Stats.java` | 4555 | `586c3f8f96a7` | mindustry.world.meta; class Stats |
| `core/src/mindustry/world/modules/BlockModule.java` | 353 | `0c7386d270c9` | mindustry.world.modules; class BlockModule |
| `core/src/mindustry/world/modules/ItemModule.java` | 8834 | `3d2c989bfb3f` | mindustry.world.modules; class ItemModule, interface ItemConsumer, interface ItemCalculator |
| `core/src/mindustry/world/modules/LiquidModule.java` | 5295 | `67b2f01b0799` | mindustry.world.modules; class LiquidModule, interface LiquidConsumer, interface LiquidCalculator |
| `core/src/mindustry/world/modules/PowerModule.java` | 1137 | `a4679d9affe7` | mindustry.world.modules; class PowerModule |
| `desktop/build.gradle` | 7449 | `fac4f00ebf12` |  |
| `desktop/src/mindustry/desktop/DesktopLauncher.java` | 23235 | `ab34f9e84733` | mindustry.desktop; class DesktopLauncher |
| `desktop/src/mindustry/desktop/ErrorDialog.java` | 805 | `7e6503b17ccf` | mindustry.desktop; class ErrorDialog |
| `desktop/src/mindustry/desktop/steam/SNet.java` | 18916 | `93f0cce6c1ef` | mindustry.desktop.steam; class SNet, class SteamConnection |
| `desktop/src/mindustry/desktop/steam/SStats.java` | 1273 | `aed437e86c1e` | mindustry.desktop.steam; class SStats |
| `desktop/src/mindustry/desktop/steam/SUser.java` | 179 | `d830df34f99f` | mindustry.desktop.steam; class SUser |
| `desktop/src/mindustry/desktop/steam/SVars.java` | 232 | `e062876a7366` | mindustry.desktop.steam; class SVars |
| `desktop/src/mindustry/desktop/steam/SWorkshop.java` | 13576 | `75b1f4f22f6a` | mindustry.desktop.steam; class SWorkshop |
| `gradle.properties` | 1471 | `da74a3d39526` |  |
| `gradle/wrapper/gradle-wrapper.properties` | 202 | `5d84d66258f6` |  |
| `ios/build.gradle` | 2478 | `4b0f547404df` |  |
| `ios/data/Assets.xcassets/AppIcon.appiconset/Contents.json` | 2134 | `5e8f5814e51a` |  |
| `ios/data/Assets.xcassets/Contents.json` | 60 | `00c3e3c28a50` |  |
| `ios/src/mindustry/ios/IOSLauncher.java` | 11086 | `32d33d2b0415` | mindustry.ios; class IOSLauncher, class ChooserDelegate |
| `server/build.gradle` | 2415 | `d439052ea60c` |  |
| `server/src/mindustry/server/ServerControl.java` | 51398 | `2a445a379d5e` | mindustry.server; class ServerControl |
| `server/src/mindustry/server/ServerLauncher.java` | 2633 | `014d2750d433` | mindustry.server; class ServerLauncher |
| `servers_v6.json` | 513 | `d9b75553052c` |  |
| `servers_v7.json` | 6255 | `de84df47a74b` |  |
| `settings.gradle` | 1468 | `55437d53dcf5` |  |
| `tests/build.gradle` | 59 | `cc6412dee3d2` |  |
| `tests/src/test/java/ApplicationTests.java` | 35756 | `721e9b07a54f` | class ApplicationTests |
| `tests/src/test/java/GenericModTest.java` | 1091 | `e90182949d3a` | class GenericModTest |
| `tests/src/test/java/ModTestAllure.java` | 1445 | `f1476d2f5ca5` | class ModTestAllure |
| `tests/src/test/java/PatcherTests.java` | 20666 | `6ff793ccbe8c` | class PatcherTests |
| `tests/src/test/java/power/ConsumeGeneratorTests.java` | 8414 | `caa2d635c018` | power; class ConsumeGeneratorTests, enum InputType |
| `tests/src/test/java/power/DirectConsumerTests.java` | 1798 | `496daaa127bb` | power; class DirectConsumerTests |
| `tests/src/test/java/power/PowerTestFixture.java` | 3462 | `174f87d7283c` | power; class PowerTestFixture |
| `tests/src/test/java/power/PowerTests.java` | 8550 | `6bd44ce3c999` | power; class PowerTests, class PowerGraphTests |
| `tools/build.gradle` | 12810 | `32c26709f44d` |  |
| `tools/src/mindustry/tools/Generators.java` | 39427 | `ea85c27e1617` | mindustry.tools; class Generators |
| `tools/src/mindustry/tools/IconConverter.java` | 8855 | `8b83a65c3345` | mindustry.tools; class IconConverter |
| `tools/src/mindustry/tools/ImagePacker.java` | 10587 | `c779b2a209ef` | mindustry.tools; class ImagePacker, class GenRegion, class PackIndex |
| `tools/src/mindustry/tools/ImageTileGenerator.java` | 7706 | `a8319b6e176b` | mindustry.tools; class ImageTileGenerator |
| `tools/src/mindustry/tools/ScriptMainGenerator.java` | 5531 | `4c12619d95f1` | mindustry.tools; class ScriptMainGenerator |
