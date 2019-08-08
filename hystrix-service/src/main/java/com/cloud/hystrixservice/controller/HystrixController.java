package com.cloud.hystrixservice.controller;

import com.cloud.hystrixservice.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    private HystrixService service;
    @RequestMapping("getAll")
    public String getAll(){
        return service.getAll();
    }
}
