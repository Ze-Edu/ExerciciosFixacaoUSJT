import javax.swing.JOptionPane;

public class Condicoes {
    public static void main(String [] args){

        double n1, n2, n3, res;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1° Nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2° Nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 3° Nota: "));

        res = n1+n2+n3;

        JOptionPane.showMessageDialog(null,"Sua nota final é: "+ res);
    
        if(res >=80){
            JOptionPane.showMessageDialog(null,"Parabéns, aprovado com louvor!");
        }else if(res >= 70){
            JOptionPane.showMessageDialog(null,"Parabéns, aprovado!");
        }else if(res >= 50){
            JOptionPane.showMessageDialog(null,"Recuperação!");
        }else if(res < 50){
            JOptionPane.showMessageDialog(null,"Reprovado!");
        }

        JOptionPane.showMessageDialog(null,"Até mais!");
    }
}