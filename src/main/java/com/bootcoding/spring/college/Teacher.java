package com.bootcoding.spring.college;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

    public Teacher(Department department){
        System.out.println("I'm a teacher");
    }
}
