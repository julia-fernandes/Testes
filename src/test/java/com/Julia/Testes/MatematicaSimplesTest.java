package com.Julia.Testes;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@DisplayName(("Testes de matemática, operação simples"))

public class MatematicaSimplesTest {
    MatematicaSimples math;

    @BeforeAll
    static void setup(){
        System.out.println("Escrevendo antes do método.");
    }

    @AfterAll
    static void down(){
        System.out.println("Escrevendo depois do método.");
    }

    @   BeforeEach
    void beforeEachMethod(){
        math = new MatematicaSimples();
        System.out.println("Escrevendo o método antes da linha.");
    }

    @AfterEach
    void afterEachMethod(){
        math = new MatematicaSimples();
        System.out.println("Escrevendo o método depois da linha.");
    }

    @Test
    @DisplayName("Teste 6.2 + 2 = 8.2") //nomeia o teste
    void TestSoma(){
        System.out.println("Teste 6.2 + 2 = 8.2");

        // AAA arrange, act, assert
        double firstNumber = 6.2;
        double secondNumber = 2;
        double expected = 9.2;

        //when/act
        Double actual = math.sum(firstNumber, secondNumber);

        //then
        assertEquals(expected, actual,
                () -> firstNumber + " + " + secondNumber +
                        "Valor incorreto! " + expected + "!");
    }

    @Test
    @DisplayName("")
    void TestMultiplicacao(){
        System.out.println("Teste 7 * 3 = 21");

        double num1 = 7;
        double num2 = 3;
        double esperado = 21;

        Double valorAtual = math.mult(num1, num2);

        assertEquals(esperado, valorAtual,
                () -> num1 + " * " + num2 +
                "Mensagem de erro: valor atual diferente do esperado -> " + esperado);
    }

}