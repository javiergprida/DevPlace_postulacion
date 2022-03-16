package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3500/empleados_db?serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD ="6071";
    private static Connection conn = null;

    public static Connection getConnection(){
        try{

            if(conn == null){
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            }

        }catch(ClassNotFoundException | SQLException e){
            System.out.println( "Error: " + e);
        }
        return conn;
    }

}
