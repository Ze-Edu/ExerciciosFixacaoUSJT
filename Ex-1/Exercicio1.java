import javax.swing.JOptionPane;
import java.text.NumberFormat;



public class Exercicio1 {
    public static void main (String [] args){

        //declarar variaveis
        double n1, res;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que quer converter para real: "));
        n1 = n1/5.20;

        res = n1;

        //JOptionPane.showMessageDialog(null,"O valor em real fica: "+res);

        JOptionPane.showMessageDialog(null,"O valor em real fica: " + NumberFormat.getInstance().format(res));
    }
}