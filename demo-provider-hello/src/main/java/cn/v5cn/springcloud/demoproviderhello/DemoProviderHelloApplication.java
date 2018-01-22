package cn.v5cn.springcloud.demoproviderhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoProviderHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProviderHelloApplication.class, args);
	}
}
