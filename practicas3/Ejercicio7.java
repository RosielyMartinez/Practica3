import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {

        long suma = 0;
        double producto = 1;

        for (int i = 20; i <= 400; i = i + 2) {

            suma = suma + i;

            producto = producto * i;
        }

        JOptionPane.showMessageDialog(
            null,
            "La suma de los numeros pares es: " + suma
            + "\nEl producto de los numeros pares es: " + producto
        );

    }
}
