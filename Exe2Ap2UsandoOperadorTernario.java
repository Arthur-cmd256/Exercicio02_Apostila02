import javax.swing.JOptionPane;

public class Exe2Ap2UsandoOperadorTernario {

    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        JOptionPane.showMessageDialog(null, String.format("Voce%se maior de idade", idade >= 18 ? " " : " nao "));

    }
    
}
