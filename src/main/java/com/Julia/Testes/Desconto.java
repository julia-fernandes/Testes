package com.Julia.Testes;

public class Desconto {

    public static Double calcularDesconto(Double valorCompra){

        if(valorCompra > 500){
            Double desconto = valorCompra * 0.1;
            valorCompra -= desconto;
            return valorCompra;
        }
        return valorCompra;
    }

}
