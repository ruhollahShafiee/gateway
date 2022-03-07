package com.kadmos.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApiRegistryApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(ApiRegistryApplication.class);
        app.run(args);
    }
}
