package com.example.feign.impl;

import com.example.entity.Student;
import com.example.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findall() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护";
    }
}
