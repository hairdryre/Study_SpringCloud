package com.safesoft.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jay.zhou
 * @date 2019/1/27
 * @time 14:19
 */
@RestController
@RefreshScope
public class IndexController {
    @Value("${jay.label}")
    private String label;

    @RequestMapping("/hello")
    public String test() {
        return label;
    }
}
