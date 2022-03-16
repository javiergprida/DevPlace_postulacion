/*
Haz una clase llamada Password que siga las siguientes condiciones:
● Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de
8 caracteres.
● Los constructores serán los siguiente:
■ Un constructor por defecto.
■ Un constructor con la longitud que nosotros le pasemos (Generará una
contraseña aleatoria con esa longitud).
● Los métodos que implementa serán:
○ esFuerte(): devuelve un booleano si es fuerte o no, para que sea
fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de
3 números.
○ generarPassword(): genera la contraseña del objeto con la longitud
que tenga.
○ Métodos get para los atributos contraseña y longitud.
○ Método set para stributo longitud.
Crear un proyecto de consola que solicite al usuario una contraseña por teclado y muestre un
mensaje indicando la contraseña y si es o no fuerte.

*/
public class Main {

    public static void main(String[] args) {
        Password longitud = new Password(8);
        int indice = longitud.Longitud;
        int esFuerte = 0;

        for(int i = 1; i <= indice ;i++){
            System.out.print(Password.generarPassword());
            Password.GetSeguridadContraseña();
        }
        System.out.println();
        System.out.println(Password.esFuerte());

    }

}
