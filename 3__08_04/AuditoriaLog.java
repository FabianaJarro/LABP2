interface PagamentoStrategy{
    double pagar(double valor);
}

class PagamentoPix implements PagamentoStrategy{
    public double pagar(double valor){
        valor= valor-valor*0.10;
        // System.out.println("valor pago: "+ valor);
        return valor;
    }
}

class CartaoCredito implements PagamentoStrategy{
    public double pagar (double valor){
        return valor;
    };
}

class Criptomoeda implements PagamentoStrategy{
    public double pagar (double valor){
        valor-=valor*0.50;
        return valor;
    };
}

class PagamentoFactory{
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
        System.out.println("Pagamento de R$"+ pag1.pagar(valorProduto)+ "realizado via Pix");

        System.out.println("===================================");

        PagamentoFactory pag2 = new PagamentoFactory();
        double valorProduto2=200;

        pag2.setEstrategia(new CartaoCredito());
        System.out.println("Pagamento de R$"+ pag2.pagar(valorProduto2)+ " realizado via cartao de credito");

        System.out.println("===================================");

        PagamentoFactory pag3 = new PagamentoFactory();
        double valorProduto3=300;

        pag3.setEstrategia(new Criptomoeda());
        System.out.println("Pagamento de R$"+ pag3.pagar(valorProduto3)+ " realizado via criptomoeda");



    }
}