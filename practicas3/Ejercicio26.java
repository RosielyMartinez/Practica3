
import javax.swing.JOptionPane;

public class Ejercicio26 {
    public static void main(String[] args) {

        int N;
        int logaritmo = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));

        while (N > 1) {
            N = N / 2;
            logaritmo++;
        }

        JOptionPane.showMessageDialog(null, "El logaritmo base 2 es: " + logaritmo);
    }
}
