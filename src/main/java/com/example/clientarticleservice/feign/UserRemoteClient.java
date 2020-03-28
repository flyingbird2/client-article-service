package com.example.clientarticleservice.feign;

import com.example.clientarticleservice.FeignConfiguration;
import com.example.clientarticleservice.fallback.UserRemoteClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "eureka-client-user-service", configuration = FeignConfiguration.class,
        fallback = UserRemoteClientFallBack.class)
public interface UserRemoteClient {

    @GetMapping("/name")
    @ResponseBody
    String getName();
}
