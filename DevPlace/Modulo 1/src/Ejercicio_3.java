import java.util.Scanner;

/*
* 3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se
pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado
tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados
multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar.
* */
public class Ejercicio_3 {

    public static void main(String[] args) {

        double valorHora = 0;
        String nombreEmpleado;
        int antiguedad = 0;
        double horasTrabajadasAlMes = 0;
        double sueldo = 0;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = entrada.next();

        System.out.println("Ingrese el valor de la hora del empleado: ");
        valorHora = entrada.nextDouble();

        System.out.println("Ingrese las horas trabajadas al mes");
        horasTrabajadasAlMes = entrada.nextInt();

        System.out.println("Ingrese la antiguedad del empleado");
        antiguedad = entrada.nextInt();

        if (antiguedad < 10) {
            sueldo = horasTrabajadasAlMes * valorHora;
        } else if (antiguedad > 10) {

            sueldo = horasTrabajadasAlMes * valorHora + (antiguedad * 30);
        }


        System.out.println("El Empleado " + nombreEmpleado
                + " tiene trabajando en la empresa "
                + antiguedad + " años, y su sueldo mensual es: $ " + sueldo);
    }
}


