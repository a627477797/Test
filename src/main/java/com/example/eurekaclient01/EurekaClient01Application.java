package com.example.eurekaclient01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient01Application.class, args);
    }

}
