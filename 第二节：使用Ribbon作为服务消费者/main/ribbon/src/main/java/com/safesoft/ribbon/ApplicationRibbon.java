package com.safesoft.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author jay.zhou
 * @date 2019/1/24
 * @time 16:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ApplicationRibbon {

    public static void main(String[] args) {
        SpringApplication.run( ApplicationRibbon.class, args );
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
