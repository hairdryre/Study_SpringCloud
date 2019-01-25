package com.safesoft.feign.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author jay.zhou
 * @date 2019/1/25
 * @time 13:24
 */
@Component
public class ErrorHandler implements HelloService {
    @Value("${server.port}")
    private String port;

    @Override
    public String obtainOtherServerJsonData(String name) {
        return "sorry " + name + " , " + port + " server internal error";
    }
}
