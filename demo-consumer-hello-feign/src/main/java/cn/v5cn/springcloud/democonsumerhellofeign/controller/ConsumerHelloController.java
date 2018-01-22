package cn.v5cn.springcloud.democonsumerhellofeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerHelloController {

    @Autowired
    private HelloFeignClient helloFeignClient;

    @GetMapping("/hello/feign")
    public Object ch3() {
        return helloFeignClient.hello();
    }
}
