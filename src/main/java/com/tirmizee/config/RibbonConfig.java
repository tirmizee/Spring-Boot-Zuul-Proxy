package com.tirmizee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerListSubsetFilter;

@Configuration
public class RibbonConfig {

	/*
	 * @Bean public IRule ribbonRule() { return new BestAvailableRule(); }
	 * 
	 * @Bean public IPing ribbonPing() { return new PingUrl(); }
	 * 
	 * @Bean public ServerListSubsetFilter<Server> serverListFilter() {
	 * ServerListSubsetFilter<Server> filter = new ServerListSubsetFilter<Server>();
	 * return filter; }
	 */
	
}
