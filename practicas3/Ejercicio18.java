
import javax.swing.JOptionPane;

public class Ejercicio18 {

    public static void main(String[] args) {

        double numero;
        double maximo;
        double minimo;

        numero = Double.parseDouble(
            JOptionPane.showInputDialog(
                "Ingresa el numero 1:"
            )
        );

        maximo = numero;
        minimo = numero;

        for (int n = 2; n <= 100; n++) {

            numero = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Ingresa el numero " + n + ":"
                )
            );

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }
        }

        JOptionPane.showMessageDialog(
            null,
            "El valor maximo es: " + maximo
            + "\nEl valor minimo es: " + minimo
        );
    }
}
