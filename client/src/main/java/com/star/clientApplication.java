package com.star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class clientApplication {
    public static void main(String[] args) {
        SpringApplication.run(clientApplication.class, args);
    }
}
