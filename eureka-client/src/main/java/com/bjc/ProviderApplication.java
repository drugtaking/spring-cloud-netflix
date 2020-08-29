package com.bjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: spring-cloud-netflix
 * @description: 服务提供者
 * @author: bjc
 * @create: 2020-08-26 20:08
 */
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}