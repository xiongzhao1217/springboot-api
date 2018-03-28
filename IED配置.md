## IDE配置
### Intellij 配置 [[下载地址(请下载Ultimate版本)](https://www.jetbrains.com/idea/download)][[破解方法](http://idea.lanyus.com)]
##### 快速开发配置
1. 智能提示忽略大小写
* Preferences(windows为Setting)->搜索code completion->点击Case sensitive completion后面的选择框->选中None，保存即可。<br>
![智能提示忽略大小写](https://github.com/xiongzhao1217/markdown-photos/blob/master/C911435974FE848F06993BE3F1975CA1.jpg?raw=true)

2. 自动生成 serialVersionUIDD
* Preferences(windows为Setting)->Inspections->Serialization issues->Serializable class without ’serialVersionUID’ 
选上以后，在你的class中：Option+Enter(Windows为Alt+Enter)就会提示自动创建serialVersionUID了。<br>
![自动生成序列号](https://github.com/xiongzhao1217/markdown-photos/blob/master/serializableID.jpg?raw=true)

3. springboot项目热部署(非springboot项目略过)
* Preferences(windows为Setting)->Build, Execution, Deployment->Compiler->勾选Build project automatically
![自动生成序列号](https://github.com/xiongzhao1217/markdown-photos/blob/master/ide-autobuild.jpg?raw=true)

4. 阿里Java开发规范插件
* Preferences(windows为Setting)->Plugins->Browse repositories->搜索Alibaba->安装Alibaba Java coding...并重启ide
![阿里Java开发规范](https://github.com/xiongzhao1217/markdown-photos/blob/master/ide-alibaba.jpg?raw=true)

5. 添加jdk
* 点击file->Project Structure->SDKs->点击加号选择本地jdk的HOME路径<br>
![配置git](https://github.com/xiongzhao1217/markdown-photos/blob/master/ide-jdk.jpg?raw=true)

6. 配置git
* mac系统自带git命令，执行文件路径为/usr/bin/git，windows系统请[下载gitbash](http://gitforwindows.org/)并安装
* Preferences(windows为Setting)->搜索git->选择本地git执行文件<br>
![配置git](https://github.com/xiongzhao1217/markdown-photos/blob/master/ide-git.jpg?raw=true)

7. 配置maven
* Preferences(windows为Setting)->搜索maven->选择本地maven根目录、maven setting文件->保存即可<br>
![配置maven](https://github.com/xiongzhao1217/markdown-photos/blob/master/mvn.jpg?raw=true)

8. 配置tomcat(spring boot项目使用嵌入式web容器，请忽略该配置)
* Preferences(windows为Setting)->搜索server->点击Application Servers->点击右侧左上角加号->弹出对话框中选择本地tomcat根目录->保存即可<br>
![配置tomcat01](https://github.com/xiongzhao1217/markdown-photos/blob/master/ide-tomcat01.jpg?raw=true)<br>
![配置tomcat02](https://github.com/xiongzhao1217/markdown-photos/blob/master/ide-tomcat02.jpg?raw=true)
#### 到此，intellij配置完成.
