  consumer消费者
  1.新建module
  2.添加eureka-client依赖(因为它需要注册在eureka里
  3.添加配置文件yml, 端口号    server.port: 8020
                 注册名字    spring.application.name: consumer1
              服务注册中心地址 eureka.client.service-url.deafultZone: http://localhost:8761/eureka/
                 #ip地址注册 instance.prefer-ip-address: true

  4.添加启动类  写返回restTemplate方法 用@Bean注册
  5.添加需要的实体entity,
  6.controller包里加handler,写好自己的调用的方法路径,
  然后通过restTemplate.getForObject("http://localhost:8010/student/index",String.class)
  .getForEntity("http://localhost:8010/student/findall",Collection.class).getBody() ;
  调用provider里写的方法,