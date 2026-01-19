
package com.example.clientservice1.controller;

import com.example.clientservice1.client.UserClient; // User-Service'e bağlanacak FeignClient interface'i
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Bu sınıfın REST controller olduğunu belirtir
public class ClientController {

    private final UserClient userClient; // User-Service'e bağlanacak Feign client

    // Constructor injection: userClient otomatik olarak Spring tarafından enjekte edilir
    public ClientController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/client-user") // Client-Service'e "/client-user" isteği gelince bu metot çalışır
    public String getUserFromClient() {

        // FeignClient aracılığıyla User-Service'e istek gönderilir
        // userClient.getUser() → User-Service'in "/user" endpoint'ine gider
        return "Client → UserService: " + userClient.getUser();
    }
}
