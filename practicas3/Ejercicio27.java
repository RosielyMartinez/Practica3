
import javax.swing.JOptionPane;

public class Ejercicio27 {
    public static void main(String[] args) {

        int P1, P2, P3, P4;
        int resultado = 0;

        P1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el palito 1:"));
        P2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el palito 2:"));
        P3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el palito 3:"));
        P4 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el palito 4:"));

        if (P1 == P2 && P2 == P3) {
            resultado = 1;
        }

        if (P1 == P2 && P2 == P4) {
            resultado = 1;
        }

        if (P1 == P3 && P3 == P4) {
            resultado = 1;
        }

        if (P2 == P3 && P3 == P4) {
            resultado = 1;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
