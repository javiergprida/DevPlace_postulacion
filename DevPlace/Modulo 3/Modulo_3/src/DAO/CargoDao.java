package DAO;

import DTO.Cargo;
import DTO.Empleado;
import INTERFACES.Operaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CargoDao implements Operaciones<Cargo> {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    private static final String SQL_CREATE ="INSERT INTO cargo(cargo) value (?)";
    private static final String SQL_UPDATE ="UPDATE cargo SET cargo=? WHERE id=?";
    private static final String SQL_DELETE ="DELETE FROM cargo WHERE id=?";
    private static final String SQL_READ ="SELECT * FROM cargo WHERE id=?";
    private static final String SQL_READALL ="SELECT * FROM cargo";

    @Override
    public int create(Cargo cargo) {
        return 0;
    }

    @Override
    public int update(Cargo cargo) {
        return 0;
    }

    @Override
    public int delete(int key) {
        return 0;
    }

    @Override
    public Cargo read(int key) {
        return null;
    }

    @Override
    public List<Cargo> readAll() {
        return null;
    }
}
