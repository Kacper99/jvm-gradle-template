package com.martela.sandboxservice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String helloWorld() {
        return "Hello World!";
    }

    public String hello(final String name) {
        return "Hello " + name + "!";
    }
}
