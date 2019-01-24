package com.safesoft.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jay.zhou
 * @date 2019/1/24
 * @time 16:08
 */
@Service
public class HelloService {

    /**
     * 将IOC容器中的负载均衡RestTemplate工具注入进来
     */
    @Autowired
    RestTemplate restTemplate;

    public String obtainOtherServiceData(String name) {
        //尝试调用其它微服务接口，访问的是SERVICE-CLIENT这个服务器的/hi 接口
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi?name=" + name, String.class);
    }
}
