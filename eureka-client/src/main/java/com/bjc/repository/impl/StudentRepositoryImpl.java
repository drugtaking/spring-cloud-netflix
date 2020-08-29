package com.bjc.repository.impl;

import com.bjc.pojo.Student;
import com.bjc.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-cloud-netflix
 * @description:
 * @author: bjc
 * @create: 2020-08-26 20:23
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1l,new Student(1l,"张三",22));
        studentMap.put(2l,new Student(2l,"李四",23));
        studentMap.put(3l,new Student(3l,"王五",24));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
