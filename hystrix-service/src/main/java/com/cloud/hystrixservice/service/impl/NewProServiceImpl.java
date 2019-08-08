package com.cloud.hystrixservice.service.impl;

import com.cloud.hystrixservice.service.inter.NewProServiceInter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewProServiceImpl implements NewProServiceInter {
    @Override
    public List<String> getBGF() {
        List<String> lists = new ArrayList<>();
        lists.add("有个球");
        return lists;
    }
}
