# TinkerHotFix
Tinker热更新
打包后，执行gradlew tinkerPatchRelease指令，生成patch_signed_7zip.apk补丁文件   
执行adb push ./app/build/outputs/apk/tinkerPatch/release/patch_signed_7zip.apk /storage/sdcard0/语句将patch_signed_7zip.apk复制到根目录  
