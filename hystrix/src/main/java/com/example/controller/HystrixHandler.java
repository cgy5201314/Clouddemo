package com.example.controller;

import com.example.entity.Student;
import com.example.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("/findall")
    public Collection<Student> findAll(){
        return feignProviderClient.findall();
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }


}
