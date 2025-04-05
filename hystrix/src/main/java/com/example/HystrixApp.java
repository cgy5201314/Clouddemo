package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//申明启用数据监控
@EnableCircuitBreaker
//可视化数据监控
@EnableHystrixDashboard
public class HystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApp.class,args);
    }
}
