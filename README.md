# AppTool

  此功能网上都有较好的整理，但有时使用还是不方便，有的分散，有的繁琐。
  因此将自己常用的一些工具类，整理一下，方便自己使用和修改
  
 ## 如何使用它

> Step 1.先在 build.gradle(Project:XXXX) 的 repositories 添加::

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
> Step 2. 然后在 build.gradle(Module:app) 的 dependencies 添加:

	dependencies {
	      compile 'com.github.cleveryang:AppTool:v1.8.3.22'//请替换成上方 JitPack 最新的版本号
	}

## 近期更新日志

    v1.8.3.22 版本 增加
              NbActivityTool              : Activity管理工具类
              NbIntentTool                : Intent获取管理类
              NbFileTool                  : 文件管理工具类
              NbDataTool                  : 数据工具类
              NbConstTool                 : 常量工具类
              NbEncodeTool                : 编码解码相关工具类
              NbEncryptTool               : 加密解密相关的工具类
              NbPhotoTool                 : 图片获取工具类
	      
## 功能模块介绍

> Activity相关 ->NbActivityTool

    addActivity                 : 添加Activity 到栈
    currentActivity             : 获取当前的Activity（堆栈中最后一个压入的)
    finishActivity              : 结束当前Activity（堆栈中最后一个压入的）
    finishAllActivity           : 结束所有的Activity
    AppExit                     : 退出当前APP
    getActivityStack            : 获取Activity栈

    单个Activity操作
    isExistActivity             : 判断是否存在指定Activity
    launchActivity              : 打开指定的Activity
    skipActivity                : 跳转到指定Activity
    skipActivityAndFinish       : 跳转到指定Activity并关闭当前Activity
    skipActivityAndFinishAll    : 跳转后Finish之前所有的Activity
    skipActivityForResult       : activityForResult封装
    getLauncherActivity         : 获取launcher activity
    
> Intent相关 -> NbIntentTool.java

    getInstallAppIntent         : 获取安装App(支持7.0)的意图
    getUninstallAppIntent       : 获取卸载App的意图
    getLaunchAppItent           : 获取打开App的意图
    getAppInfoIntent            : 获取App信息的意图
    getShareInfoIntent          : 获取App信息分享的意图
    getIntentByPackageName      : 根据包名获取意图
    getComponentNameIntent      : 获取其他应用的Intent
    
