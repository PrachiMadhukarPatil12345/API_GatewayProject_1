# 🌐 API Gateway (Spring Cloud Gateway)

## 📌 Overview

This project is an **API Gateway** built using **Spring Cloud Gateway**. It acts as a single entry point for routing client requests to multiple microservices using service discovery.

---

## 🚀 Features

* Dynamic routing using service discovery (Eureka)
* Load balancing with `lb://` URIs
* Path-based routing
* Scalable and centralized API management

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Cloud Gateway
* Eureka Discovery Client

---

## ⚙️ Configuration

### application.yml

```yaml
spring:
  application:
    name: API-Gateway_2

  cloud:
    gateway:
      discovery:
        locator:
          enabled: true
          lowerCaseServiceId: true

      routes:
        - id: service1-route
          uri: lb://Service-1
          predicates:
            - Path=/welcome1

        - id: service2-route
          uri: lb://Service-2
          predicates:
            - Path=/welcome2,/abc/**

server:
  port: 3333
```

---

## 🔗 Service Endpoints

### ✅ Service 1

| Endpoint    | Gateway URL                    |
| ----------- | ------------------------------ |
| `/welcome1` | http://localhost:3333/welcome1 |

---

### ✅ Service 2

| Endpoint     | Gateway URL                     |
| ------------ | ------------------------------- |
| `/welcome2`  | http://localhost:3333/welcome2  |
| `/abc/greet` | http://localhost:3333/abc/greet |
| `/abc/Hii`   | http://localhost:3333/abc/Hii   |

---

## 📦 How It Works

1. Client sends request to API Gateway
2. Gateway matches request using **Path Predicate**
3. Request is routed to respective microservice via **Eureka Service Discovery**
4. Response is returned back to client

---

## ▶️ Running the Project

### 1. Start Eureka Server

Make sure Eureka server is running.

### 2. Start Microservices

* Run **Service-1**
* Run **Service-2**

### 3. Start API Gateway

Run the main class:

```java
SpringApplication.run(ApiGatewayApplication.class, args);
```

---

## 🧪 Testing

Use browser or Postman:

```bash
http://localhost:3333/welcome1
http://localhost:3333/welcome2
http://localhost:3333/abc/greet
http://localhost:3333/abc/Hii
```

---

## ⚠️ Notes

* Ensure all services are registered in Eureka
* Service names must match:

  * `Service-1`
  * `Service-2`
* Gateway runs on port **3333**

---

## 📈 Future Enhancements

* Add authentication (JWT / OAuth2)
* Rate limiting
* Circuit breaker (Resilience4j)
* Logging & monitoring

---

## 👨‍💻 Author

Prachi Patil


