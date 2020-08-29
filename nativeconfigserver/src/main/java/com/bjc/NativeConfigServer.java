package com.bjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: practices
 * @description: 启动类
 * @author: bjc
 * @create: 2020-08-29 11:19
 */
@SpringBootApplication
@EnableConfigServer
public class NativeConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServer.class,args);
    }
}
