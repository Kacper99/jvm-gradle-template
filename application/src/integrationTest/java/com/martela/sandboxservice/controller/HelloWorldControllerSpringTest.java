package com.martela.sandboxservice.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = HelloWorldController.class)
class HelloWorldControllerSpringTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloWorld() throws Exception {
        mockMvc.perform(get("/hello-world"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello World!"));
    }

    @Test
    void shouldReturnHelloWorldWithName() throws Exception {
        mockMvc.perform(post("/hello")
                        .content(
                                """
                                {
                                    "name": "Kacper"
                                }
                                """)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value("Hello Kacper!"));
    }
}
