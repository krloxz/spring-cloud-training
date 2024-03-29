package com.krloxz.training.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloServiceApplication {

  public static void main(final String[] args) {
    SpringApplication.run(HelloServiceApplication.class, args);
  }

  @RequestMapping
  public String hello(@RequestHeader("x-location") final String location) {
    return "Hello from " + location + "!";
  }

}
