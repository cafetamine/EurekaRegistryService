package com.actilive.ers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ErsApplication {

    public static void main(final String... args) {
        SpringApplication.run(ErsApplication.class, args);
    }

}
