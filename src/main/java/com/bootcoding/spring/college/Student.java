package com.bootcoding.spring.college;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(Teacher teacher){
        System.out.println("I'm a student");
    }
}
