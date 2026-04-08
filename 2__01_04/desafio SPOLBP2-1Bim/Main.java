
public class Main {
    public static void main (String[]args){

        System.out.println("=== conta poupança ===");
        ContaPoupanca conta1= new ContaPoupanca(1,1000);
        conta1.sacar(1200);
        conta1.renderJuros(0.10);

        System.out.println("saldo atual:" + conta1.getSaldo());

        System.out.println("=== conta corrente ===");
        ContaCorrente conta2=new ContaCorrente(2,2000,5000);
        conta2.sacar(3000);

        System.out.println("saldo atual:" + conta2.getSaldo());

    } 
}


