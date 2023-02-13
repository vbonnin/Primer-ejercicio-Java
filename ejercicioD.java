// Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.
import java.util.Scanner;

public class ejercicioD {
    public static void cantidadDeCaracteres() {
        Scanner sc = new Scanner(System.in); 
        // Creamos un objeto de tipo Scanner para leer datos de entrada del usuario
        System.out.print("Introduce un texto: "); 
        // Pedimos al usuario que introduzca un texto
        String texto = sc.nextLine(); 
        // Creamos variable para leer el texto introducido por el usuario
        int cantidadCaracteres = texto.length(); 
        // Creamos variable para contar la cantidad de caracteres en el texto
        System.out.println("El texto incorpora " + cantidadCaracteres + " caracteres."); 
        // Mostramos la cantidad de caracteres en el texto
    }
}

