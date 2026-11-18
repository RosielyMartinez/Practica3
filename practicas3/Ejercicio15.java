
import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void main(String[] args) {

        double caja = 5000;
        double egreso;
        double totalEgresos = 0;
        double restante;

        egreso = Double.parseDouble(
            JOptionPane.showInputDialog(
                "Ingresa un egreso (-1 para terminar):"
            )
        );

        while (egreso != -1) {

            if (egreso >= 0) {

                totalEgresos = totalEgresos + egreso;

            } else {

                JOptionPane.showMessageDialog(
                    null,
                    "Ingresa un egreso valido."
                );
            }

            egreso = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Ingresa otro egreso (-1 para terminar):"
                )
            );
        }

        restante = caja - totalEgresos;

        JOptionPane.showMessageDialog(
            null,
            "Total de egresos: $" + totalEgresos
            + "\nDinero restante en caja: $" + restante
        );
    }
}
