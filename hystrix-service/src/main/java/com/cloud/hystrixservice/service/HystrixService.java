package com.cloud.hystrixservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixService {
    @Autowired
    private RestTemplate template;

    @HystrixCommand(fallbackMethod = "error")
    public String getAll(){
        String object = template.getForObject("http://produce-service/getAll", String.class);
        return object;
    }

    public String error(){
        return "error";
    }
}
