package com.consumer.consumerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    public String getAll(){
        return restTemplate.getForObject("http://produce-service/getAll",String.class);
    }
}
