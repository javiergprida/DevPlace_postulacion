public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private int antiguedad;
    private Cargo puesto;
    private Municipalidades municipio;
    private Paises pais;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String telefono, String email, int antiguedad, Cargo puesto, Municipalidades municipio, Paises pais) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.antiguedad = antiguedad;
        this.puesto = puesto;
        this.municipio = municipio;
        this.pais = pais;
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

    public Cargo getPuesto() {
        return puesto;
    }

    public void setPuesto(Cargo puesto) {
        this.puesto = puesto;
    }

    public Municipalidades getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipalidades municipio) {
        this.municipio = municipio;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
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
                ", puesto=" + puesto +
                ", municipio=" + municipio +
                ", pais=" + pais +
                '}';
    }
}
