
import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static void main(String[] args) {

        double nota;
        double suma = 0;
        double promedio;

        int contador = 0;

        nota = Double.parseDouble(
            JOptionPane.showInputDialog(
                "Ingresa una calificacion (10 para terminar):"
            )
        );

        while (nota != 10) {

            suma = suma + nota;
            contador++;

            nota = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Ingresa otra calificacion (10 para terminar):"
                )
            );
        }

        if (contador > 0) {

            promedio = suma / contador;

            JOptionPane.showMessageDialog(
                null,
                "La suma de las calificaciones es: " + suma
                + "\nLa media de las calificaciones es: " + promedio
            );

        } else {

            JOptionPane.showMessageDialog(
                null,
                "No se ingresaron calificaciones."
            );
        }
    }
}
