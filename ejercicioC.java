// Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos 
// y contar el número de ceros que se han introducido por teclado.
import java.util.Scanner;

public class ejercicioC {
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in); 
        // Creamos un objeto de tipo Scanner para leer datos de entrada del usuario
        int contadorPositivos = 0; 
        // Inicializamos un contador de numeros enteros positivos a cero
        int contadorNegativos = 0; 
        // Inicializamos un contador de numeros enteros negativos a cero
        double sumaPositivos = 0;
         // Inicializamos la suma de los numeros positivos a cero
        double sumaNegativos = 0; 
        // Inicializamos la suma de los numeros negativos a cero
        int contadorCeros = 0; 
        // Inicializamos un contador de ceros a cero

        for (int i = 0; i < 5; i++) { 
            // Bucle para que el usuario introduzca 5 numeros
            System.out.print("Introduce un número: "); 
            // Pide al usuario que introduzca un numero
            int numero = sc.nextInt(); 
            // Lee el numero introducido por el usuario

            if (numero > 0) { 
            // Si el numero es positivo
                contadorPositivos++; 
                // Incrementa el contador de numeros positivos
                sumaPositivos += numero; 
                // Sumamos el numero al total de la suma de numeros positivos
            } else if (numero < 0) { 
                // Si el numero es negativo
                contadorNegativos++; 
                // Incrementamos el contador de numeros negativos
                sumaNegativos += numero; 
                // Sumamos el numero al total de la suma de numeros negativos
            } else { 
                // Si el numero es cero
                contadorCeros++; 
                // Incrementa el contador de ceros
            }
        }
            // Condiciones para la impresion del resultado
        if (contadorPositivos > 0) { 
            // Si se introdujeron numeros positivos
            System.out.println("La media de los números positivos es: " + (sumaPositivos / contadorPositivos)); 
            // Calcula y muestra la media de los numeros positivos; suma/contador
        } else { 
            // Si no se introdujeron numeros positivos
            System.out.println("No se introdujeron números positivos."); 
            // Muestra un mensaje indicando que no se introdujeron numeros positivos
        }

        if (contadorNegativos > 0) { 
            // Si se introdujeron numeros negativos
            System.out.println("La media de los números negativos es: " + (sumaNegativos / contadorNegativos)); 
            // Calcula y muestra la media de los números negativos; suma/contador
        } else { 
            // Si no se introdujeron numeros negativos
            System.out.println("No se introdujeron números negativos."); 
            // Muestra un mensaje indicando que no se introdujeron numeros negativos
        }

        System.out.println("Se introdujeron " + contadorCeros + " ceros."); 
        // Muestra la cantidad de ceros introducidos
    }
}
