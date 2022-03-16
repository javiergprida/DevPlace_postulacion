package TEST;

import CONEXION.Conexion;
import DAO.EmpleadoDao;
import DTO.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static EmpleadoDao empleadoD = new EmpleadoDao();

    public static void main(String[] args) {
        //Connect();
        //readAll();
        //readByAge();
        //readBySalary();
        readBySalaryAndAge();

    }
    public static void readAll(){
        List<Empleado> lista = new ArrayList<>();
        lista = empleadoD.readAll();
        for(int i =0; i<lista.size();i++){
            System.out.println(lista.get(i).getId()+" "
                    +lista.get(i).getNombre()+" "
                    +lista.get(i).getApellido()+" "
                    +lista.get(i).getTelefono()+" "
                    +lista.get(i).getEmail()+" "
                    +lista.get(i).getAntiguedad()+" "
                    +lista.get(i).getSalario()+" "
                    +lista.get(i).getPuesto()+" "
                    +lista.get(i).getMunicipio()+" "
                    +lista.get(i).getPais());
        }
    }

    public static void readByAge(){
        int antiguedad = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese  un numero para filtrar por antiguedad: ");
        antiguedad = entrada.nextInt();
        List<Empleado> listaPorAntiguedad = new ArrayList<>();
        listaPorAntiguedad = empleadoD.readByAge(antiguedad);
        for(int i =0; i<listaPorAntiguedad.size();i++){
            System.out.println(listaPorAntiguedad.get(i).getId()+" "
                    +listaPorAntiguedad.get(i).getNombre()+" "
                    +listaPorAntiguedad.get(i).getApellido()+" "
                    +listaPorAntiguedad.get(i).getTelefono()+" "
                    +listaPorAntiguedad.get(i).getEmail()+" "
                    +listaPorAntiguedad.get(i).getAntiguedad()+" "
                    +listaPorAntiguedad.get(i).getSalario()+" "
                    +listaPorAntiguedad.get(i).getPuesto()+" "
                    +listaPorAntiguedad.get(i).getMunicipio()+" "
                    +listaPorAntiguedad.get(i).getPais());
        }
    }

    public static void readBySalary(){
        int salario = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese  un numero para filtrar por salario: ");
        salario = entrada.nextInt();
        List<Empleado> listaPorSalario = new ArrayList<>();
        listaPorSalario = empleadoD.readBySalary(salario);
        for(int i =0; i<listaPorSalario.size();i++){
            System.out.println(listaPorSalario.get(i).getId()+" "
                    +listaPorSalario.get(i).getNombre()+" "
                    +listaPorSalario.get(i).getApellido()+" "
                    +listaPorSalario.get(i).getTelefono()+" "
                    +listaPorSalario.get(i).getEmail()+" "
                    +listaPorSalario.get(i).getAntiguedad()+" "
                    +listaPorSalario.get(i).getSalario()+" "
                    +listaPorSalario.get(i).getPuesto()+" "
                    +listaPorSalario.get(i).getMunicipio()+" "
                    +listaPorSalario.get(i).getPais());
        }
    }


    public static void readBySalaryAndAge(){
        int salario = 0;
        int antiguedad = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese  un numero para filtrar por salario: ");
        salario = entrada.nextInt();
        System.out.println("ingrese  un numero para filtrar por antiguedad: ");
        antiguedad = entrada.nextInt();
        List<Empleado> listaPorDosValores = new ArrayList<>();
        listaPorDosValores = empleadoD.readByAgeAndSalary(antiguedad,salario);
        for(int i =0; i<listaPorDosValores.size();i++){
            System.out.println(listaPorDosValores.get(i).getId()+" "
                    +listaPorDosValores.get(i).getNombre()+" "
                    +listaPorDosValores.get(i).getApellido()+" "
                    +listaPorDosValores.get(i).getTelefono()+" "
                    +listaPorDosValores.get(i).getEmail()+" "
                    +listaPorDosValores.get(i).getAntiguedad()+" "
                    +listaPorDosValores.get(i).getSalario()+" "
                    +listaPorDosValores.get(i).getPuesto()+" "
                    +listaPorDosValores.get(i).getMunicipio()+" "
                    +listaPorDosValores.get(i).getPais());
        }
    }

    public static void Connect(){

        if(Conexion.getConnection() != null){
            System.out.println("Conectado Exitosamente!!");
        }else{
            System.out.println("Fallo al conectarse a la BBDD");
        }

    }
}
