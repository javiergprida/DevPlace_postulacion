import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conn;

    public Connection getConnection(){
        try{

            String db = "jdbc:mysql://localhost:3500/empleados_db";
            conn = DriverManager.getConnection(db, "root", "6071");
            return conn;

        }catch(SQLException e){
            System.out.println( "Error: " + e);
        }
        return null;
    }

}
