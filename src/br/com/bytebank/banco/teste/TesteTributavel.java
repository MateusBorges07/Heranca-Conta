package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {
    public static void main(String[] args) {
         modelo.ContaCorrente cc = new modelo.ContaCorrente( 222, 333);
         cc.deposita(100.0);

         modelo.SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto colc = new CalculadorDeImposto();
        colc.registra(cc);
        colc.registra(seguro);

        System.out.println(colc.getTotalImporsto());
    }
}
