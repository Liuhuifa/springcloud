package com.cloud.userfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user-service")
public interface UserServiceInter {
    @RequestMapping("/getUser")
    String getUser();
}
