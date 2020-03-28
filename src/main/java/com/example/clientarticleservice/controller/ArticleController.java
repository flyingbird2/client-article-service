package com.example.clientarticleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/article/name")
    @ResponseBody
    public String getUserName(){
        String forObject = restTemplate.getForObject("http://localhost:5550/name",
                String.class);
        return forObject;


    }
}
