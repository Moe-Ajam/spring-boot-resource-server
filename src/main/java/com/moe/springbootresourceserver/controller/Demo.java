package com.moe.springbootresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/demo")
    public String demo() {
        return "Hello World!";
    }
}
