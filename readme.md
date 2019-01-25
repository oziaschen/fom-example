> 考虑到不熟悉maven的同学，直接用fom-context.jar及其依赖以examples写一个普通java工程的示例

* 访问URL：http://localhost:4040/fom/index.html(端口和context-path在application.properties中配置)
* 应用启动类：com.fom.boot.Application

* 路径
1. 默认应用的根目录为路径为class资源的目录，可以通过启动参数-Dwebapp.root指定
2. 默认缓存(处理过程中产生的文件)路径为根目录下的WEB-INF/cache目录，如果不存在则为根目录下的cache目录，也可以通过启动参数-Dcache.root指定
3. 默认日志的输出路径为根目录下的log目录，也可以通过启动参数-Dlog.root进行指定，在eclipse中启动的话建议配置启动参数-Dlog.root为当前工程目录，比如：-Dlog.root="E:/workspce/fom/fom-example/log"，不然应用会将日志根目录默认为eclipse的编译结果目录。

* 配置
1. spring配置：应用启动时会加载根目录下所有带有spring的名字的xml文件
2. fom配置：默认读取根目录下的WEB-INF/fom.xml文件，也可以通过启动参数-DfomConfigLocation指定（相对路径）
3. pool配置：默认读取根目录下WEB-INF/pool.xml文件，也可以通过启动参数-DpoolConfigLocation指定（相对路径）
4. log4j配置：默认读取根目录下WEB-INF/log4j.properties文件，也可以通过启动参数-Dlog4jConfigLocation指定（相对路径）

* examples
1. example1  解析本地普通文本文件，使用自定义pool方式导入es，依赖elasticsearch环境，配置在WEB-INF/pool.xml；
2. example2  解析本地普通文本文件，使用mybatis方式导入mysql，依赖mysql环境(sql/mysql.demo.sql)，配置在dataSource/spring_datasource_mysql_example.xml；
3. example3  解析本地普通文本文件，使用自定义pool方式导入mysql，依赖mysql环境(sql/mysql.demo.sql)，配置在WEB-INF/pool.xml；
4. example4  解析本地普通文本文件的zip包，使用mybatis方式导入oracle，依赖oracle环境(sql/oracle.demo.sql)，配置在dataSource/spring_datasource_oracle_example.xml；
5. example5  解析本地普通文本文件的zip包，使用自定义pool方式导入oracle，依赖oracle环境(sql/oracle.demo.sql)，配置在WEB-INF/pool.xml；
6. example6  下载HDFS服务指定目录下的文件，依赖大数据集群环境，由于没有本地环境，所以将其注释掉了；
7. example7  下载并打包HDFS服务指定目录下的目录，依赖大数据集群环境，由于没有本地环境，所以将其注释掉了；
