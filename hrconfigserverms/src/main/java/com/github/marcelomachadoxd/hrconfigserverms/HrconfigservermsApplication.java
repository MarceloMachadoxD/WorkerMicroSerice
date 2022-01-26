package com.github.marcelomachadoxd.hrconfigserverms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrconfigservermsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrconfigservermsApplication.class, args);
    }

}
