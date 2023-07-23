# Windows

https://online-converting.com/image/png-ico/


#Image Scale
https://bigjpg.com/


#Mac

## create iconset

```shell
    sips -z 16 16 icon.png -o icons.iconset/icon_16x16.png
    sips -z 32 32 icon.png -o icons.iconset/icon_16x16@2x.png
    sips -z 32 32 icon.png -o icons.iconset/icon_32x32.png
    sips -z 64 64 icon.png -o icons.iconset/icon_32x32@2x.png
    sips -z 128 128 icon.png -o icons.iconset/icon_128x128.png
    sips -z 256 256 icon.png -o icons.iconset/icon_128x128@2x.png
    sips -z 256 256 icon.png -o icons.iconset/icon_256x256.png
    sips -z 512 512 icon.png -o icons.iconset/icon_256x256@2x.png
    sips -z 512 512 icon.png -o icons.iconset/icon_512x512.png
    sips -z 1024 1024 icon.png -o icons.iconset/icon_512x512@2x.png
```

## create icns

```shell
    iconutil -c icns icons.iconset -o icon.icns
```