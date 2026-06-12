package model;

public class Cliente {
    private String apellido;
    private String nombre;
    private String dni;
    private Direccion direccion;
    private ObraSocial obraSocial;

    public Cliente(String apellido, String nombre, String dni,
                   Direccion direccion, ObraSocial obraSocial) {

        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.obraSocial = obraSocial;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }
}
