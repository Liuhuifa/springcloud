package com.cloud.hystrixservice.service.inter;

import com.cloud.hystrixservice.service.impl.HystrixServiceImpl;
import com.cloud.hystrixservice.service.impl.NewProServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "newpro-service",fallback = NewProServiceImpl.class)
public interface NewProServiceInter {

    @RequestMapping("getBGF")
    List<String> getBGF();
}
