package com.bootcoding.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Marker {

    @Autowired
    private Cap cap;
    private Ink ink;
    public Marker(Cap cap , Ink ink){
        this.cap=cap;
        this.ink=ink;
        System.out.println("i'm in marker");
    }

    //1
    //Hospital
    //patient
    //nurse
    //doctor
    //insurance
    //bll

    //2
    //college
    //department
    //student
    //teacher
    //result
}
