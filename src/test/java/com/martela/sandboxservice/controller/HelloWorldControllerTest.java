package com.martela.sandboxservice.controller;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class HelloWorldControllerTest {

    @Test
    void shouldReturnHelloWorld() {
        HelloWorldController helloWorldController = new HelloWorldController();
        assertThat(helloWorldController.helloWorld()).isEqualTo("Hello World!");
    }

}