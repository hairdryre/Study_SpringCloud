package com.safesoft.ribbon.web;

import com.safesoft.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jay.zhou
 * @date 2019/1/24
 * @time 16:07
 */
@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello(String name){
        //调用Service接口，并返回JSON数据
        return helloService.obtainOtherServiceData(name);
    }
}
