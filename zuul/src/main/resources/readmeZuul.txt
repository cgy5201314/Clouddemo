  zuul网关也可以实现负载均衡
  1.新建module
  2.添加eureka-client依赖(因为它需要注册在eureka里,还有netflix-zuul申明是一个网关
  3.添加配置文件yml, 端口号    server.port: 8030
                 注册名字    spring.application.name: gateway
              服务注册中心地址 eureka.client.service-url.deafultZone: http://localhost:8761/eureka/
     #别名p通过这个地址访问的就是provider映射 zuul.routes.provider: /p/**

  4.添加启动类  写返回restTemplate方法
  且用@EnableAutoConfiguration   自动装载配置符合条件的configuration到ioc
     @EnableZuulProxy           网关代理声明包含enablezuulServer
  5.后续可以通过localhost:8030/p/xxx地址访问提供者的方法功能