package com.arllain.backend.Calculadora.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    private Calculadora calculadora;
    private Double n1;
    private Double n2;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
        n1 = 3.0;
        n2 = 5.0;
    }
    @Test
    void somaTest() {
        Double esperado = 8.0;
        Double atual = calculadora.soma(n1, n2);
        assertEquals(esperado, atual);
    }

}