package com.example.controller;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHander {
    @Autowired
    private StudentRepository studentRepository;
//    读取配置文件
     @Value("${server.port}")
     private String port;
    @GetMapping("/findall")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }
    @GetMapping("/findByid/{id}")
    public Student findById(@PathVariable Long id){
            return studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        studentRepository.deleteById(id);
    }
    @GetMapping("/index")
    public String index(){
        return "当前端口为:"+this.port;
    }
}
