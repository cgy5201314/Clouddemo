 Eureka服务注册中心
  1.新建module
  2.添加eureka-server依赖(声明服务注册中心
  3.添加配置文件yml, 端口号    server.port: 8761
     #注册中心访问地址      eureka.client.serviceUrl.defaultZone: http://localhost:8761/eureka/
         #是否注册自己      eureka.client.register-with-eureka: false
         #是否获取其他eureka同步   eureka.client.fetch-registry: false

  4.添加启动类  用@EnableEurekaServer注解声明是一个eureka
  5.访问http://localhost:8761即可
