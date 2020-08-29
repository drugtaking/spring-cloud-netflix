package com.bjc.feignserver;

import com.bjc.feignserver.impl.FeignError;
import com.bjc.pojo.Student;
import net.minidev.json.JSONUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @program: spring-cloud-netflix
 * @description: feign接口
 * @author: bjc
 * @create: 2020-08-28 22:06
 */
@FeignClient(value = "provider",fallback =  FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
