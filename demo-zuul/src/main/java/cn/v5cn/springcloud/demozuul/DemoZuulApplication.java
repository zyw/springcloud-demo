package cn.v5cn.springcloud.demozuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class DemoZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoZuulApplication.class, args);
	}
}
