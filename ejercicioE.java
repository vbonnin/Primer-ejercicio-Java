// Reciba como parámetro un texto y devuelva el texto invertido.
import java.util.Scanner;

public class ejercicioE {
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in); 
        // Creamos un objeto de tipo Scanner para leer datos de entrada del usuario
        System.out.print("Introduce un texto: "); 
        // Pedimos al usuario que introduzca un texto
        String texto = sc.nextLine(); 
        // Creamos una variable para almacenar el texto introducido por el usuario
        String textoInvertido = ""; 
        // Inicializamos una cadena vacia para almacenar el texto invertido

        for (int i = texto.length() - 1; i >= 0; i--) { 
            // Iteramos en un bucle desde el ultimo caracter hasta el primero
            textoInvertido += texto.charAt(i); 
            // Agregamos el caracter actual al principio de la cadena de texto invertido
        }

        System.out.println("El texto invertido es: " + textoInvertido); 
        // Mostramos el texto invertido
    }
}

