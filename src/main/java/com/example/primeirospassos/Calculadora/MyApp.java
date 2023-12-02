package com.example.primeirospassos.Calculadora;

import com.example.primeirospassos.Calculadora.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma dos números é: " + calculadora.somar(2,7));
    }
}
