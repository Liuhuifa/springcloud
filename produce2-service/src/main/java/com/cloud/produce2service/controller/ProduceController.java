package com.cloud.produce2service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {

    @RequestMapping("getAll")
    public String getAll(){
        return "我很帅";
    }
}
