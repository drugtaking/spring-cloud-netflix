package com.bjc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: spring-cloud-netflix
 * @description: 实体类
 * @author: bjc
 * @create: 2020-08-26 20:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;

    private String name;

    private Integer age;
}
