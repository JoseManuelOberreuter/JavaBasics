import java.util.Scanner;

public class n12_ConversorTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar las opciones al usuario
        System.out.println("Bienvenido al Conversor de Tiempo");
        System.out.println("Por favor, elige el tipo de unidad de tiempo que deseas ingresar:");
        System.out.println("1. Milisegundos");
        System.out.println("2. Segundos");
        System.out.println("3. Minutos");
        System.out.println("4. Horas");
        System.out.println("5. Días");
        System.out.println("6. Semanas");
        System.out.println("7. Meses (aproximado: 30 días)");
        System.out.println("8. Años (aproximado: 365 días)");

        // Leer la opción del usuario
        System.out.print("Ingresa tu elección (1-8): ");
        int opcion = scanner.nextInt();

        // Leer la cantidad ingresada
        System.out.print("Ingresa la cantidad de tiempo en la unidad seleccionada: ");
        double cantidad = scanner.nextDouble();

        // Convertir la cantidad ingresada a segundos
        double segundos = 0;
        switch (opcion) {
            case 1: // Milisegundos
                segundos = cantidad / 1000;
                break;
            case 2: // Segundos
                segundos = cantidad;
                break;
            case 3: // Minutos
                segundos = cantidad * 60;
                break;
            case 4: // Horas
                segundos = cantidad * 3600;
                break;
            case 5: // Días
                segundos = cantidad * 86400;
                break;
            case 6: // Semanas
                segundos = cantidad * 604800;
                break;
            case 7: // Meses
                segundos = cantidad * 2592000; // Aproximado: 30 días
                break;
            case 8: // Años
                segundos = cantidad * 31536000; // Aproximado: 365 días
                break;
            default:
                System.out.println("Opción inválida. Por favor, reinicia el programa.");
                scanner.close();
                return;
        }

        // Realizar las conversiones
        double milisegundos = segundos * 1000;
        double minutos = segundos / 60;
        double horas = segundos / 3600;
        double dias = segundos / 86400;
        double semanas = segundos / 604800;
        double meses = segundos / 2592000; // Aproximado
        double años = segundos / 31536000; // Aproximado

        // Mostrar los resultados
        System.out.println("\nConversión completa:");
        System.out.printf("Milisegundos: %.2f\n", milisegundos);
        System.out.printf("Segundos: %.2f\n", segundos);
        System.out.printf("Minutos: %.2f\n", minutos);
        System.out.printf("Horas: %.2f\n", horas);
        System.out.printf("Días: %.2f\n", dias);
        System.out.printf("Semanas: %.2f\n", semanas);
        System.out.printf("Meses: %.2f\n", meses);
        System.out.printf("Años: %.2f\n", años);

        System.out.println("\n¡Gracias por usar el Conversor de Tiempo!");
        scanner.close();
    }
}
