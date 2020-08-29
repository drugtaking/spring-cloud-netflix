package com.bjc.controller;

import com.bjc.feignserver.FeignProviderClient;
import com.bjc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;

/**
 * @program: spring-cloud-netflix
 * @description: 控制层
 * @author: bjc
 * @create: 2020-08-28 22:09
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        System.out.println("=====================================================");
        Collection<Student> all = feignProviderClient.findAll();

        Iterator<Student> iterator = all.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        return feignProviderClient.findAll();
    }

    @GetMapping(value = "/index")
    public String index(){
        return feignProviderClient.index();
    }
}
