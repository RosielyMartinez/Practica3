
import javax.swing.JOptionPane;

 public class Ejercicio1 { {

    public static void main(String[] args) {

        int N, suma = 0;

        N = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa un número natural:"
            )
        );

        for (int i = 1; i <= N; i++) {
            suma = suma + i;
        }

        JOptionPane.showMessageDialog(
            null,
            "La suma de los primeros " + N +
            " números naturales es: " + suma
        );
    }
}
