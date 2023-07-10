package com.martela.sandboxservice.service;

public class HelloService {

    public String helloWorld() {
        return "Hello World!";
    }

    public String hello(final String name) {
        return "Hello " + name + "!";
    }
}
