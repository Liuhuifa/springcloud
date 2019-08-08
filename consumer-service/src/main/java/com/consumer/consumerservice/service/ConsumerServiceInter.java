package com.consumer.consumerservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("produce-service")
public interface ConsumerServiceInter {
    @RequestMapping("getAll")
    String getAll();
}
