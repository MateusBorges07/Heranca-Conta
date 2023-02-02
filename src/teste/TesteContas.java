package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupaca;
import modelo.SaldoInsuficienteException;

public class TesteContas {

    public static void main(String[] args)throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100);

        ContaPoupaca cp = new ContaPoupaca(222, 222);
        cp.deposita(200);

        cc.transfere(10,cp);

        System.out.println("CC:"+ cc.getSaldo());
        System.out.println("CP:"+ cp.getSaldo());
    }
}
