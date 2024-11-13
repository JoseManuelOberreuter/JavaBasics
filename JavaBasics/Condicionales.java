public class Condicionales {
    public static void main(String[] args) {

        Float myFloat = 6.5f;
        // myFloat = null;

        if (myFloat != null) {
            System.out.println("El valor de myFloat es: " + myFloat);
        } else {
            System.out.println("myFloat es null");
        }

        Integer myInt = 1;

        if (myInt == 1){
            System.out.println("My int is 1");
        } 
        else if ( myInt == 2) {
            System.out.println("My int is 2");
        }
        else {
            System.out.println("My int is neither 1 nor 2");
        }


    }
}
