public class PagamentoFactory{
    private PagamentoStrategy estrategia;

    public void setEstrategia(PagamentoStrategy e){
        this.estrategia=e;
    }

    public double pagar(double valor){
        return estrategia.pagar(valor);
    }
}

