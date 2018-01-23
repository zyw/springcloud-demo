package cn.v5cn.springcloud.demoproviderhello2.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello2")
public class HelloController {

    @GetMapping("/index")
    public Object hello(HttpServletRequest request) {
        int serverPort = request.getServerPort();
        return ImmutableMap.of("name","zhangsan","port",serverPort);
    }
}
