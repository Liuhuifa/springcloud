package com.cloud.hystrixservice.controller;

import com.cloud.hystrixservice.service.impl.NewProServiceImpl;
import com.cloud.hystrixservice.service.inter.NewProServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewProController {
    @Autowired
    private NewProServiceInter service;
    @RequestMapping("/getBGF")
    public List<String> getBGF(){
        return service.getBGF();
    }
}
