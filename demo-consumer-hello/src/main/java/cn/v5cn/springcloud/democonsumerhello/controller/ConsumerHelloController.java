package cn.v5cn.springcloud.democonsumerhello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/consumer")
public class ConsumerHelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用LadBalancer方式调用服务提供端
     * @return
     */
    @GetMapping("/hello/lb")
    public Object ch() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("provider-hello");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello/index";
        System.out.println(url);
        return restTemplate.getForObject(url, Map.class);
    }
}
