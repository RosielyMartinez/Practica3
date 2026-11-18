
import javax.swing.JOptionPane;

public class Ejercicio25 {
    public static void main(String[] args) {

        int N;

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura de la pirámide:"));

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
