package com.cloud.configclient.controller;

import com.cloud.configclient.ConfigClientApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {
    Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);
    @Value("${config.username}")
    private String username;
    @RequestMapping("/getuser")
    public String getUser(){
        logger.debug(username);
        return username;
    }
}
