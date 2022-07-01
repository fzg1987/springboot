package com.fzg.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloHandler {

    /**
     * SpEL Spring Expression Language
     */
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前服务的端口号为：" + this.port;
    }
}
