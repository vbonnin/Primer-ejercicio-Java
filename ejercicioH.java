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
        // Creamos una variable para leer la vocal introducida por el usuario y tomamos solo el primer caracter

        
        String nuevaCadena = "";
        // Creamos una cadena vacía donde iremos concatenando los caracteres modificados
        
        for (int i = 0; i < cadena.length(); i++) {
             // Iteramos el bucle sobre cada caracter de la cadena original
            
            char cambio = cadena.charAt(i);
            // Obtenemos el caracter actual
            // Si el caracter actual es una vocal, lo reemplazamos por la vocal introducida por el usuario
            if (cambio == 'a' || cambio == 'e' || cambio == 'i' || cambio == 'o' || cambio == 'u' || cambio == 'A' || cambio == 'E' || cambio == 'I' || cambio == 'O' || cambio == 'U') {
                nuevaCadena += vocal;
                // Si el caracter actual es una vocal, lo reemplazamos por la vocal introducida por el usuario
            } else {
                // Si el caracter actual no es una vocal, lo concatenamos tal cual a la nueva cadena
                nuevaCadena += cambio;
            }
        }

       
        System.out.println("La cadena con las vocales sustituidas es: " + nuevaCadena);
        // Mostramos por pantalla la cadena con las vocales sustituidas
    }
}

