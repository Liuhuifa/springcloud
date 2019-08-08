package com.cloud.produce2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Produce2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Produce2ServiceApplication.class, args);
    }

}