> 文件操作相关 -> NbFileTool.java

    SD卡操作
    getRootPath                 : 得到SD卡根目录
    getCecheFolder              : 获取本应用图片缓存目录
    isSDCardEnable              : 判断SD卡是否打开
    getSDCardPath               : 获取SD卡路径
    getDataPath                 : 获取SD卡Data路径
    getFreeSpace                : 获取SD卡剩余空间
    sdCardIsAvailable           : SD卡是否可用

    fileExists                  : 文件或者文件夹是否存在
    delAllFile                  : 删除指定文件夹下所有文件, 不保留文件夹.
    copy                        : 文件复制(文件路径)
    copyFile                    : 复制文件(文件/InputStream流)
    copyFolder                  : 复制整个文件夹内
    renameFile                  : 重命名文件
    getSDCardAvailaleSize       : 获取磁盘可用空间
    getDirSize                  : 获取某个目录可用大小
    getFileAllSize              : 获取文件或者文件夹大小
    initFile                    : 创建一个文件
    initDirectory               : 创建一个文件夹
    saveFile                    : 保存InputStream流到文件
    saveFileUTF8                : 用UTF8保存一个文件
    getFileUTF8                 : 用UTF8读取一个文件
    getFileIntent               : 得到一个文件Intent
    getDiskCacheDir             : 获取缓存目录
    getDiskFileDir              : 获取缓存视频文件目录
    mergeFiles                  : 多个文件拼接合并
    getNativeM3u                : 将在线的m3u8替换成本地的m3u8
    write                       : 将字符串 保存成 文件
    TextToFile                  : 传入文件名以及字符串, 将字符串信息保存到文件中
    GetAllFileName              : 获取 搜索的路径 下的 所有 后缀 的文件
    readFileByLines             : 以行为单位读取文件，常用于读面向行的格式化文件
    getFileByPath               : 根据文件路径获取文件
    isFileExists                : 判断文件是否存在
    isDir                       : 判断是否是目录
    isFile                      : 判断是否是文件
    createOrExistsDir           : 判断目录是否存在，不存在则判断是否创建成功
    createOrExistsFile          : 判断文件是否存在，不存在则判断是否创建成功
    createFileByDeleteOldFile   : 判断文件是否存在，存在则在创建之前删除
    copyOrMoveDir               : 复制或移动目录
    copyOrMoveFile              : 复制或移动文件
    copyDir                     : 复制目录
    copyFile                    : 复制文件
    moveDir                     : 移动目录
    moveFile                    : 移动文件
    deleteDir                   : 删除目录
    deleteFile                  : 删除文件
    listFilesInDir              : 获取目录下所有文件
    listFilesInDirWithFilter    : 获取目录下所有后缀名为suffix的文件
    searchFileInDir             : 获取目录下指定文件名的文件包括子目录
    writeFileFromIS             : 将输入流写入文件
    writeFileFromString         : 将字符串写入文件
    readFile2List               : 指定编码按行读取文件到List
    readFile2String             : 指定编码按行读取文件到字符串中
    readFile2Bytes              : 指定编码按行读取文件到字符数组中
    getFileCharsetSimple        : 简单获取文件编码格式
    getFileLines                : 获取文件行数
    getFileSize                 : 获取文件大小
    getFileMD5                  : 获取文件的MD5校验码
    closeIO                     : 关闭IO
    getDirName                  : 获取全路径中的最长目录
    getFileName                 : 获取全路径中的文件名
    getFileNameNoExtension      : 获取全路径中的不带拓展名的文件名
    getFileExtension            : 获取全路径中的文件拓展名

    清除数据
    cleanInternalCache          : 清除内部缓存
    cleanInternalFiles          : 清除内部文件
    cleanInternalDbs            : 清除内部数据库
    cleanInternalDbByName       : 根据名称清除数据库
    cleanInternalSP             : 清除内部SP
    cleanExternalCache          : 清除外部缓存
    cleanCustomCache            : 清除自定义目录下的文件
    
> 常量相关 -> NbConstTool.java

    存储相关常量
    BYTE                        : Byte与Byte的倍数
    KB                          : KB与Byte的倍数
    MB                          : MB与Byte的倍数
    GB                          : GB与Byte的倍数

    时间相关常量
    MSEC                        : 毫秒与毫秒的倍数
    SEC                         : 秒与毫秒的倍数
    MIN                         : 分与毫秒的倍数
    HOUR                        : 时与毫秒的倍数
    DAY                         : 天与毫秒的倍数

    正则相关常量
    REGEX_MOBILE_SIMPLE         : 手机号（简单）
    REGEX_MOBILE_EXACT          : 手机号（精确）
    REGEX_TEL                   : 电话号码
    REGEX_IDCARD15              : 身份证号码15位
    REGEX_IDCARD18              : 身份证号码18位
    REGEX_EMAIL                 : 邮箱
    REGEX_URL                   : URL
    REGEX_CHZ                   : 汉字
    REGEX_USERNAME              : 用户名，取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位
    REGEX_DATE                  : yyyy-MM-dd格式的日期校验，已考虑平闰年
    REGEX_IP                    : IP地址
    
