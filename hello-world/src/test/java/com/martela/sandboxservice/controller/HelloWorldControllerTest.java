package com.martela.sandboxservice.controller;

import static com.martela.sandboxservice.controller.HelloWorldController.*;
import static org.assertj.core.api.Assertions.*;

import com.martela.sandboxservice.service.HelloService;
import org.junit.jupiter.api.Test;

class HelloWorldControllerTest {

    private final HelloWorldController helloWorldController = new HelloWorldController(new HelloService());

    @Test
    void shouldReturnHelloWorld() {
        assertThat(helloWorldController.helloWorld()).isEqualTo("Hello World!");
    }

    @Test
    void shouldReturnHelloName() {
        assertThat(helloWorldController.helloName(new HelloNameRequest("John"))).isEqualTo("Hello John!");
    }
}
