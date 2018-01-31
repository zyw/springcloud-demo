package cn.v5cn.springcloud.demozuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
@EnableOAuth2Sso
public class DemoZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoZuulApplication.class, args);
	}
}
