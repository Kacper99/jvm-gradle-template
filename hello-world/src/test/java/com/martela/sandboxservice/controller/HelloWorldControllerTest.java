package com.martela.sandboxservice.controller;

import static com.martela.sandboxservice.controller.HelloWorldController.*;
import static org.assertj.core.api.Assertions.*;

import com.martela.sandboxservice.service.HelloService;
import org.junit.jupiter.api.Test;

class HelloWorldControllerTest {

    @Test
    void shouldReturnHelloWorld() {
        HelloWorldController helloWorldController = new HelloWorldController(new HelloService());
        assertThat(helloWorldController.helloWorld()).isEqualTo("Hello World!");
    }

    @Test
    void shouldReturnHelloName() {
        HelloWorldController helloWorldController = new HelloWorldController(new HelloService());
        assertThat(helloWorldController.helloName(new HelloNameRequest("John"))).isEqualTo("Hello John!");
    }
}
