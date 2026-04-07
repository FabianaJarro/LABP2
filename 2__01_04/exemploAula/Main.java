public class Main {
    public static void main (String[]args){
        Pessoa p1=new Pessoa("Carlos");
        p1.apresentar();

        System.out.println("----------------");

        Professor prof1=new Professor ("Carlos", "Informática");
        prof1.apresentar();
        
    }
}