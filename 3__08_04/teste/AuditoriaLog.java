public interface PagamentoStrategy{
    void pagar(double valor);
}

public class PagamentoPix implements PagamentoStrategy{
    public double pagar(double valor){
        valor= valor-valor*0.10;
        // System.out.println("valor pago: "+ valor);
        return valor;
    }
}

public class CartaoCredito implements PagamentoStrategy{
    public double pagar (double valor){
        return valor;
    };
}

public class PagamentoFactory{
    private PagamentoStrategy estrategia;

    public void setEstrategia(PagamentoStrategy e){
        this.estrategia=e;
    }

    public double pagar(double valor){
        return estrategia.pagar(valor);
    }
}

public class AuditoriaLog{
    public static void main(String[] args){
        PagamentoFactory pag1 = new PagamentoFactory();
        double valorProduto=100;

        pag1.setEstrategia(new PagamentoPix());
        System.out.println("Pagamento pix: "+ pag1.pagar(valor));
        System.out.println("Pagamento de R$"+ pag1.pagar(valor)+ "realizado via Pix");

        System.out.println("===================================");

        PagamentoFactory pag2 = new PagamentoFactory();
        double valorProduto=200;

        pag2.setEstrategia(new CartaoCredito());
        System.out.println("Pagamento cartao de credito: "+ pag2.pagar(valor));
        System.out.println("Pagamento de R$"+ pag2.pagar(valor)+ "realizado via cartao de credito");

    }
}