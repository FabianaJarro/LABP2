public class Professor extends Pessoa{
    //
    //
    private String area;

    public Professor (String nome, String area){
        //
        //
        super(nome);
        this.area=area;
    }

    @Override
    public void apresentar(){
        //
        //
        System.out.println("Olá, sou o Prof. " +this.nome +" da area de " +this.area);
    }
}