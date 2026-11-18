
import javax.swing.JOptionPane;

public class Ejercicio28 {
    public static void main(String[] args) {

        int N;
        int suma = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));

        while (N > 0) {
            suma = suma + N;
            N = N / 2;
        }

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
    }
}
