package com.bootcoding.spring.college;

import org.springframework.stereotype.Component;

@Component
public class Result {

    public Result(Student student){
        System.out.println(" I'm in class result");
    }
}
