
import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {

        char letra;

        do {

            letra = JOptionPane.showInputDialog(
                "Ingresa un caracter:"
            ).toLowerCase().charAt(0);

        } while (letra != 'a' && letra != 'e'
                && letra != 'i' && letra != 'o'
                && letra != 'u');

        JOptionPane.showMessageDialog(
            null,
            "La primera vocal encontrada es: " + letra
        );
    }
}
