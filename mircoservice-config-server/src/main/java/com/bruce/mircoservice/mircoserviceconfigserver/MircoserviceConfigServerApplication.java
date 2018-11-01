package com.bruce.mircoservice.mircoserviceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MircoserviceConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MircoserviceConfigServerApplication.class, args);
    }
}
