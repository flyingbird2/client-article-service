package com.example.clientarticleservice.fallback;

import com.example.clientarticleservice.feign.UserRemoteClient;
import org.springframework.stereotype.Component;

@Component
public class UserRemoteClientFallBack implements UserRemoteClient {
    @Override
    public String getName() {
        return "get name fail";
    }
}
