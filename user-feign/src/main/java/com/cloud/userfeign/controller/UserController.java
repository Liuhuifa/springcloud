package com.cloud.userfeign.controller;

import com.cloud.userfeign.service.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceInter service;

    @RequestMapping("getUser")
    public String getUser(){
        return service.getUser();
    }
}
