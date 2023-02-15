// Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos en el mismo orden introducido.
//  Los 5 números se deben almacenar en un array.

import java.util.Scanner;
// Importamos la clase Scanner para poder leer los numeros que introduzca el usuario
public class EjercicioA {
    // Creamos la clase y llamamos al metodo ejercicio1
    public static void numeros() {
        Scanner sc = new Scanner(System.in);
        // Introducimos la clase Scanner para poder leer los numeros que introduzca el usuario
        int[] numeros = new int[5];
        // Creamos un array de 5 elementos que almacenara los numeros introducidos por el usuario
        System.out.println("Introduce 5 números:");
        // Pedimos al usuario que introduzca 5 numeros
        for(int i=0; i<numeros.length; i++) {
            // Bucle for iniciado en 0, mientras i sea menor a 5, y vaya sumando 1 en cada vuelta de bucle
            numeros[i] = sc.nextInt();
            // iremos almacenando en el array de numeros
        }
        System.out.println("Los números introducidos son:");
        // mostramos los numeros introducidos por el usuario
        for(int i=0; i<numeros.length; i++) {
            // Recorremos otro bucle for para imprimir el array numeros
            System.out.print(numeros[i] + " ");
        }
        // Hacemos un salto de linea para separar la salida por pantalla
        System.out.println();
    }
}
