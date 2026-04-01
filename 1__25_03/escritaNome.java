import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;


public class escritaNome {
   public static void main(String[] args) {
       Path caminho = Paths.get("Exercicio_1.txt");
       Path target= Paths.get("Exercicio_1_rename.txt");
       String conteudo = "nome \nprontuário";

           try {
                // Escreve
               Files.writeString(caminho, conteudo);
               System.out.println("Arquivo gerado!");
               // Lê
               List<String> linhas = Files.readAllLines(caminho);
               for (String linha : linhas) {
                   System.out.println(linha);
               }
               // Renomeia
               Files.move(caminho, target, StandardCopyOption.REPLACE_EXISTING);
               System.out.println("Arquivo renomeado com sucesso.");

           } catch (IOException e) {
               System.err.println("Erro ao renomear: " + e.getMessage());
       }
   }
}


