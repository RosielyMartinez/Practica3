
import javax.swing.JOptionPane;

public class Ejercicio23 {
    public static void main(String[] args) {

        int N, M;

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de N:"));
        M = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de M:"));

        for (int i = N; i <= M; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
