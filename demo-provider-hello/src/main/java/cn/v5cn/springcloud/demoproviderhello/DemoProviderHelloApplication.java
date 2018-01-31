package cn.v5cn.springcloud.demoproviderhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableOAuth2Sso
public class DemoProviderHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProviderHelloApplication.class, args);
	}
}
