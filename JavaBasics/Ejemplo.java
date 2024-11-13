import java.util.Scanner;

public class Ejemplo {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar edad al usuario
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Saludar al usuario y comentar su edad
        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años.");

        // Interacción adicional basada en la edad
        if (edad < 18) {
            System.out.println("Eres menor de edad. ¡Aún tienes muchas cosas por aprender y experimentar!");
        } else {
            System.out.println("Eres mayor de edad. ¡Aprovecha todas las oportunidades que vienen!");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
