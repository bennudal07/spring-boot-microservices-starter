package com.example.userservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Kullanıcı bilgisini dönen basit controller
@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser() {
        return "User Data — Bennu ♥ (User-Service)";
    }
}
