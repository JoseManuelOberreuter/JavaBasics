import java.util.Scanner;

public class n7_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bienvenida
        System.out.println("Bienvenidos a la calculadora básica!");

        char operacion;
        while (true) {
            // Solicitud de operación
            System.out.println("¿Qué operación vamos a realizar?");
            System.out.println("S - Suma");
            System.out.println("R - Resta");
            System.out.println("M - Multiplicación");
            System.out.println("D - División");
            System.out.print("Elige una opción: ");

            operacion = scanner.nextLine().toUpperCase().charAt(0);

            // Validar si la opción es válida
            if (operacion == 'S' || operacion == 'R' || operacion == 'M' || operacion == 'D') {
                break; // Salir del bucle si la entrada es válida
            } else {
                System.out.println("Opción no válida. Por favor, elige una opción correcta.");
            }
        }

        // Solicitar los números al usuario
        System.out.print("Introduce el primer número: ");
        int myFirstNumber = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int mySecondNumber = scanner.nextInt();

        // Variable para almacenar el resultado
        int resultado = 0;

        // Realizar la operación seleccionada
        switch (operacion) {
            case 'S':
                resultado = suma(myFirstNumber, mySecondNumber);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 'R':
                resultado = resta(myFirstNumber, mySecondNumber);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 'M':
                resultado = multiplicacion(myFirstNumber, mySecondNumber);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 'D':
                if (mySecondNumber != 0) {
                    double division = division(myFirstNumber, mySecondNumber);
                    System.out.println("El resultado de la división es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;
        }

        scanner.close();
    }

    // Métodos para cada operación
    public static int suma(int myFirstNumber, int mySecondNumber) {
        return myFirstNumber + mySecondNumber;
    }

    public static int resta(int myFirstNumber, int mySecondNumber) {
        return myFirstNumber - mySecondNumber;
    }

    public static int multiplicacion(int myFirstNumber, int mySecondNumber) {
        return myFirstNumber * mySecondNumber;
    }

    public static double division(int myFirstNumber, int mySecondNumber) {
        return (double) myFirstNumber / mySecondNumber;
    }
}
