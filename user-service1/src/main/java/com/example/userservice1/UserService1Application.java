// User-Service uygulamasının ana sınıfı
package com.example.userservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring Boot uygulamasını başlatan anotasyon
@SpringBootApplication
public class UserService1Application {

    // Uygulamanın çalıştığı ana metod
    public static void main(String[] args) {

        // Spring Boot uygulamasını başlatır
        SpringApplication.run(UserService1Application.class, args);

        // Konsola bilgilendirme mesajı
        System.out.println(" User Service çalıştı! Port 8081. → http://localhost:8081/user");
    }
}