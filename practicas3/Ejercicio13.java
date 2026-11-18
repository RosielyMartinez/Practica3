
import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {

        int N;
        int producto = 1;

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de N:"));

        for (int i = 1; i <= N; i++) {
            producto = producto * i;
        }

        JOptionPane.showMessageDialog(null, "El producto es: " + producto);
    }
}

import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {

        int N;
        int producto = 1;

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de N:"));

        for (int i = 1; i <= N; i++) {
            producto = producto * i;
        }

        JOptionPane.showMessageDialog(null, "El producto es: " + producto);
    }
}
