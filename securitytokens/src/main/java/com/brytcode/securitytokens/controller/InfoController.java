package com.brytcode.securitytokens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
    @GetMapping
    public String getInfo(){
        return "Welcome to BrytCode";
    }
}
