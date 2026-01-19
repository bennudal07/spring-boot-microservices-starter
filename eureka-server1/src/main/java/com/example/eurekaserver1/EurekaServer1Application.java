package com.example.eurekaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication // Spring Boot uygulaması başlatır
@EnableEurekaServer   // Bu uygulamayı Eureka Server yapar
public class EurekaServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1Application.class, args); // Uygulamayı başlatır
        System.out.println("Eureka Server çalıştı → http://localhost:8761");
    }
}
