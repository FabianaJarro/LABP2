import javax.swing.*;
import java.awt.*;


public class exercicio2 extends JFrame{
    public exercicio2(){
        setTitle("Login");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel painelFormulario = new JPanel(new GridLayout(2,2));

        JLabel lblUtilizador = new JLabel ("Utilizador:");
        JTextField txtUtilizador = new JTextField();
        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField();

        painelFormulario.add(lblUtilizador);
        painelFormulario.add(txtUtilizador);
        painelFormulario.add(lblSenha);
        painelFormulario.add(txtSenha);

         


        JPanel painelBotao= new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botao=new JButton("Entrar");

        botao.addActionListener(e ->{
            
            String utilizador= txtUtilizador.getText();
            String senha= new String(txtSenha.getPassword());

            System.out.println("clicou");
            if ("admin". equals(utilizador)){
                System.out.println("admin Certo" + utilizador);
                JOptionPane.showMessageDialog(null, "Admin certo");
            }else{
                System.out.println("admin errado" + utilizador);
                JOptionPane.showMessageDialog(null, "Admin errado");
                
            }

            if ("1234". equals(senha)){
                System.out.println("senha Certo" + senha);
                JOptionPane.showMessageDialog(null, "senha correta");
            }else{
                System.out.println("senha errado" + senha);
                JOptionPane.showMessageDialog(null, "senha errada");
                // JTextField
            }

        });

        painelBotao.add(botao);

        add(painelFormulario, BorderLayout.CENTER);
        add(painelBotao, BorderLayout.SOUTH);
        

        
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            exercicio2 janela = new exercicio2();

            janela.setVisible(true); 
        });
    }
}
