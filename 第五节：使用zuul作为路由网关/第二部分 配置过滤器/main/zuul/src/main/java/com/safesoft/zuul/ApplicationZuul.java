package com.safesoft.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author jay.zhou
 * @date 2019/1/25
 * @time 14:36
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ApplicationZuul {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationZuul.class, args);
    }
}
