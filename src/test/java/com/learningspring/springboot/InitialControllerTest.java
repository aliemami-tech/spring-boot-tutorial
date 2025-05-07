package com.learningspring.springboot;


import com.learningspring.springboot.application.InitialController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(InitialController.class)
public class InitialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloWorldEndpoint() throws Exception {
        String name = "John";

        mockMvc.perform(get("/api/v1/hello/{name}", name))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello John"));
    }
}
