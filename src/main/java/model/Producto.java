package model;

public class Producto {
    private int codigo;
    private String descripcion;
    private String laboratorio;
    private String tipo;
    private double precio;

    public Producto(int codigo, String descripcion,
                    String laboratorio, String tipo,
                    double precio) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.laboratorio = laboratorio;
        this.tipo = tipo;
        this.precio = precio;
    }
}