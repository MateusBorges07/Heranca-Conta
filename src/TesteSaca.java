public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(222);
        conta.saca(290);

        System.out.println(conta.getSaldo());
    }
}
