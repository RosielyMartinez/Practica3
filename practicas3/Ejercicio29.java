
import javax.swing.JOptionPane;

public class Ejercicio29 {
    public static void main(String[] args) {

        int dia, mes, anio;
        int dias = 0;
        int bisiesto = 0;

        String primero;
        String[] semana = {
            "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"
        };

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes:"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año:"));

        primero = JOptionPane.showInputDialog(
            "¿Qué día fue el primero de enero? (l, m, x, j, v, s, d)"
        );

        switch (mes) {
            case 1: dias = 0; break;
            case 2: dias = 31; break;
            case 3: dias = 59; break;
            case 4: dias = 90; break;
            case 5: dias = 120; break;
            case 6: dias = 151; break;
            case 7: dias = 181; break;
            case 8: dias = 212; break;
            case 9: dias = 243; break;
            case 10: dias = 273; break;
            case 11: dias = 304; break;
            case 12: dias = 334; break;
        }

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            bisiesto = 1;
        }

        if (bisiesto == 1 && mes > 2) {
            dias++;
        }

        dias = dias + dia - 1;

        int inicio = 0;

        switch (primero.toLowerCase()) {
            case "l": inicio = 0; break;
            case "m": inicio = 1; break;
            case "x": inicio = 2; break;
            case "j": inicio = 3; break;
            case "v": inicio = 4; break;
            case "s": inicio = 5; break;
            case "d": inicio = 6; break;
        }

        int resultado = (inicio + dias) % 7;

        JOptionPane.showMessageDialog(null,
            "El día de la semana es: " + semana[resultado]);
    }
}
