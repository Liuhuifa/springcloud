package com.cloud.hystrixservice.service.impl;

import com.cloud.hystrixservice.service.inter.HystrixServiceInter;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceImpl implements HystrixServiceInter {
    @Override
    public String getAll() {
        return "帅到爆炸";
    }
}
