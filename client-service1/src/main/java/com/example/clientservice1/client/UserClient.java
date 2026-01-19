package com.example.clientservice1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service2")
public interface UserClient {

    @GetMapping("/user")
    String getUser();
}
