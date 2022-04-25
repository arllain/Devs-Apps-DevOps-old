package com.arllain.backend.Calculadora.controller;

import com.arllain.backend.Calculadora.model.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/somar")
    public String somar(@RequestParam(name = "n1") Double n1, @RequestParam(name = "n2") Double n2) {
        return new Calculadora().soma(n1,n2).toString();
    }
}
