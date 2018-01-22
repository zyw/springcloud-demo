package cn.v5cn.springcloud.demoproviderhello.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/index")
    public Object hello() {
        return ImmutableMap.of("name","zhangsan");
    }
}
