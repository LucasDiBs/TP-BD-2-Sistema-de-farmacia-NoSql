package model;

public class Empleado {
    private String apellido;
    private String nombre;
    private String dni;
    private String cuil;
    private Direccion direccion;
    private ObraSocial obraSocial;
    private boolean encargado;

    public Empleado(String apellido, String nombre, String dni, String cuil, Direccion direccion,
                    ObraSocial obraSocial, boolean encargado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.cuil = cuil;
        this.direccion = direccion;
        this.obraSocial = obraSocial;
        this.encargado = encargado;
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

    public String getCuil() {
        return cuil;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public boolean isEncargado() {
        return encargado;
    }
}
