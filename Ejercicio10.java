
import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {

        int N;
        int contador = 0;

        double tarifa;
        double horas;
        double salario;
        double suma = 0;
        double promedio;

        N = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa la cantidad de trabajadores:"
            )
        );

        if (N <= 0) {

            JOptionPane.showMessageDialog(
                null, "La cantidad debe ser mayor a cero."
            );

        } else {

            for (int i = 1; i <= N; i++) {

                tarifa = Double.parseDouble(
                    JOptionPane.showInputDialog(
                        "Ingresa la tarifa por hora del trabajador " + i + ":"
                    )
                );

                horas = Double.parseDouble(
                    JOptionPane.showInputDialog(
                        "Ingresa las horas trabajadas del trabajador " + i + ":"
                    )
                );

                salario = tarifa * horas;

                suma = suma + salario;

                if (salario >= 500) {
                    contador++;
                }
            }

            promedio = suma / N;

            JOptionPane.showMessageDialog(
                null,
                "Trabajadores con salario mayor o igual a 500: "
                + contador
                + "\nPromedio de salarios: " + promedio
            );
        }
    }
}
