/*
* 4. Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a continuación, al
usuario adivinar el número escogido por el ordenador. Para ello, debe introducir un
número comprendido entre 0 y 1000. Se compara el número introducido con el
calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
función del caso. Se repite la operación hasta que el usuario encuentra el número.
* */

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        // Generar número aleatorio entre 1 y 1000
        int numeroRamdon = (int) ((Math.random() * 1000)+1); // Número aleatorio de 1 a 1000.

        // Crear Scanner para leer del teclado
        Scanner entrada = new Scanner(System.in);

        // Solicitar un número al usuario
        int numeroUsuario;
        do {
            System.out.println("Intenta adivinar el número generado entre 0 y 1000. Ingresa tu propuesta: ");
            numeroUsuario = entrada.nextInt();
            if (numeroRamdon > numeroUsuario) {
                System.out.println("El número generado es mayor que el introducido");
            } else if (numeroRamdon < numeroUsuario) {
                System.out.println("l número generado es menor que el introducido");
            }
        } while (numeroRamdon != numeroUsuario);

        // Si termina el ciclo while es porque los números son iguales. Felicitamos al usuario
        System.out.println("Has acertado, el número generado fue: " + numeroRamdon);
    }
}
