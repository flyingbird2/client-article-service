package com.example.clientarticleservice.controller;

import com.example.clientarticleservice.feign.UserRemoteClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleHyntrixController {

    @Autowired
    UserRemoteClient userRemoteClient;

    @GetMapping("/hyntrix/name")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "defaultMethod")
    public String getName() throws InterruptedException {
        //Thread.sleep(9000);
        //int i=1/0;
        String name = userRemoteClient.getName();
        return name;

    }

    public String defaultMethod(){
        System.out.println("enter fail");
        return "fail";
    }
}
