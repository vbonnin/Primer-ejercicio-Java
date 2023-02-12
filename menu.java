// Prepara un menú que seleccione la ejecución de los diferentes ejercicios que se piden a continuación. 
// Este menú se debe realizar con un switch.
import java.util.Scanner;
// Importamos la clase Scanner para poder leer las entradas del usuario
public class menu {
// Definimos la classe menu
    public static void main(String[] args) {
        // Definimos el metodo main
        Scanner sc = new Scanner(System.in);
        // Creamos la instancia Scanner para poder leer lo que introduzca el usuario
        int opcion;
        // Creamos una variable entera que la llamamos opcion
        do {
            // Iniciamos un bucle do while, el cual se ejecutara mientras opcion != 0
            System.out.println("Selecciona una opción:");
            // Printeamos un mensaje para que el usuario escoja entre una de estas opciones
            System.out.println("1. Leer 5 números y mostrarlos en el mismo orden introducido");
            System.out.println("2. Leer 5 números y mostrarlos en orden inverso al introducido");
            System.out.println("3. Leer 5 números y realizar media de los positivos, negativos y candidad de 0");
            System.out.println("4. Introduzca un texto y muestra cantidad de caracteres");
            System.out.println("5. Introduzca un texto y muestralo en orden inversa");
            System.out.println("6. Introduzca un texto y muestralo sin espacios");
            System.out.println("7. Introduzca dos cadenas de texto y muestralo concatenado");
            System.out.println("8. Introduzca un texto y una vocal y muestrame el texto con las vocales cambiadas");
            System.out.println("9. Introduzca un texto y muestrame el codigo ASCII de cada caracter");
            System.out.println("0. Salir");
            // Mostramos un menu de opciones
            opcion = sc.nextInt();
            // Leemos la opcion introducida por el usuario y se almacena en la variable opcion
            switch(opcion) {
                case 1:
                    ejercicioA.ejercicio1();
                    break;
                case 2:
                    ejercicioB.ejercicio2();
                    break;
                case 3:
                    ejercicioC.ejercicio3();    // En cada uno llamamos  a la clase con su letra y al metodo ejercicio y su numero
                    break;
                case 4:
                    ejercicioD.ejercicio4();
                    break;
                case 5:
                    ejercicioE.ejercicio5();
                    break;
                case 6:
                    ejercicioF.ejercicio6();
                    break;
                case 7:
                    ejercicioG.ejercicio7();
                    break;
                case 8:
                    ejercicioH.ejercicio8();
                    break; 
                case 9:
                    ejercicioI.ejercicio9();
                    break; 
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while(opcion != 0);
    }}
    
