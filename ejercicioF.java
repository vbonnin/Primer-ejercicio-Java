// Reciba como parámetro un texto y lo devuelva sin espacios en blanco.
import java.util.Scanner;

public class ejercicioF {
    public static void textoSinEspacios() {
        Scanner sc = new Scanner(System.in); 
        // Creamos un objeto de tipo Scanner para leer datos de entrada del usuario
        System.out.print("Introduce un texto: "); 
        // Pedimos al usuario que introduzca un texto
        String texto = sc.nextLine(); 
        // Creamos una variable para recoger el texto introducido por el usuario
        String sinEspacios = texto.replaceAll("\\s", ""); 
        // Reemplazamos todos los espacios en blanco del texto con una cadena vacia con el metodo replaceALl

        System.out.println("El texto sin espacios es: " + sinEspacios); 
        // Mostramos el texto sin espacios
    }
}
