package com.Julia.Testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.Julia.Testes.Filme.validarEntrada;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

/**
 * como cinema
 * eu quero bloquear a entrada de menores de idade
 * para seguir a classificação indicativa
 *
 * se a faixa etária for igual a 18
 * permitir apenas 18+
 *
 * se a faixa etária for igual a Livre
 * permitir todas as idades
 *
 **/

public class FilmeTest {

    @Test
    void TestFilme(){

        Integer idadeCliente = 21;
        Integer faixaEtaria = 18;

        Boolean validacao = validarEntrada(idadeCliente, faixaEtaria);

        System.out.println(validacao);
        assertEquals(true, validacao,
                ()-> "Acesso negado para a idade atual: " + idadeCliente + ". Idade mínima: 18 anos");

    }

}
