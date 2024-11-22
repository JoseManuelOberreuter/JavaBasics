import java.util.Scanner;
import java.util.Random;

public class n11_SimuladorDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al simulador de dados!");
        System.out.print("¿Cuántos dados quieres lanzar? (1-10): ");
        int numeroDeDados = scanner.nextInt();

        // Validar el número de dados
        if (numeroDeDados < 1 || numeroDeDados > 10) {
            System.out.println("Por favor, ingresa un número válido de dados entre 1 y 10.");
        } else {
            System.out.println("\nLanzando " + numeroDeDados + " dado(s)...");

            // Lanzar los dados
            int total = 0;
            for (int i = 1; i <= numeroDeDados; i++) {
                int resultado = random.nextInt(6) + 1; // Generar un número entre 1 y 6
                System.out.println("Dado " + i + ": " + resultado);
                total += resultado;
            }

            System.out.println("\nSuma total de los dados: " + total);
        }

        System.out.println("\n¡Gracias por jugar!");
        scanner.close();
    }
}
