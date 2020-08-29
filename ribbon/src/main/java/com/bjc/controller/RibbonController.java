package com.bjc.controller;

import com.bjc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @program: spring-cloud-netflix
 * @description: 控制层
 * @author: bjc
 * @create: 2020-08-28 21:43
 */
@RestController
@RequestMapping(value = "/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }

    @GetMapping(value = "/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }
}
