package cn.v5cn.springcloud.democonsumerhellofeign.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-hello",path = "/hello")
public interface HelloFeignClient {
    @GetMapping("/index")
    public Object hello();
}
