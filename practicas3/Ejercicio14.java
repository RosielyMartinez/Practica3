
import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {

        int N;
        int suma = 0;

        N = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa el numero N:"
            )
        );

        if (N < 8) {

            JOptionPane.showMessageDialog(
                null,
                "El numero debe ser mayor o igual a 8."
            );

        } else {

            for (int i = 8; i <= N; i++) {

                suma = suma + i;

            }

            JOptionPane.showMessageDialog(
                null,
                "La suma desde 8 hasta " + N + " es: " + suma
            );
        }
    }
}
