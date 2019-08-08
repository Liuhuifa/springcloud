package com.cloud.hystrixservice.controller;

import com.cloud.hystrixservice.service.inter.HystrixServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystixController2 {
    @Resource
    private HystrixServiceInter service;

    @RequestMapping("getAll2")
    public String getAll(){
        return service.getAll();
    }
}
