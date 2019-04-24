package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ScSurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScSurekaServerApplication.class, args);
    }

}
