package com.bjc.controller;


import com.bjc.pojo.Student;
import org.assertj.core.util.diff.Delta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @program: spring-cloud-netflix
 * @description: 控制层
 * @author: bjc
 * @create: 2020-08-26 22:23
 */
@RestController
@RequestMapping(value = "/rest")
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://127.0.0.1:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping(value = "/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://127.0.0.1:8010/student/findAll",Collection.class);
    }

    @GetMapping(value = "/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return restTemplate.getForEntity("http://127.0.0.1:8010/student/findById/{id}",Student.class,id).getBody();
    }

    @GetMapping(value = "/findById2/{id}")
    public Student findById2(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://127.0.0.1:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://127.0.0.1:8010/student/save",student,null).getBody();
    }

    @PostMapping(value = "/save2")
    public void save2(@RequestBody Student student) {
        restTemplate.postForObject("http://127.0.0.1:8010/student/save",student,Void.class);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://127.0.0.1:8010/student/update",student);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://127.0.0.1:8010/student/deleteById/{id}",id);
    }
}
