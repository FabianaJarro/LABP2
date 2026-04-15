
public class PagamentoPix implements PagamentoStrategy{
    @Override
    public double pagar(double valor){
        valor= valor-valor*0.10;
        // System.out.println("valor pago: "+ valor);
        return valor;
    }
}
