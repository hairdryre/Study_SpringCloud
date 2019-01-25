package com.safesoft.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jay.zhou
 * @date 2019/1/25
 * @time 9:44
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ApplicationFeign {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationFeign.class, args);
    }
}
