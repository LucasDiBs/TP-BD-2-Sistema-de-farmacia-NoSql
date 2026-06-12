package model;

public class ObraSocial {

    private String nombre;
    private String numeroAfiliado;

    public ObraSocial(String nombre, String numeroAfiliado) {
        this.nombre = nombre;
        this.numeroAfiliado = numeroAfiliado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroAfiliado() {
        return numeroAfiliado;
    }
}
