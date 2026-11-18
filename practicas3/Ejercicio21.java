
import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {

        long N;
        int contador = 0;

        N = Long.parseLong(
            JOptionPane.showInputDialog(
                "Ingresa el numero inicial N:"
            )
        );

        while (N < 30000) {

            N = N * N;

            contador++;
        }

        JOptionPane.showMessageDialog(
            null,
            "Valor final de N: " + N
            + "\nVeces que se elevo al cuadrado: " + contador
        );
    }
}
