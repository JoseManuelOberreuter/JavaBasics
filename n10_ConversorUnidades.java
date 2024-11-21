import java.util.Scanner;

public class n10_ConversorUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Conversor de Unidades ====");
            System.out.println("1. Temperatura");
            System.out.println("2. Longitud");
            System.out.println("3. Peso");
            System.out.println("4. Velocidad");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertTemperature(scanner);
                    break;
                case 2:
                    convertLength(scanner);
                    break;
                case 3:
                    convertWeight(scanner);
                    break;
                case 4:
                    convertSpeed(scanner);
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el conversor de unidades!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Conversor de temperatura
    public static void convertTemperature(Scanner scanner) {
        System.out.println("\n=== Conversor de Temperatura ===");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una opción: ");
        int option = scanner.nextInt();

        System.out.print("Ingresa la temperatura: ");
        double temperature = scanner.nextDouble();

        if (option == 1) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f °C son %.2f °F\n", temperature, fahrenheit);
        } else if (option == 2) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f °F son %.2f °C\n", temperature, celsius);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Conversor de longitud
    public static void convertLength(Scanner scanner) {
        System.out.println("\n=== Conversor de Longitud ===");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Millas");
        System.out.println("3. Millas a Metros");
        System.out.print("Elige una opción: ");
        int option = scanner.nextInt();

        System.out.print("Ingresa la longitud: ");
        double length = scanner.nextDouble();

        switch (option) {
            case 1:
                System.out.printf("%.2f metros son %.2f kilómetros\n", length, length / 1000);
                break;
            case 2:
                System.out.printf("%.2f kilómetros son %.2f millas\n", length, length * 0.621371);
                break;
            case 3:
                System.out.printf("%.2f millas son %.2f metros\n", length, length * 1609.34);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Conversor de peso
    public static void convertWeight(Scanner scanner) {
        System.out.println("\n=== Conversor de Peso ===");
        System.out.println("1. Kilogramos a Libras");
        System.out.println("2. Libras a Kilogramos");
        System.out.print("Elige una opción: ");
        int option = scanner.nextInt();

        System.out.print("Ingresa el peso: ");
        double weight = scanner.nextDouble();

        if (option == 1) {
            System.out.printf("%.2f kg son %.2f libras\n", weight, weight * 2.20462);
        } else if (option == 2) {
            System.out.printf("%.2f libras son %.2f kg\n", weight, weight / 2.20462);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Conversor de velocidad
    public static void convertSpeed(Scanner scanner) {
        System.out.println("\n=== Conversor de Velocidad ===");
        System.out.println("1. Kilómetros por hora a Millas por hora");
        System.out.println("2. Millas por hora a Metros por segundo");
        System.out.println("3. Metros por segundo a Kilómetros por hora");
        System.out.print("Elige una opción: ");
        int option = scanner.nextInt();

        System.out.print("Ingresa la velocidad: ");
        double speed = scanner.nextDouble();

        switch (option) {
            case 1:
                System.out.printf("%.2f km/h son %.2f mph\n", speed, speed * 0.621371);
                break;
            case 2:
                System.out.printf("%.2f mph son %.2f m/s\n", speed, speed * 0.44704);
                break;
            case 3:
                System.out.printf("%.2f m/s son %.2f km/h\n", speed, speed * 3.6);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
