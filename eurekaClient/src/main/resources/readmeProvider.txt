  Provider提供者
  1.新建module
  2.添加eureka-client依赖(因为它需要注册在eureka里
  3.添加配置文件yml, 端口号    server.port: 8010
                 注册名字    spring.application.name: provider
              服务注册中心地址 eureka.client.service-url.deafultZone: http://localhost:8761/eureka/
                 #ip地址注册 instance.prefer-ip-address: true

  4.添加启动类  写返回restTemplate方法 用@Bean注册
  5.添加需要的实体entity,
  6.controller包里加handler,写好自己的调用的方法路径,
  7.repository包里添加实体接口定义好所有的方法
  8.repository包建impl包然后对接口定义的方法一一实现,然后handler里定义方法及路径,调用接口方法