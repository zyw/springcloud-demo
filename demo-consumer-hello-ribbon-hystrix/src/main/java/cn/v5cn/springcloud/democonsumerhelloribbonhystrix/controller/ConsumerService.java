package cn.v5cn.springcloud.democonsumerhelloribbonhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public Object consumer() {
        return restTemplate.getForObject("http://provider-hello/hello/index", Map.class);
    }

    public String fallback() {
        return "fallback";
    }
}
