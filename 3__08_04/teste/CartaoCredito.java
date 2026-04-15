
public class CartaoCredito implements PagamentoStrategy{
    @Override
    public double pagar (double valor){
        return valor;
    };
}