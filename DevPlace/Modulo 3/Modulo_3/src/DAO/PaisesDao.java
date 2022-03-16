package DAO;


import CONEXION.Conexion;
import DTO.Paises;
import INTERFACES.Operaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PaisesDao implements Operaciones<Paises> {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    private static final String SQL_CREATE =" INSERT INTO pais(pais) value (?)";
    private static final String SQL_UPDATE ="UPDATE pais SET pais=? WHERE id=?";
    private static final String SQL_DELETE ="DELETE FROM pais WHERE id=?";
    private static final String SQL_READ ="SELECT * FROM pais WHERE id=?";
    private static final String SQL_READALL ="SELECT * FROM pais";

    @Override
    public boolean create(Paises paises) {
        try{
            conn = Conexion.getConnection();
            stmt =  conn.prepareStatement(SQL_CREATE);
            stmt.setString(1,paises.getNombre());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("Error: "+ ex);
        }

        return true;
    }

    @Override
    public int update(Paises paises) {
        return 0;
    }

    @Override
    public int delete(int key) {
        return 0;
    }

    @Override
    public Paises read(int key) {
        return null;
    }

    @Override
    public List<Paises> readAll() {
        return null;
    }
}
