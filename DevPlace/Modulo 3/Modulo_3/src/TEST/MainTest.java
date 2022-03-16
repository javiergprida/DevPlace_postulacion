package TEST;

import CONEXION.Conexion;
import DAO.EmpleadoDao;
import DTO.Empleado;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static EmpleadoDao empleadoD = new EmpleadoDao();

    public static void main(String[] args) {
        //Connect();
        readAll();

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

    public static void Connect(){

        if(Conexion.getConnection() != null){
            System.out.println("Conectado Exitosamente!!");
        }else{
            System.out.println("Fallo al conectarse a la BBDD");
        }

    }
}
