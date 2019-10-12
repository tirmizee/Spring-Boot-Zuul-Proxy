package com.tirmizee.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tirmizee.filter.ErrorFilter;
import com.tirmizee.filter.PostFilter;
import com.tirmizee.filter.PreFilter;
import com.tirmizee.filter.RouteFilter;


@Configuration
@EnableZuulProxy
public class ZuulProxyConfig {
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
