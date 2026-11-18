
import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {

        int ancho;
        int altura;

        String rectangulo = "";

        ancho = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa el ancho del rectangulo:"
            )
        );

        altura = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa la altura del rectangulo:"
            )
        );

        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= ancho; j++) {

                rectangulo = rectangulo + "*";
            }

            rectangulo = rectangulo + "\n";
        }

        JOptionPane.showMessageDialog(
            null,
            "El rectangulo es:\n" + rectangulo
        );
    }
}
