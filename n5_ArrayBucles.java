import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class n5_ArrayBucles {
    public static void main(String[] args) {
        String myString = "Esta es mi cadena de texto"; // Variable String
        String mySecondString = "Esta es mi segunda cadena de texto"; // Variable String
        List<String> myList = new ArrayList<>(); // Creando lista tipo Array especifica para Strings
        myList.add(myString + ", " + mySecondString); // Añadiendo las variables String al Array
        System.out.println(myList);

        Map<String, String> myMap = new HashMap<>(); // Usar Diamond Operator <>
        myMap.put("Key1", myString); // Añadiendo un valor a la llave
        myMap.put("Key2", mySecondString);
        System.out.println(myMap);

        // Bucle finito
        for (int index = 0; index < myList.size(); index++) {
            System.err.println(myList.get(index));
        }
    }
}
