public class Pagamento {
    public static void main(String[] args){
        PagamentoFactory pag1 = new PagamentoFactory();
        double valorProduto=100;

        pag1.setEstrategia(new PagamentoPix());
        System.out.println("Pagamento pix: "+ pag1.pagar(valorProduto));
        System.out.println("Pagamento de R$"+ pag1.pagar(valorProduto)+ "realizado via Pix");

        System.out.println("===================================");

        PagamentoFactory pag2 = new PagamentoFactory();
        double valorProduto2=200;

        pag2.setEstrategia(new CartaoCredito());
        System.out.println("Pagamento cartao de credito: "+ pag2.pagar(valorProduto2));
        System.out.println("Pagamento de R$"+ pag2.pagar(valorProduto2)+ "realizado via cartao de credito");

    }
}
