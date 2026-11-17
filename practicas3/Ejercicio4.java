
import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

        int numero;
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 50; i++) {

            numero = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Ingresa el numero " + i + " de 50:"
                )
            );

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        JOptionPane.showMessageDialog(
            null,
            "RESULTADOS DE LOS 50 NUMEROS"
            + "\nPares: " + pares
            + "\nImpares: " + impares
            + "\nPositivos: " + positivos
            + "\nNegativos: " + negativos
        );
    }
}
