package com.bjc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: practices
 * @description: 控制层
 * @author: bjc
 * @create: 2020-08-29 11:36
 */
@RestController
@RequestMapping(value = "/native")
public class NativeConfigController {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}
