package com.cloud.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("getUser")
    public String getUser(){
        return "好好学习，天天向上";
    }
}
