package DAO;

import DTO.Municipalidades;
import INTERFACES.Operaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class MunicipalidadesDao implements Operaciones<Municipalidades> {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    private static final String SQL_CREATE =" INSERT INTO municipalidad(municipalidad, pais_id) value (?,?)";
    private static final String SQL_UPDATE ="UPDATE municipalidad SET municipalidad=?, pais_id=? WHERE id=?";
    private static final String SQL_DELETE ="DELETE FROM municipalidad WHERE id=?";
    private static final String SQL_READ ="SELECT * FROM municipalidad WHERE id=?";
    private static final String SQL_READALL ="SELECT * FROM municipalidad";

    @Override
    public int create(Municipalidades municipalidades) {
        return 0;
    }

    @Override
    public int update(Municipalidades municipalidades) {
        return 0;
    }

    @Override
    public int delete(int key) {
        return 0;
    }

    @Override
    public Municipalidades read(int key) {
        return null;
    }

    @Override
    public List<Municipalidades> readAll() {
        return null;
    }
}
