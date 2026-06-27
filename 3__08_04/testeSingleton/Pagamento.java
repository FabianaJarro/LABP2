public class Pagamento {
    public static void main(String[] args){
        PagamentoFactory factory = new PagamentoFactory();
        double valorProduto=100;

        PagamentoStrategy pagamentoStrategy = factory.getPagamentoStrategy(TipoPagamentoEnum.PIX);
        
        double valorProcessado = pagamentoStrategy.pagar(valorProduto);

        System.out.println("Pagamento pix: "+ valorProcessado);
        System.out.println("Pagamento de R$ "+ valorProcessado+ "realizado via Pix");

        System.out.println("===================================");

   
        double valorProduto2=200;

        pagamentoStrategy = factory.getPagamentoStrategy(TipoPagamentoEnum.CARTAO);

        valorProcessado = pagamentoStrategy.pagar(valorProduto2);
        System.out.println("Pagamento cartao de credito: "+ valorProcessado);
        System.out.println("Pagamento de R$ "+ valorProcessado + " realizado via cartao de credito");

    }
}

