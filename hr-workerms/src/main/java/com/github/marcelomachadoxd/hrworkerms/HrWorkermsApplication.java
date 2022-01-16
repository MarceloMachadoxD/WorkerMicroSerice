package com.github.marcelomachadoxd.hrworkerms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrWorkermsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrWorkermsApplication.class, args);
    }

}
