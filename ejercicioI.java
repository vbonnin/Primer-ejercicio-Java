// Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los 
// caracteres de la cadena (no devuelve nada el método).
import java.util.Scanner;

public class ejercicioI {
    public static void mostrarCodigoAscii() {
        Scanner sc = new Scanner(System.in); 
        // Creamos un objeto de tipo Scanner para leer datos de entrada del usuario
        System.out.print("Introduce una cadena: "); 
        // Pedimos al usuario que introduzca una cadena de caracteres
        String cadena = sc.nextLine(); 
        // Creamos una variabble que almacene la cadena introducida por el usuario

        for (int i = 0; i < cadena.length(); i++) { 
            // Iteramos en el bucle sobre cada carácter de la cadena
            char caracter = cadena.charAt(i); 
            // Creamos una variable que obtiene el caracter actual
            int codigoASCII = (int) caracter; 
            // Creamos una variable que obtiene el codigo ASCII del carácter actual
            System.out.println("El carácter '" + caracter + "' tiene código ASCII " + codigoASCII); 
            // Mostramos el caracter actual y su codigo ASCII
        }
    }
}

