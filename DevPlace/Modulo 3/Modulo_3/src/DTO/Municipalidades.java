package DTO;

public class Municipalidades {

    private int id;
    private String nombre;
    private int id_pais;

    public Municipalidades(String nombre, int id_pais) {
        this.nombre = nombre;
        this.id_pais = id_pais;
    }

    public Municipalidades() {
    }

    public Municipalidades(int id, String nombre, int id_pais) {
        this.id = id;
        this.nombre = nombre;
        this.id_pais = id_pais;
    }

    public int getId() {
        return id;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
