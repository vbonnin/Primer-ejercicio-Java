// Leer 5 números y mostrarlos en orden inverso al introducido.

import java.util.Scanner; // Importamos la clase Scanner para poder leer los numeros que introduzca el usuario

public class ejercicioB {
    public static void numerosInversos() {
        Scanner sc = new Scanner(System.in); 
        // Importa la clase Scanner y crea un objeto de tipo Scanner para leer datos de entrada del usuario
        int[] numeros = new int[5]; 
        // Crea un array de enteros con  un tamaño de  5
        System.out.println("Introduce 5 numeros:"); 
        // Pide al usuario que introduzca 5 números
        for(int i=0; i<numeros.length; i++) {
            numeros[i] = sc.nextInt();
             // Lee los números del usuario y los almacena en el array llamado numeros
        }
        System.out.println("Los numeros introducidos en orden inverso son:"); 
        // Imprimimos un mensaje indicando que se van a mostrar los números en orden inverso
        for(int i=numeros.length-1; i>=0; i--) {
            System.out.print(numeros[i] + " ");
             // Imprime los numeros del array en orden inverso
        }
        System.out.println(); 
        // Imprimimos una linea en blanco para separar el resultado de la linea de entrada del bucle
    }
}


