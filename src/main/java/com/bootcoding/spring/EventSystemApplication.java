package com.bootcoding.spring;

import com.bootcoding.spring.college.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class EventSystemApplication {
	@Autowired

	College college;
	public static void main(String[] args) {
		SpringApplication.run(EventSystemApplication.class, args);

	}

}
