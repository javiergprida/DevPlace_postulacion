import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
* 5. Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese
caso se terminará el programa.
Al terminar, mostrará lo siguiente:
a. – mayor número introducido
b. – menor número introducido
c. – suma de todos los números
d. – suma de los números
* */
public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int n;

        do {
            System.out.println("Introduce números enteros. -1 para acabar: ");
            System.out.println("Numero: ");
            n = entrada.nextInt();
            if (n != 0){
                numeros.add(n);
            }
        }while (n != -1);

        System.out.println("Ha introducido: " + numeros.size() + " números:");

        //mostrar el arrayList completo
        System.out.println(numeros);

        //mostrar max y min
        System.out.println("El valor máximo es: " + Collections.max(numeros));
        System.out.println("El valor mínimo es: " + Collections.min(numeros));

        //recorrido usando un iterador para mostrar un elemento por línea
        Iterator it = numeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //recorrido usando foreach para sumar los elementos
        double suma = 0;
        double sumaPositivos = 0;
        for(Integer i: numeros){
            suma = suma + i;
            if(i > 0){
                sumaPositivos = sumaPositivos + i;
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Suma todos los positivos: " + sumaPositivos);

    }

}
