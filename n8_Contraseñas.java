import java.util.Random;
import java.util.Scanner;

public class n8_Contraseñas {

    // Constantes que representan los conjuntos de caracteres para la contraseña
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz"; // Letras minúsculas
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Letras mayúsculas
    private static final String DIGITS = "0123456789";                   // Números
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?/"; // Caracteres especiales

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un escáner para leer la entrada del usuario

        System.out.println("=== Generador de Contraseñas Seguras ===");
        System.out.println("Seleccione las opciones para la contraseña:");

        // Solicitar al usuario la longitud de la contraseña
        System.out.print("Longitud de la contraseña (mínimo 8): ");
        int length = scanner.nextInt();
        if (length < 8) { // Verificar que la longitud mínima sea 8
            System.out.println("La longitud mínima es de 8 caracteres.");
            length = 8; // Si no cumple, se ajusta a 8
        }

        // Preguntar si incluir letras minúsculas
        System.out.print("¿Incluir letras minúsculas? (s/n): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("s"); // Leer respuesta y convertir a booleano

        // Preguntar si incluir letras mayúsculas
        System.out.print("¿Incluir letras mayúsculas? (s/n): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("s");

        // Preguntar si incluir números
        System.out.print("¿Incluir números? (s/n): ");
        boolean includeDigits = scanner.next().equalsIgnoreCase("s");

        // Preguntar si incluir caracteres especiales
        System.out.print("¿Incluir caracteres especiales? (s/n): ");
        boolean includeSpecial = scanner.next().equalsIgnoreCase("s");

        // Generar la contraseña según las opciones seleccionadas
        String password = generatePassword(length, includeLowercase, includeUppercase, includeDigits, includeSpecial);

        if (password == null) { // Si no se seleccionaron opciones válidas
            System.out.println("Debe seleccionar al menos un tipo de caracteres para la contraseña.");
        } else { // Mostrar la contraseña generada
            System.out.println("Contraseña generada: " + password);
        }

        scanner.close(); // Cerrar el escáner para liberar recursos
    }

    public static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase, boolean includeDigits, boolean includeSpecial) {
        // Crear un conjunto de caracteres según las opciones seleccionadas
        String characterPool = ""; // Inicializar el pool de caracteres vacío
        if (includeLowercase) characterPool += LOWERCASE; // Añadir minúsculas si están seleccionadas
        if (includeUppercase) characterPool += UPPERCASE; // Añadir mayúsculas si están seleccionadas
        if (includeDigits) characterPool += DIGITS;       // Añadir números si están seleccionados
        if (includeSpecial) characterPool += SPECIAL_CHARACTERS; // Añadir caracteres especiales si están seleccionados

        if (characterPool.isEmpty()) return null; // Retornar null si no hay caracteres disponibles

        Random random = new Random(); // Crear un objeto Random para generar números aleatorios
        StringBuilder password = new StringBuilder(); // Usar StringBuilder para construir la contraseña

        // Generar caracteres aleatorios de la longitud especificada
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length()); // Elegir un índice aleatorio del pool
            password.append(characterPool.charAt(index)); // Añadir el carácter correspondiente a la contraseña
        }

        return password.toString(); // Retornar la contraseña generada como cadena
    }
}
