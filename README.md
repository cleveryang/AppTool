# AppTool

  自己常用的一些工具类，整理于网络，方便自己使用和修改
  
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
