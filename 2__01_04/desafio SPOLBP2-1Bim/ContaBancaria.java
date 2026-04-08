public class ContaBancaria {
    int numero;
    double saldo;
    //qual a diferença entre protecte e private msm
    protected  ContaBancaria(int numero, double saldoInicial){
        this.numero=numero;
        this.saldo=saldoInicial;
    }
    //o construtor não tem retorno. além disso ele tem o msm nome da classe
    //o objeto é a conta bancária criada 
    //tipo, a contaBancaria é a classe enquanto uma conta é o objeto
    //o contrutor  é isso, ele cria uma nova intancia (objeto) e garante cque ele comece em um estado válido com valores iniciais já definidos
    //o this se refere ao atributo do objeto. O contrutor pega os valores e coloca dentro do objeto (conta) (this é o objeto)


    //this.numero e this.saldo são atributos enquanto numero e saldoInicial são parametros (os em parametros)
    //o this se refere a um atributo (como dito ali emcima) logo ele se refere a this.saldo e this.numero
    //não teria pq colocar this.saldoInicial pq ele não é um atributo


    public void depositar(double valor){
        this.saldo= this.saldo+ valor;
    }

    public boolean sacar (double valor){
        // this.saldo= this.saldo-valor;
        if (this.saldo>=valor){
            this.saldo=this.saldo-valor;
            return true;
        }else{
            System.out.println("o saldo não é suficiente");
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }


//ai a gente tem parametros, que são variaveis declaradas no cabeçalho de um método que deinem os dados de entrada
// que ele esoera receber (o parametro seria o valor (double valor))
//ai tem uma diferença para os argumentos por exemplo, eles (os parametros) funcionam
// como containers para valores passaodos (argumentos) durante a chamada do método. 
//por exemplo: void soma (int a, int b) parametros são deginidos nesse método, enquanto argumentos são os valores reais passados na chamada ex:
// soma(5,10)




}