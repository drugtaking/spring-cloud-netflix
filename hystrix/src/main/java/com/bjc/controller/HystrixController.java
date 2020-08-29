package com.bjc.controller;

import com.bjc.feignserver.FeignProviderClient;
import com.bjc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @program: spring-cloud-netflix
 * @description: 控制层
 * @author: bjc
 * @create: 2020-08-28 22:41
 */
@RestController
@RequestMapping(value = "/hystrix")
public class HystrixController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping(value = "/index")
    public String index(){
        return feignProviderClient.index();
    }
}