> 数据处理相关 -> NbDataTool.java

    数据的判断
    isNullString                : 判断字符串是否为空 为空即true
    isEmpty                     : 判断对象是否为空 为空即true
    isInteger                   : 判断字符串是否是整数
    isDouble                    : 判断字符串是否是浮点数
    isNumber                    : 判断字符串是否是数字
    getAstro                    : 根据日期判断星座

    数据的转换
    stringToInt                 : 字符串转换成整数 ,转换失败将会 return 0;
    stringToLong                : 字符串转换成long ,转换失败将会 return 0;
    stringToDouble              : 字符串转换成double ,转换失败将会 return 0;
    simpleDateFormat            : 将date转换成format格式的日期
    Date2Timestamp              :  将日期字符串 按照 指定的格式 转换成 DATE
    getDate                     : 时间戳  转换成 指定格式的日期
    string2Timestamp            : 将 yyyy年MM月dd日 转换成 时间戳
    getCurrentDateTime          : 获取当前日期时间 / 得到今天的日期
    getYestoryDate              : 得到昨天的日期
    formatTime                  : 视频时间 转换成 "mm:ss"
    formatSeconds               : "mm:ss" 转换成 视频时间
    getDaysByYearMonth          : 根据年 月 获取对应的月份 天数
    StringToInputStream         : 字符串转InputStream
    upperFirstLetter            : 首字母大写
    lowerFirstLetter            : 首字母小写
    reverse                     : 反转字符串
    toDBC                       : 转化为半角字符
    toSBC                       : 转化为全角字符
    oneCn2ASCII                 : 单个汉字转成ASCII码
    oneCn2PY                    : 单个汉字转成拼音
    getPYFirstLetter            : 获得第一个汉字首字母
    cn2PY                       : 中文转拼音
    bytes2HexString             : byteArr转hexString
    hexString2Bytes             : hexString转byteArr
    hex2Dec                     : hexChar转int
    chars2Bytes                 : charArr转byteArr
    bytes2Chars                 : byteArr转charArr
    byte2Size                   : 字节数转以unit为单位的size
    size2Byte                   : 以unit为单位的size转字节数
    byte2FitSize                : 字节数转合适大小
    input2OutputStream          : inputStream转outputStream
    output2InputStream          : outputStream转inputStream
    inputStream2Bytes           : inputStream转byteArr
    bytes2InputStream           : byteArr转inputStream
    outputStream2Bytes          : outputStream转byteArr
    bytes2OutputStream          : outputStream转byteArr
    inputStream2String          : inputStream转string按编码
    string2InputStream          : string转inputStream按编码
    outputStream2String         : outputStream转string按编码
    string2OutputStream         : string转outputStream按编码
    
> 编码解码相关工具类 -> NbEncodeTool.java

    urlEncode                   : URL编码
    urlDecode                   : URL解码
    base64Encode                : Base64编码
    base64Encode2String         : Base64编码
    base64Decode                : Base64解码
    base64UrlSafeEncode         : Base64URL安全编码
    htmlEncode                  : Html编码
    htmlDecode                  : Html解码

> 加密解密相关的工具类 -> RxEncryptTool.java

    哈希加密相关
    encryptMD2ToString          : MD2加密
    encryptMD2                  : MD2加密
    encryptMD5ToString          : MD5加密
    encryptMD5                  : MD5加密
    encryptMD5File2String       : MD5加密文件
    encryptMD5File              : MD5加密文件
    encryptSHA1ToString         : SHA1加密
    encryptSHA1                 : SHA1加密
    encryptSHA224ToString       : SHA224加密
    encryptSHA224               : SHA224加密
    encryptSHA256ToString       : SHA256加密
    encryptSHA256               : SHA256加密
    encryptSHA384ToString       : SHA384加密
    encryptSHA384               : SHA384加密
    encryptSHA512ToString       : SHA512加密
    encryptSHA512               : SHA512加密
    encryptAlgorithm            : 对data进行algorithm算法加密

    DES加密相关
    DESTemplet                  : DES加密
    encryptDES                  : DES加密
    encryptDES2Base64           : DES加密后转为Base64编码
    encryptDES2HexString        : DES加密后转为16进制
    decryptBase64DES            : DES解密Base64编码密文
    decryptHexStringDES         : DES解密16进制密文
    decryptDES                  : DES解密

    3DES加密相关
    encrypt3DES2Base64          : 3DES加密后转为Base64编码
    encrypt3DES2HexString       : 3DES加密后转为16进制
    encrypt3DES                 : 3DES加密
    decryptBase64_3DES          : 3DES解密Base64编码密文
    decryptHexString3DES        : 3DES解密16进制密文
    decrypt3DES                 : 3DES解密

    AES加密相关
    encryptAES2Base64           : AES加密后转为Base64编码
    encryptAES2HexString        : AES加密后转为16进制
    encryptAES                  : AES加密
    decryptBase64AES            : AES解密Base64编码密文
    decryptHexStringAES         : AES解密16进制密文
    decryptAES                  : AES解密

> 图片获取相关 -> NbPhotoTool.java

    openCameraImage             : 调用系统相机
    openLocalImage              : 调用系统相册
    cropImage                   : 裁剪图片
    createImagePathUri          : 创建一条图片地址uri,用于保存拍照后的照片
    getRealFilePath             : 获取图片uri的真实文件地址
