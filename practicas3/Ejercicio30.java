
import javax.swing.JOptionPane;

public class Ejercicio30 {
    public static void main(String[] args) {

        double X, potencia = 1;
        int n, conta = 0;

        X = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base X:"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el exponente n:"));

        if (X == 0 && n <= 0) {
            JOptionPane.showMessageDialog(null, "No existe solución");
        } else {

            if (n < 0) {
                X = 1 / X;
                n = -n;
            }

            while (conta < n) {
                potencia = potencia * X;
                conta++;
            }

            JOptionPane.showMessageDialog(null, "El resultado es: " + potencia);
        }
    }
}
