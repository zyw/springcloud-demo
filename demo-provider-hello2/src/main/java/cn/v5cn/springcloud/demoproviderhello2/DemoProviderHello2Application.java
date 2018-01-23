package cn.v5cn.springcloud.demoproviderhello2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoProviderHello2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoProviderHello2Application.class, args);
	}
}
