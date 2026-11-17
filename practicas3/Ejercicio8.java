
import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {

        int numero, original, temporal;
        int digito, cantidad;
        long suma, potencia;

        while (true) {

            numero = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Ingresa un numero (0 para terminar):"
                )
            );

            if (numero == 0) {
                JOptionPane.showMessageDialog(
                    null, "Programa terminado."
                );
                break;
            }

            if (numero < 0) {
                JOptionPane.showMessageDialog(
                    null, "Ingresa un numero positivo. Vuelve a intentar."
                );
                continue;
            }

            original = numero;
            temporal = numero;
            cantidad = 0;

            // Contar los digitos
            while (temporal > 0) {
                cantidad++;
                temporal = temporal / 10;
            }

            temporal = numero;
            suma = 0;

            // Sumar las potencias de cada digito
            while (temporal > 0) {

                digito = temporal % 10;
                potencia = 1;

                for (int i = 1; i <= cantidad; i++) {
                    potencia = potencia * digito;
                }

                suma = suma + potencia;
                temporal = temporal / 10;
            }

            if (suma == original) {

                JOptionPane.showMessageDialog(
                    null, original + " SI es un numero Armstrong."
                );

            } else {

                JOptionPane.showMessageDialog(
                    null,
                    original + " NO es un numero Armstrong."
                    + "\nVuelve a intentar."
                );
            }
        }
    }
}
