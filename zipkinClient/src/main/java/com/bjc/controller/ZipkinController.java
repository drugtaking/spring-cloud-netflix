package com.bjc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-netflix
 * @description: 控制层
 * @author: bjc
 * @create: 2020-08-29 13:43
 */
@RestController
@RequestMapping(value = "/zipkin")
public class ZipkinController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/index")
    private String index(){
        return this.port;
    }
}
