import java.util.Scanner;

public class n9_ConversorMonedas {

    public static void main(String[] args) {
        // Tasas de cambio 
        double tasaUsdToClp = 880.00; // 1 USD a CLP
        double tasaEurToClp = 940.00; // 1 EUR a CLP
        double tasaClpToUsd = 0.00114; // 1 CLP a USD
        double tasaClpToEur = 0.00106; // 1 CLP a EUR
        double tasaClpToArs = 1.96; // 1 CLP a ARS
        double tasaArsToClp = 0.51; // 1 ARS a CLP

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Conversor de Monedas");
        System.out.println("Seleccione la moneda de origen:");
        System.out.println("1. USD (Dólar estadounidense)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. ARS (Peso argentino)");
        System.out.println("4. CLP (Peso chileno)");
        int monedaOrigen = scanner.nextInt();

        System.out.println("Seleccione la moneda de destino:");
        System.out.println("1. USD (Dólar estadounidense)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. ARS (Peso argentino)");
        System.out.println("4. CLP (Peso chileno)");
        int monedaDestino = scanner.nextInt();

        System.out.println("Ingrese la cantidad a convertir:");
        double cantidad = scanner.nextDouble();

        double resultado = convertirMoneda(monedaOrigen, monedaDestino, cantidad, 
                                           tasaUsdToClp, tasaEurToClp, tasaClpToUsd, 
                                           tasaClpToEur, tasaClpToArs, tasaArsToClp);

        if (resultado >= 0) {
            System.out.printf("Resultado: %.2f%n", resultado);
        } else {
            System.out.println("Conversión no válida. Intente de nuevo.");
        }

        scanner.close();
    }

    public static double convertirMoneda(int origen, int destino, double cantidad,
                                         double usdToClp, double eurToClp, double clpToUsd, 
                                         double clpToEur, double clpToArs, double arsToClp) {
        if (origen == destino) {
            return cantidad; // Si la moneda de origen y destino son iguales
        }

        switch (origen) {
            case 1: // USD
                switch (destino) {
                    case 2: return cantidad * (1 / eurToClp) * usdToClp;
                    case 3: return cantidad * usdToClp / arsToClp;
                    case 4: return cantidad * usdToClp;
                }
                break;
            case 2: // EUR
                switch (destino) {
                    case 1: return cantidad * (1 / usdToClp) * eurToClp;
                    case 3: return cantidad * eurToClp / arsToClp;
                    case 4: return cantidad * eurToClp;
                }
                break;
            case 3: // ARS
                switch (destino) {
                    case 1: return cantidad * arsToClp / usdToClp;
                    case 2: return cantidad * arsToClp / eurToClp;
                    case 4: return cantidad * arsToClp;
                }
                break;
            case 4: // CLP
                switch (destino) {
                    case 1: return cantidad * clpToUsd;
                    case 2: return cantidad * clpToEur;
                    case 3: return cantidad * clpToArs;
                }
                break;
        }
        // Si la conversión no es válida
        return -1;
    }
}
