package model;

import lombok.Data;

@Data
public class Domicilio {
    private int numeroCalle;
    private String nombreCalle;
    private String localidad;
    private String provincia;
    
    public Domicilio(int numeroCalle, String nombreCalle, String localidad, String provincia) {
        this.numeroCalle = numeroCalle;
        this.nombreCalle = nombreCalle;
        this.localidad = localidad;
        this.provincia = provincia;
    }
}