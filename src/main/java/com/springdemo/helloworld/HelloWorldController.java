package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot Docker Image";
    }

    @GetMapping("/{name}")
    public String welcomeMessage(@PathVariable("name") String name) {
        return name + "Welcome to SpringBoot Project";
    }
}
