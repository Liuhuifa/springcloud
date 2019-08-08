package com.consumer.consumerservice.controller;

import com.consumer.consumerservice.service.ConsumerService;
import com.consumer.consumerservice.service.ConsumerServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController2 {
    @Autowired
    private ConsumerServiceInter service;

    @RequestMapping("getAll2")
    public String getAll(){
        return service.getAll();
    }
}
