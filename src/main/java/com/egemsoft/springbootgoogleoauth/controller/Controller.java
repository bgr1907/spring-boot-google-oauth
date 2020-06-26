package com.egemsoft.springbootgoogleoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
            return "Hello World";
        }

    @GetMapping("/restricted")
    public String restricted(){
            return "to see this text you need to be logged in!";
        }

}
