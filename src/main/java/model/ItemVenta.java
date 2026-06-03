package model;

public class ItemVenta {

    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    private double total;

    public ItemVenta(Producto producto, int cantidad,
                     double precioUnitario) {

        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = cantidad * precioUnitario;
    }
}