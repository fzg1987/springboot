package com.fzg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloHandler {

    @GetMapping("/index")
    public String index(){
        return "Hello, Spring Boot!";
    }
}
