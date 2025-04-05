package com.example.controller;

import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findall")
    public Collection<Student> findAll(){
//        通过template的方法输入IP地址,rest返回的值是封装后的类型,在调方法转换
        //也可以用getForObject方法不用.getbody
      return restTemplate.getForEntity("http://localhost:8010/student/findall",Collection.class).getBody() ;
    }
    @GetMapping("/getById/{id}")
    public Student findById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8010/student/findByid/{id}",Student.class,id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null).getBody();
    }
//    下面这个方法有问题
    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,Student.class);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }
}
