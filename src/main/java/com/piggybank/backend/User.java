package com.piggybank.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @RequestMapping("/")
    public String greet() {
        return "Hello! World";
    }

    @RequestMapping("/login")

}
