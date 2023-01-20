public class CalculadorDeImposto {

    private double totalImporsto;

    public void registra(Tributavel t){
       double valor = t.getValorImposto();
       this.totalImporsto += valor;

    }

    public double getTotalImporsto() {
        return totalImporsto;
    }
}
