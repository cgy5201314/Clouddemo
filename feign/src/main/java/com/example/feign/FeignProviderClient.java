package com.example.feign;

import com.example.entity.Student;
import com.example.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
//声明式接口只需要添加注解不用实现类,
// 访问接口时访问注册中心这个服务
@FeignClient(value="provider",fallback = FeignError.class)
public interface FeignProviderClient {
    //地址同上与provider一样的地址
    @GetMapping("/student/findall")
    public Collection<Student> findall();
    @GetMapping("/student/index")
    public String index();

}
