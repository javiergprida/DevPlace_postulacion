package DTO;

public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private int antiguedad;
    private int salario;
    private String puesto;
    private String municipio;
    private String pais;
    private int intPuesto;
    private int intMunicipio;
    private int intPais;

    public Empleado() {
    }

    public Empleado( String nombre, String apellido, String telefono, String email, int antiguedad, int salario, int intPuesto, int intMunicipio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.antiguedad = antiguedad;
        this.salario = salario;
        this.intPuesto = intPuesto;
        this.intMunicipio = intMunicipio;

    }

    public Empleado(int id, String nombre, String apellido, String telefono, String email, int antiguedad, int salario, String puesto, String municipio, String pais, int intPuesto, int intMunicipio, int intPais) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.antiguedad = antiguedad;
        this.salario = salario;
        this.puesto = puesto;
        this.municipio = municipio;
        this.pais = pais;
        this.intPuesto = intPuesto;
        this.intMunicipio = intMunicipio;
        this.intPais = intPais;
    }



    public int getId() {
        return id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIntPuesto() {
        return intPuesto;
    }

    public void setIntPuesto(int intPuesto) {
        this.intPuesto = intPuesto;
    }

    public int getIntMunicipio() {
        return intMunicipio;
    }

    public void setIntMunicipio(int intMunicipio) {
        this.intMunicipio = intMunicipio;
    }

    public int getIntPais() {
        return intPais;
    }

    public void setIntPais(int intPais) {
        this.intPais = intPais;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", antiguedad=" + antiguedad +
                ", salario=" + salario +
                ", puesto='" + puesto + '\'' +
                ", municipio='" + municipio + '\'' +
                ", pais='" + pais + '\'' +
                ", intPuesto=" + intPuesto +
                ", intMunicipio=" + intMunicipio +
                ", intPais=" + intPais +
                '}';
    }
}
