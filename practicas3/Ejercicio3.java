
import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {

        int N, digito, suma = 0;

        N = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa un numero entero:"
            )
        );

        N = Math.abs(N);

        while (N > 0) {

            digito = N % 10;

            suma = suma + digito;

            N = N / 10;
        }

        JOptionPane.showMessageDialog(
            null,
            "La suma de los digitos es: " + suma
        );
    }
}
