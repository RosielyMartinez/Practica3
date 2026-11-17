
import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        int N;
        long factorial = 1;

        N = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa un numero entero:"
            )
        );

        if (N < 0) {

            JOptionPane.showMessageDialog(
                null,
                "No existe factorial para numeros negativos."
            );

        } else if (N > 20) {

            JOptionPane.showMessageDialog(
                null,
                "Ingresa un numero entre 0 y 20."
            );

        } else {

            for (int i = 1; i <= N; i++) {

                factorial = factorial * i;
            }

            JOptionPane.showMessageDialog(
                null,
                "El factorial de " + N + " es: " + factorial
            );
        }
    }
}
