package com.spring.WillkaOfficeApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "Login";
    }
    @GetMapping("/")
    public String dashbord(){
        return "dashboard";
    }
}
