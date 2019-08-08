package com.consumer.consumerservice.controller;

import com.consumer.consumerservice.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService service;

    @RequestMapping("getAll")
    public String getAll(){
        return service.getAll();
    }
}
