// Tipos de variables clasicos
public class n2_Variables {

    public static void main(String[] args) {

        // Cadenas de texto
        String myString = "Esto es una cadena de texto";
        myString = "Aqui estoy cambiando el valor de la cadena de texto";
        System.out.println(myString);

        // Números enteros
        Integer myInt = 7;
        myInt = myInt + 3; // Cambiando el valor de mi variable llamando a mi variable. 
        System.out.println(myInt - 1); // La resta no se guarda en la variable.


        // Numeros decimales
        Double myDouble = 6.5; 
        System.out.println(myDouble); // Double mas preciso pero mas memoria 8 bytes.

        Float myFloat = 6.5f; // Es necesario agregar la letra f o F al final del número. Si no se especifica, Java lo interpretará como un double.
        System.out.println(myFloat); // Menos preciocion pero menos memoria 4 bytes.

        System.err.println(myDouble + myFloat + myInt); // No hay problemas de compatibilidad

        // Valores Booleanos, verdadeos o falsos.
        Boolean myBoolean = true; 
        myBoolean = false; 
        System.out.println(myBoolean);

        //Problemas de compatibilidad con Null
        myFloat = null; 
        // System.out.println(myFloat + 10); //! Esto crashea la app
        
        // Constantes, no se puede cambiar el valor
        final Double myConstant = 3.1415; 
        System.out.println("El numero pi no cambia nunca: " + myConstant);


    }
    
}