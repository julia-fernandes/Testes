package com.Julia.Testes;

public class Filme {

    public static Boolean validarEntrada(Integer idadeCliente, Integer faixaEtaria){

        if(idadeCliente >= 18 && faixaEtaria == 18){
            System.out.println("Acesso permitido.");
            return true;

        }
        else if(faixaEtaria == 0 && idadeCliente > 0){
            System.out.println("Acesso permitido.");
            return true;

        }

        else{
            System.out.println("Acesso negado para menores de idade.");
            return false;

        }

    }
}
