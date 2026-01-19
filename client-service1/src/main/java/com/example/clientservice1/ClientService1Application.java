package com.example.clientservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication //Bir Spring Boot uygulamasını başlatmak için gerekli olan
// temel otomatik yapılandırma, bileşen tarama ve ek yapılandırma yeteneğini sağlar.
@EnableFeignClients //microservice mimarisinde servisler arası iletişim kurmak için kullanılır.
public class ClientService1Application {
    public static void main(String[] args) {
        SpringApplication.run(ClientService1Application.class, args);
        System.out.println(" Client Service çalıştı! Port 8082.  → http://localhost:8082/client-user");
    }
}

