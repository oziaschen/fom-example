> 使用fom-context.jar写一个java工程的example

* 访问URL：http://localhost:4545/fom(端口和context-path在application.properties中配置)
* 应用启动类：com.fom.boot.Application, 在eclipse中启动时设置下jvm参数-Dlog.root="本地工程路径"，不然日志会打到class编译的bin目录

* 路径
1. 默认应用的根目录为路径为class资源的目录，可以通过启动参数-Dwebapp.root指定
2. 默认缓存(处理过程中产生的文件)路径为根目录下的WEB-INF/cache目录，如果不存在则为根目录下的cache目录，也可以通过启动参数-Dcache.root指定
3. 默认日志的输出路径为根目录下的log目录，也可以通过启动参数-Dlog.root进行指定，在eclipse中启动的话建议配置启动参数-Dlog.root为当前工程目录，比如：-Dlog.root="E:/workspce/fom/fom-example/log"，不然应用会将日志根目录默认为eclipse的编译结果目录。

* 配置
1. spring配置：应用启动时会加载根目录下所有带有spring的名字的xml文件
2. fom配置：默认读取根目录下的WEB-INF/fom.xml文件，也可以通过启动参数-DfomConfigLocation指定（相对路径）
3. pool配置：默认读取根目录下WEB-INF/pool.xml文件，也可以通过启动参数-DpoolConfigLocation指定（相对路径）
4. log4j配置：默认读取根目录下WEB-INF/log4j.properties文件，也可以通过启动参数-Dlog4jConfigLocation指定（相对路径）

