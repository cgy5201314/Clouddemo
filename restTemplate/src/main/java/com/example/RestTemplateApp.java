package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApp {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApp.class,args);
    }
//    只需要添加这个方法返回RestTemplate就可以获取实例rest
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
