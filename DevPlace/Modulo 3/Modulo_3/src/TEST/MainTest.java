package TEST;

import CONEXION.Conexion;
import DAO.CargoDao;
import DAO.EmpleadoDao;
import DAO.MunicipalidadesDao;
import DAO.PaisesDao;
import DTO.Cargo;
import DTO.Empleado;
import DTO.Municipalidades;
import DTO.Paises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

    static Scanner entrada = new Scanner(System.in);
    private static EmpleadoDao empleadoD = new EmpleadoDao();
    private static CargoDao cargoD = new CargoDao();
    private static MunicipalidadesDao municipioD = new MunicipalidadesDao();
    private static PaisesDao paisesD = new PaisesDao();

    public static void main(String[] args) {
        int opcion;
        do{

        System.out.println("ya creo la base de datos correctamente con el query en el archico 'dbempleados.txt' ? ");
            System.out.println("1. si ya creo la base de datos correctamente");
            System.out.println("2. si no creo la base de datos");
            System.out.print("opcion: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1://ingresamos al menu
                    menu();

                    break;
                case 2://cerramos el programa
                    System.out.println("por favor cree la base de datos");
                    break;
                default: System.out.println("error, opcion incorrecta");
                    break;


            }

        }while(opcion != 2);
    }





    public static void menu(){
        int opcion;
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. insertar datos en la base de datos");
            System.out.println("2. leer todos los empleados");
            System.out.println("3. filtrar empelados por antiguedad");
            System.out.println("4. filtrar empelados por salario");
            System.out.println("5. filtrar empelados por antiguedad y salario");
            System.out.println("6. salir");
            System.out.print("opcion: ");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1://insertar datos en la base de datos
                    System.out.println("insertando datos en la base de datos");
                    System.out.println("Insertando los cargos");
                    createCargo();
                    System.out.println("Insertando los paises");
                    createPais();
                    System.out.println("Insertando los municipalidades");
                    createMunicipalidad();
                    System.out.println("Insertando los empleados");
                    createEmpleado();

                    break;
                case 2://leer todos los empleados
                    System.out.println("datos de los empleados");
                    readAll();
                    break;
                case 3://filtrar empelados por antiguedad
                    System.out.println("datos filtrados  por antiguedad");
                    readByAge();
                    break;
                case 4://filtrar empelados por salario
                    System.out.println("datos filtrados  por salario");
                    readBySalary();
                    break;
                case 5://filtrar empelados por antiguedad y salario
                    System.out.println("datos filtrados  por salario y antiguedad");
                    readBySalaryAndAge();
                    break;
                case 6://salir
                    break;
                default: System.out.println("error, opcion incorrecta");
                    break;


            }

        }while(opcion != 6);
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
        System.out.println("ingrese  un numero para filtrar por salario: ");
        salario = entrada.nextInt();
        System.out.println("ingrese  un numero para filtrar por antiguedad: ");1

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

    public static void createCargo(){
        Cargo cargo1 = new Cargo("peon");
        Cargo cargo2 = new Cargo("limpieza");
        Cargo cargo3 = new Cargo("cajero");
        Cargo cargo4 = new Cargo("pasillero");
        Cargo cargo5 = new Cargo("encargado");
        System.out.println(cargoD.create(cargo1));
        System.out.println(cargoD.create(cargo2));
        System.out.println(cargoD.create(cargo3));
        System.out.println(cargoD.create(cargo4));
        System.out.println(cargoD.create(cargo5));

    }

    public static void createPais(){

        Paises pais1 = new Paises("mexico");
        Paises pais2 = new Paises("peru");
        System.out.println(paisesD.create(pais1));
        System.out.println(paisesD.create(pais2));

    }

    public static void createMunicipalidad(){
        Municipalidades minucipio1 = new Municipalidades("cdmx",2);
        Municipalidades minucipio2 = new Municipalidades("lima",3);
        System.out.println(municipioD.create(minucipio1));
        System.out.println(municipioD.create(minucipio2));

    }

    public static void createEmpleado(){
        Empleado empleadoCrear1 = new Empleado("javier","prida","1122554488","correo@mail.com", 10,70000,1,1);
        Empleado empleadoCrear2 = new Empleado("jose", "perez", "1155778844", "mail@mail.com", 5, 50000, 1, 1);
        Empleado empleadoCrear3 = new Empleado("maria","lopez","1122554488","correo@mail.com", 15,120000,1,2);
        Empleado empleadoCrear4 = new Empleado("lourdes","prida","1122554488","correo@mail.com", 10,150000,1,2);
        System.out.println(empleadoD.create(empleadoCrear1));
        System.out.println(empleadoD.create(empleadoCrear2));
        System.out.println(empleadoD.create(empleadoCrear3));
        System.out.println(empleadoD.create(empleadoCrear4));
    }
}
