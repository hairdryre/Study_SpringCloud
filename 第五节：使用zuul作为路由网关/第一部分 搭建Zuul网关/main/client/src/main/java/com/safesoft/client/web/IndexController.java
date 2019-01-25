package com.safesoft.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jay.zhou
 * @date 2019/1/24
 * @time 16:16
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(String name) {
        return "hi " + name + " , l am " + port + " port";
    }
}
