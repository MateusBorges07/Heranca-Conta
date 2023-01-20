public class TesteTributavel {
    public static void main(String[] args) {
         ContaCorrente cc = new ContaCorrente( 222, 333);
         cc.deposita(100.0);

         SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto colc = new CalculadorDeImposto();
        colc.registra(cc);
        colc.registra(seguro);

        System.out.println(colc.getTotalImporsto());
    }
}
