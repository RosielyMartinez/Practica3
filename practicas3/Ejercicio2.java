
import javax.swing.JOptionPane;

public class Ejercicio2 { 

    public static void main(String[] args) {

        int N;
        int aprobadas = 0;
        int reprobadas = 0;

        double calificacion;
        double sumaTotal = 0;
        double sumaAprobadas = 0;
        double sumaReprobadas = 0;

        N = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa el numero de materias:"
            )
        );

        if (N <= 0) {
            JOptionPane.showMessageDialog(
                null, "El numero de materias debe ser mayor a cero."
            );
            return;
        }

        for (int i = 1; i <= N; i++) {

            calificacion = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Ingresa la calificacion de la materia " + i + ":"
                )
            );

            sumaTotal = sumaTotal + calificacion;

            if (calificacion >= 6) {
                aprobadas++;
                sumaAprobadas = sumaAprobadas + calificacion;
            } else {
                reprobadas++;
                sumaReprobadas = sumaReprobadas + calificacion;
            }
        }

        double promedioGeneral = sumaTotal / N;

        String resultado = "Materias aprobadas: " + aprobadas
                + "\nMaterias reprobadas: " + reprobadas
                + "\nPromedio general: " + promedioGeneral;

        if (aprobadas > 0) {
            resultado += "\nPromedio de aprobadas: "
                    + (sumaAprobadas / aprobadas);
        } else {
            resultado += "\nNo hay materias aprobadas.";
        }

        if (reprobadas > 0) {
            resultado += "\nPromedio de reprobadas: "
                    + (sumaReprobadas / reprobadas);
        } else {
            resultado += "\nNo hay materias reprobadas.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
