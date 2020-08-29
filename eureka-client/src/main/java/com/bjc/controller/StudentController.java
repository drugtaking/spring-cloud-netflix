package com.bjc.controller;

import com.bjc.pojo.Student;
import com.bjc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @program: spring-cloud-netflix
 * @description: 控制层
 * @author: bjc
 * @create: 2020-08-26 20:29
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String post;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public Student findById(@PathVariable("id")long id) {
        return studentRepository.findById(id);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }

    @GetMapping(value = "/index")
    public String index(){
        return "当前端口"+this.post;
    }
}
