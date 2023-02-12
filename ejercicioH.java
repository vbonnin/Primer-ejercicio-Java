// Reciba como parámetro una cadena y una vocal, el método sustituye todas las vocales 
// de la cadena por la vocal que se ha pasado como parámetro (no devuelve nada).
import java.util.Scanner;

public class ejercicioH {
    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in); 
        // Creamos un objeto de tipo Scanner para leer datos de entrada del usuario
        System.out.print("Introduce una cadena: "); 
        // Pedimos al usuario que introduzca una cadena de caracteres
        String cadena = sc.nextLine(); 
        // Creamos una variable para leer la cadena introducida por el usuario
        System.out.print("Introduce una vocal: "); 
        // Pedimos al usuario que introduzca una vocal
        char vocal = sc.nextLine().charAt(0); 
        // Creamos una variable para leer la vocal introducida por el usuario y tomamos solo el primer carácter

        StringBuilder sb = new StringBuilder(cadena); 
        // Creamos un objeto de tipo StringBuilder a partir de la cadena introducida

        for (int i = 0; i < sb.length(); i++) { 
            // Iteramos un bucle que recorra cada caracter de la cadena
            char cambio = sb.charAt(i); 
            // Creamouns una variable obtienendo el caracter actual
            if (cambio == 'a' || cambio == 'e' || cambio == 'i' || cambio == 'o' || cambio == 'u' || cambio == 'A' || cambio == 'E' || cambio == 'I' || cambio == 'O' || cambio == 'U') {
                sb.setCharAt(i, vocal); 
                // Si el caracter actual es una vocal, lo reemplaza por la vocal introducida por el usuario
            }
        }

        System.out.println("La cadena con las vocales sustituidas es: " + sb.toString()); 
        // Mostramos la cadena con las vocales sustituidas
    }
}
