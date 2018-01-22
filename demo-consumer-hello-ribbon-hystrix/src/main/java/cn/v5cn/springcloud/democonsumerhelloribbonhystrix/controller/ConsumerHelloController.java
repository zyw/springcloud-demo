package cn.v5cn.springcloud.democonsumerhelloribbonhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/consumer")
public class ConsumerHelloController {

    @Autowired
    private ConsumerService consumerService;

    /**
     * 使用LadBalancer方式调用服务提供端
     * @return
     */
    @GetMapping("/hello/ribbon/hystrix")
    public Object ch() {
        return consumerService.consumer();
    }
}
