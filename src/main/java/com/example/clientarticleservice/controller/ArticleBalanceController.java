package com.example.clientarticleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleBalanceController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/article/balance/name")
    public String getName(){
        return restTemplate.getForObject("http://eureka-client-user-service/name",String.class);

    }
}
