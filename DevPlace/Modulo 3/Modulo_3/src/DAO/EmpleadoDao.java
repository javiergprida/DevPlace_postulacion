package DAO;

import CONEXION.Conexion;
import DTO.Empleado;

import INTERFACES.OperacionesEmpleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao implements OperacionesEmpleado<Empleado> {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    private static final String SQL_CREATE =" INSERT INTO empleado (nombre,apellido,telefono,email,antiguedad,salario,cargo_id,municipalidad_id) \n" +
            "VALUES (?, ?, ?, ?, ?, ?, ?,?)";
    private static final String SQL_UPDATE ="UPDATE empleado SET nombre=?, apellido=?,telefono=?,email=?,antiguedad=? WHERE=ID?)";
    private static final String SQL_DELETE ="DELETE FROM empleado WHERE=id?";
    private static final String SQL_READ ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id WHERE id = ?";
    private static final String SQL_READALL ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id";
    //private static final String SQL_READBYAGE ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id WHERE e.antiguedad >= " + age ;
    //private static final String SQL_READBYSALARY ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id WHERE  e.salario >= " + salario ;
   // private static final String SQL_READBYAGEANDSALARY ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id WHERE e.antiguedad  >= "+ age + "  AND  e.salario >= " + salario ;


    @Override
    public int create(Empleado empleado) {
        return 0;
    }

    @Override
    public int update(Empleado empleado) {
        return 0;
    }

    @Override
    public int delete(int key) {
        return 0;
    }

    @Override
    public Empleado read(int key) {
        return null;
    }

    //creamos la funcionalidad para leer todos los usuarios
    @Override
    public List<Empleado> readAll() {

        List<Empleado> lista = new ArrayList<>();
        try{
            conn = Conexion.getConnection();
            stmt =  conn.prepareStatement(SQL_READALL);
            rs = stmt.executeQuery();
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellido(rs.getString(3));
                empleado.setTelefono(rs.getString(4));
                empleado.setEmail(rs.getString(5));
                empleado.setAntiguedad(rs.getInt(6));
                empleado.setSalario(rs.getInt(7));
                empleado.setPuesto(rs.getString(8));
                empleado.setMunicipio(rs.getString(9));
                empleado.setPais(rs.getString(10));
                lista.add(empleado);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: "+ e);
        }
        return lista;

    }

    @Override
    public List<Empleado> readByAge(Integer age) {
        List<Empleado> listaPorAntiguedad = new ArrayList<>();
        String SQL_READBYAGE ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id WHERE e.antiguedad >= '" + age+"'" ;
        try{
            conn = Conexion.getConnection();
            stmt =  conn.prepareStatement(SQL_READBYAGE);
            rs = stmt.executeQuery();
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellido(rs.getString(3));
                empleado.setTelefono(rs.getString(4));
                empleado.setEmail(rs.getString(5));
                empleado.setAntiguedad(rs.getInt(6));
                empleado.setSalario(rs.getInt(7));
                empleado.setPuesto(rs.getString(8));
                empleado.setMunicipio(rs.getString(9));
                empleado.setPais(rs.getString(10));
                listaPorAntiguedad.add(empleado);
            }

        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
        return listaPorAntiguedad;
    }

    @Override
    public List<Empleado> readBySalary(Integer salario) {
        List<Empleado> listaPorSalario = new ArrayList<>();
        String SQL_READBYSALARY ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id WHERE  e.salario >= '" + salario +"'" ;
        try{
            conn = Conexion.getConnection();
            stmt =  conn.prepareStatement(SQL_READBYSALARY);
            rs = stmt.executeQuery();
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellido(rs.getString(3));
                empleado.setTelefono(rs.getString(4));
                empleado.setEmail(rs.getString(5));
                empleado.setAntiguedad(rs.getInt(6));
                empleado.setSalario(rs.getInt(7));
                empleado.setPuesto(rs.getString(8));
                empleado.setMunicipio(rs.getString(9));
                empleado.setPais(rs.getString(10));
                listaPorSalario.add(empleado);
            }

        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
        return listaPorSalario;
    }

    @Override
    public List<Empleado> readByAgeAndSalary(Integer age, Integer salario) {
            List<Empleado> listaPorDosValores = new ArrayList<>();
        String SQL_READBYAGEANDSALARY ="SELECT e.id,e.nombre,e.apellido,e.telefono,e.email,e.antiguedad,e.salario, c.cargo, m.municipalidad,  p.pais FROM empleado e INNER JOIN cargo c ON e.cargo_id = c.id INNER JOIN municipalidad m ON e.municipalidad_id = m.id INNER JOIN pais p ON m.pais_id = p.id WHERE e.antiguedad  >= '"+ age + "'  AND  e.salario >= '" + salario+"' " ;
        try{
                conn = Conexion.getConnection();
                stmt =  conn.prepareStatement(SQL_READBYAGEANDSALARY);
                rs = stmt.executeQuery();
                while(rs.next()){
                    Empleado empleado = new Empleado();
                    empleado.setId(rs.getInt(1));
                    empleado.setNombre(rs.getString(2));
                    empleado.setApellido(rs.getString(3));
                    empleado.setTelefono(rs.getString(4));
                    empleado.setEmail(rs.getString(5));
                    empleado.setAntiguedad(rs.getInt(6));
                    empleado.setSalario(rs.getInt(7));
                    empleado.setPuesto(rs.getString(8));
                    empleado.setMunicipio(rs.getString(9));
                    empleado.setPais(rs.getString(10));
                    listaPorDosValores.add(empleado);
                }

            } catch (SQLException e) {
                System.out.println("Error: "+ e);
            }
            return listaPorDosValores;
    }

}
