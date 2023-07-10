package com.martela.sandboxservice;

import com.martela.sandboxservice.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SandboxServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SandboxServiceApplication.class, args);
    }

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
