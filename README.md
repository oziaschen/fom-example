##概要
* 将fom-context.jar和fom中的examples拿出来，写了一个普通java工程
* 启动类：com.fom.boot.Application（在eclipse中启动建议配下启动参数：-Dlog.root="项目工程路径/log"，方便看日志）
* 访问URL：http://localhost:4040/fom/index.html

##启动参数
* -Dwebapp.root：设置资源根目录，默认将classpath作为根目录
* -Dcache.root：  设置缓存文件目录，默认为${webapp.root}/WEB-INF/cache（如果WEB-INF不存在则为${webapp.root}/cache）
* -Dlog.root：设置日志文件目录，默认为${webapp.root}/log
* -Dlog4jConfigLocation：设置log4j配置文件路径，默认位置：${webapp.root}/WEB-INF/log4j.properties
* -DfomConfigLocation： 设置fom配置文件路径，默认位置：${webapp.root}/WEB-INF/fom.xml
* -DpoolConfigLocation：设置pool配置文件路径，默认位置：${webapp.root}/WEB-INF/pool.xml