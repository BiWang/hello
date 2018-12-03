package com.ke.rent.quality.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello() {
        return "Hello!";
    }
}
