package com.learningspring.springboot;


import com.learningspring.springboot.controller.GreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetingUserEndpoint() throws Exception {
        String name = "John";

        mockMvc.perform(get("/api/v1/greet/{name}", name))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello John Welcome to Spring course."));
    }

    @Test
    public void testGreetingUserWithEmptyName() throws Exception {
        mockMvc.perform(get("/api/v1/greet/ "))
                .andExpect(status().isNotFound());
    }


}
