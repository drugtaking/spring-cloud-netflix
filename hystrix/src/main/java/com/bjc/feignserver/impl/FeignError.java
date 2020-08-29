package com.bjc.feignserver.impl;

import com.bjc.feignserver.FeignProviderClient;
import com.bjc.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @program: spring-cloud-netflix
 * @description:
 * @author: bjc
 * @create: 2020-08-28 22:23
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。。。。。。。。";
    }
}
