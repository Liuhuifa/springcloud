package com.produce.produceservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduceController {

    @RequestMapping("getAll")
    public String getAll(){
        return "我真帅";
    }
}
