package com.safesoft.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jay.zhou
 * @date 2019/1/24
 * @time 14:04
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationServer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationServer.class, args);
    }
}
