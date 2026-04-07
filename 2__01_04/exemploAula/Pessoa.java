//A classe mãe
public class Pessoa {
    //protected: o nome está seguro contra acessosexternos
    //porem as classes filhas (professor e aluno) tem a pernissao para acessar

    protected String nome;

    public Pessoa(String nome){
        this.nome=nome;
    }

    public void apresentar(){
        System.out.println("Olá, sou "+this.nome);
    }
}

