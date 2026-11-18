
import javax.swing.JOptionPane;

public class Ejercicio19 {

    public static void main(String[] args) {

        String resultado = "";

        for (int tabla = 1; tabla <= 9; tabla++) {

            resultado = resultado + "\nTabla del " + tabla + "\n";

            for (int i = 1; i <= 10; i++) {

                resultado = resultado + tabla + " x " + i
                        + " = " + (tabla * i) + "\n";
            }
        }

        JOptionPane.showMessageDialog(
            null,
            resultado
        );
    }
}
