package com.github.marcelomachadoxd.hreurekaserverms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HreurekaservermsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HreurekaservermsApplication.class, args);
    }

}
