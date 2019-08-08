package com.cloud.newproservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewProController {

    @RequestMapping("getBGF")
    public List getBGF(){
        List<String> lists = new ArrayList<>();
        lists.add("呵呵");
        lists.add("哈哈");
        lists.add("林超");
        return lists;
    }
}
