package com.martela.sandboxservice.controller;

import com.martela.sandboxservice.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloService helloService;

    public HelloWorldController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return helloService.helloWorld();
    }

    @PostMapping("/hello")
    public String helloName(@RequestBody final HelloNameRequest request) {
        return helloService.hello(request.name());
    }

    record HelloNameRequest(String name) {}
}
