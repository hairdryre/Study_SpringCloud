package com.safesoft.feign.web;

import com.safesoft.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jay.zhou
 * @date 2019/1/25
 * @time 9:48
 */
@RestController
public class HelloController {

    /**
     * 因为HelloService仅仅使用了@FeiginClient注解
     * 没有使用@Bean类型的注解，比如@Service @Component等
     * 所以编译器会警告，其实可以忽视它
     */
    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return helloService.obtainOtherServerJsonData(name);
    }
}
