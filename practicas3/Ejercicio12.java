
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int N;

        System.out.print("Ingresa el valor de N: ");
        N = leer.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print((2 * i) + " ");
        }
    }
}
