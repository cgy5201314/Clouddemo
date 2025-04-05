package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//自动装载配置符合条件的configuration到ioc
@EnableAutoConfiguration
@EnableZuulProxy
//网关代理声明包含enablezuulServer
//负载均衡就是多个provider提供服务,通过网关可以让多个服务提供者交替提供服务
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
