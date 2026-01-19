# spring-boot-microservices-starter
Spring Boot, Spring Cloud Netflix Eureka ve OpenFeign kullanılarak geliştirilmiş; servis keşfi ve servisler arası iletişimi simüle eden mikroservis mimarisi projesi.

##  Proje Mimarisi

Proje birbirleriyle haberleşen 3 ana modülden oluşmaktadır:

1.  **Eureka Server (`eureka-server1`):** Tüm mikroservislerin kendilerini kaydettiği ve birbirlerini bulmasını sağlayan Keşif Sunucusu (Service Registry).
2.  **User Service (`user-service1`):** Veri sağlayan (Provider) servistir. Kullanıcı işlemlerini simüle eden REST API uç noktaları sunar.
3.  **Client Service (`client-service1`):** Veri tüketen (Consumer) servistir. `User Service` ile iletişim kurmak için **Spring Cloud OpenFeign** kullanır.

##  Kullanılan Teknolojiler

* **Dil:** Java 17
* **Framework:** Spring Boot 3.x
* **Service Discovery:** Spring Cloud Netflix Eureka
* **HTTP Client:** Spring Cloud OpenFeign
* **Build Tool:** Maven
* **Veri Formatı:** JSON

##  Kurulum ve Çalıştırma

Projeyi yerel ortamınızda çalıştırmak için aşağıdaki adımları sırasıyla takip edin. Servislerin birbirini bulabilmesi için **çalıştırma sırası önemlidir.**

### 1. Projeyi Klonlayın
git clone [https://github.com/bennudal07/spring-boot-microservices-starter.git](https://github.com/bennudal07/spring-boot-microservices-starter.git)
cd spring-boot-microservices-starter

### 2. Uygulamaları Ayağa Kaldırma
Aşağıdaki sırayla modülleri IDE'niz üzerinden (Run) veya terminalden çalıştırın:

## Eureka Server Başlat:

eureka-server1 klasöründeki uygulamayı çalıştırın.

URL: http://localhost:8761 adresine giderek Eureka Dashboard'un açıldığını ve diğer servisleri beklediğini doğrulayın.

## User Service Başlat:

user-service1 klasöründeki uygulamayı çalıştırın.

Konsolda "Registered with Eureka" logunu görmelisiniz.

## Client Service Başlat:

client-service1 klasöründeki uygulamayı çalıştırın.

Bu servis ayağa kalktığında User Service ile iletişim kurmaya hazırdır.

## API ve Test
Servisler çalıştıktan sonra tarayıcı veya Postman kullanarak test edebilirsiniz:

Eureka Paneli: http://localhost:8761 (Kayıtlı servislerin listesi)

Servis İletişimi: client-service üzerinden user-service verilerini çekmek için ilgili Controller endpointlerini kullanabilirsiniz.
