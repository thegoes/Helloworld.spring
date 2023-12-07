package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello Turma 68!!!";
    } 
    
    @GetMapping("/top")
    public String top() {
        return "Turma 68 TOP!!!";
    }
}
