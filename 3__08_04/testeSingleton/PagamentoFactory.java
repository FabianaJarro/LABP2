public class PagamentoFactory{

    private final PagamentoStrategy cartao = new CartaoCredito();
    
    private final PagamentoStrategy pix = new PagamentoPix();

    public PagamentoStrategy getPagamentoStrategy(TipoPagamentoEnum tipoPagamento){
        
        if(TipoPagamentoEnum.PIX.equals(tipoPagamento)){
            return pix;
        }

        if(TipoPagamentoEnum.CARTAO.equals(tipoPagamento)){
            return cartao;
        }
        
        throw new IllegalArgumentException("tipo não suportado");
    }


}

