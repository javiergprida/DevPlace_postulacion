/*
 1. Pide un número por teclado e indica si es un número primo o no. Un número primo es
aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que
25 es divisible entre 5, sin embargo, 17 si es primo.
public class numeroPrimo
 */

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador;
        int I;
        int numero;

        System.out.println("Ingresa un numero: ");

        numero = entrada.nextInt();

        contador = 0;

        for(I = 1; I <= numero; I++)

        {

            if((numero % I) == 0)

            {

                contador++;

            }

        }

        if(contador <= 2)

        {

            System.out.println("El numero " + numero +" es primo");

        }else{

            System.out.println("El numero" + numero +" no es primo");

        }
    }
}
