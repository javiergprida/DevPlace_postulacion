package TEST;

import CONEXION.Conexion;

public class ConnectionTest {

    public static void main(String[] args) {
        Connect();

    }

    public static void Connect(){

        if(Conexion.getConnection() != null){
            System.out.println("Conectado Exitosamente!!");
        }else{
            System.out.println("Fallo al conectarse a la BBDD");
        }

    }
}
