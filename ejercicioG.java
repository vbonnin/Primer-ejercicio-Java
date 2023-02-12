// Reciba como parámetro dos cadenas y las devuelva concatenadas.
import java.util.Scanner;

public class ejercicioG {
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in); 
        // Creamos un objeto de tipo Scanner para leer datos de entrada del usuario
        System.out.print("Introduce la primera cadena: "); 
        // Pedimos al usuario que introduzca la primera cadena de caracteres
        String cadena1 = sc.nextLine(); 
        // Creamos una variable para leer la primera cadena introducida por el usuario
        System.out.print("Introduce la segunda cadena: "); 
        // Pedimos al usuario que introduzca la segunda cadena
        String cadena2 = sc.nextLine(); 
        // Creamos otra variable para leer la segunda cadena introducida por el usuario
        String cadenaConcatenada = cadena1 + cadena2; 
        // Creamos una tercera variable que concatena las dos cadenas introducidas por el usuario

        System.out.println("La cadena concatenada es: " + cadenaConcatenada); 
        // Mostramos la cadena concatenada
    }
}
