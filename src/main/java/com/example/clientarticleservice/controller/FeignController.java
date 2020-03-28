package com.example.clientarticleservice.controller;

import com.example.clientarticleservice.feign.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    UserRemoteClient userRemoteClient;

    @GetMapping("/feign/name")
    @ResponseBody
    public String getName(){
        String name = userRemoteClient.getName();
        return name;

    }
}
