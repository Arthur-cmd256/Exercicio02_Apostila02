import javax.swing.JOptionPane;

public class Ex2Ap2{
        public static void main(String[] args) {
            
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
            if (idade >= 18){
                JOptionPane.showMessageDialog(null, "Voce e maior de idade!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Voce nao e maior de idade ainda :-(");
            }

        }
}