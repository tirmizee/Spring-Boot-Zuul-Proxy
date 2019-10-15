package com.tirmizee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.tirmizee.config.RibbonConfig;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootZuulRun {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulRun.class, args);
	}

}
