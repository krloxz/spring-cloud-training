package com.krloxz.training.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.krloxz.training.gatewayservice.filters.AddRequestHeaderFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration
public class GatewayServiceApplication {

  public static void main(final String[] args) {
    SpringApplication.run(GatewayServiceApplication.class, args);
  }

  @Bean
  public AddRequestHeaderFilter addRequestHeaderFilter() {
    return new AddRequestHeaderFilter();
  }

}
