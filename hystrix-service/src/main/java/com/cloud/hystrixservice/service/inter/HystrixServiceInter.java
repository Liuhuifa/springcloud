package com.cloud.hystrixservice.service.inter;

import com.cloud.hystrixservice.service.impl.HystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "produce-service",fallback = HystrixServiceImpl.class)
public interface HystrixServiceInter {

    @RequestMapping("getAll")
    String getAll();
}
