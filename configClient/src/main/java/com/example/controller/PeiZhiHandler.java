package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peizhi")
public class PeiZhiHandler {
    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index(){
        return this.port;
    }

}
