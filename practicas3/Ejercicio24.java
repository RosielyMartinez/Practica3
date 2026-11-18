
import javax.swing.JOptionPane;

public class Ejercicio24 {
    public static void main(String[] args) {

        int N, numero, suma = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números deseas sumar?"));

        for (int i = 1; i <= N; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + i + ":"));
            suma = suma + numero;
        }

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
    }
}
