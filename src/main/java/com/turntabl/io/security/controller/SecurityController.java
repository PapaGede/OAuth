package com.turntabl.io.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String welcome(){
        return "Hello World";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return "Wow look who made it";
    }
}
