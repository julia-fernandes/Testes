package com.Julia.Testes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static com.Julia.Testes.Desconto.calcularDesconto;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
@SpringBootTest
public class DescontoTesteHU {
    /**
    * história de usuário:
    * Como cliente da loja,
    * Quero receber desconto em compras acima de R$500,00
    * Para economizar em pedidos maiores.
    *
    *
    * RN001 - Se o valor da compra for maior que R$500,00 -> aplicar 10% de desconto
    * se não, não aplica o desconto.
    *
    * **/

    @Test
    void TestDesconto(){

        double valorCompra = 600;
        double valorComDescontoEsperado = 540;

        Double valorAtual = calcularDesconto(valorCompra);

        assertEquals(valorComDescontoEsperado, valorAtual,
                () -> valorCompra + " vs " + valorAtual +
                "Mensagem de erro: valor atual diferente do esperado -> " + valorComDescontoEsperado);
    }
}
