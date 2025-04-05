  ribbon可以实习负载均衡
  1.新建module
  2.添加eureka-client依赖(因为它需要注册在eureka里
  3.添加配置文件yml, 端口号    server.port: 8040
                 注册名字    spring.application.name: ribbon
              服务注册中心地址 eureka.client.service-url.deafultZone: http://localhost:8761/eureka/
                自己的IP注册  eureka.instance:prefer-ip-address: true
  4.添加启动类  写返回restTemplate方法 且用@Bean注册,@LoadBalanced注解实现负载均衡





