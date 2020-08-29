package com.bjc.repository;

import com.bjc.pojo.Student;

import java.util.Collection;

/**
 * @program: spring-cloud-netflix
 * @description: 服务接口
 * @author: bjc
 * @create: 2020-08-26 20:21
 */
public interface StudentRepository {

    Collection<Student> findAll();

    Student findById(long id);

    void saveOrUpdate(Student student);

    void deleteById(long id);
}
