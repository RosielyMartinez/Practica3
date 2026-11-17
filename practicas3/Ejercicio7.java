
import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        double numero;
        double suma = 0;
        double media;

        for (int i = 1; i <= 100; i++) {

            numero = Double.parseDouble(
                JOptionPane.showInputDialog(
                    null,
                    "Ingresa el numero " + i + " de 100"
                )
            );

            suma = suma + numero;
        }

        media = suma / 100;

        JOptionPane.showMessageDialog(
            null,
            "La suma es: " + suma
            + "\nLa media de los 100 numeros es: " + media
        );

    }
}
