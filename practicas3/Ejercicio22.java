
import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static void main(String[] args) {

        int p, s, r;
        int posicion = 0;
        int dias = 0;

        p = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa la profundidad del agujero:"
            )
        );

        s = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa los metros que sube el caracol:"
            )
        );

        r = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa los metros que resbala:"
            )
        );

        while (posicion < p) {

            posicion = posicion + s;
            dias++;

            if (posicion >= p) {
                break;
            }

            posicion = posicion - r;
        }

        JOptionPane.showMessageDialog(
            null,
            "El caracol saldra en " + dias + " dias."
        );
    }
}
