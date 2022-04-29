package com.arllain.backend.Calculadora.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculadoraController.class)
class CalculadoraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void somarTest() throws Exception {
        RequestBuilder request = get("/somar")
                .param("n1", String.valueOf(5))
                .param("n2", String.valueOf(3));

        MvcResult result = mockMvc.perform(request).andReturn();
        assertEquals("8.0", result.getResponse().getContentAsString());
    }
}