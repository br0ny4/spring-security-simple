package com.yowshu.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {
    @GetMapping("/")
    public String root() {
        return "Hello Spring Security";
    }
    @GetMapping("/user")
    public String userIndex() {
        return "Hello User";
    }
}
