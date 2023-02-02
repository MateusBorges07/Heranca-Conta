package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(222);
        try{
            conta.saca(190   );
        }catch (SaldoInsuficienteException ex){
            System.out.println("Ex: "+ ex.getMessage());
        }


        System.out.println(conta.getSaldo());
    }
}
