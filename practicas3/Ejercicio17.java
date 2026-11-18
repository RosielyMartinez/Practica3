
import javax.swing.JOptionPane;

public class Ejercicio17 {

    public static void main(String[] args) {

        double consumo;
        double descuento;
        double pago;
        double totalPagos = 0;

        for (int i = 1; i <= 130; i++) {

            consumo = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Ingresa el consumo " + i + " de 130:"
                )
            );

            if (consumo > 130) {

                descuento = consumo * 0.15;
                pago = consumo - descuento;

            } else {

                pago = consumo;

            }

            totalPagos = totalPagos + pago;
        }

        JOptionPane.showMessageDialog(
            null,
            "El total de pagos del restaurante es: $"
            + totalPagos
        );
    }
}
