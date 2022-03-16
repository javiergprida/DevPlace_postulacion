/*
* 2. Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
presione una tecla, luego de esto se cerrará el programa.
* */

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int password1, password2, password3;
        System.out.print("Introduzca primera Contraseña: ");
        password1 = entrada.nextInt();
        System.out.print("Introduzca nuevamente la Contraseña: ");
        password2 = entrada.nextInt();
        System.out.print("Introduzca por ultima vez la Contraseña: ");
        password3 = entrada.nextInt();
        if (password1 == password2) {
            if (password2 == password3) {
                if (password3 == password1) {
                    System.out.println("Felicitaciones, recordás tu contraseña");
                } else {
                    System.out.println( "No recordás tu contraseña.Tenes que ejercitar la memoria");
                }
            }else{
                System.out.println( "No recordás tu contraseña.Tenes que ejercitar la memoria");
            }

        }else{
            System.out.println( "No recordás tu contraseña.Tenes que ejercitar la memoria");
        }
    }
}