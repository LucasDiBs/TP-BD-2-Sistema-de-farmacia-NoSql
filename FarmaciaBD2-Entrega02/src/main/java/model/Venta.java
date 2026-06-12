package model;


import java.util.List;

public class Venta {
    //De cada venta se registra: fecha, número de ticket, total de la venta,
    // forma de pago (efectivo, tarjeta o débito), productos vendidos con sus cantidades,
    // precio unitario y total; empleado que atendió al cliente y el empleado que realizó el cobro en caja.

    private String fecha;
    private String numeroTicket;
    private double totalVenta;
    private String formaDePago;

    private Cliente cliente;

    private Empleado empleadoAtencion;
    private Empleado empleadoCaja;

    private Sucursal sucursal;

    private List<ItemVenta> items;


    public Venta(String fecha, String numeroTicket, double totalVenta, String formaDePago, Cliente cliente, Empleado empleadoAtencion, Empleado empleadoCaja, Sucursal sucursal, List<ItemVenta> items) {
        this.fecha = fecha;
        this.numeroTicket = numeroTicket;
        this.totalVenta = totalVenta;
        this.formaDePago = formaDePago;
        this.cliente = cliente;
        this.empleadoAtencion = empleadoAtencion;
        this.empleadoCaja = empleadoCaja;
        this.sucursal = sucursal;
        this.items = items;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(String numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleadoAtencion() {
        return empleadoAtencion;
    }

    public void setEmpleadoAtencion(Empleado empleadoAtencion) {
        this.empleadoAtencion = empleadoAtencion;
    }

    public Empleado getEmpleadoCaja() {
        return empleadoCaja;
    }

    public void setEmpleadoCaja(Empleado empleadoCaja) {
        this.empleadoCaja = empleadoCaja;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<ItemVenta> getItems() {
        return items;
    }

    public void setItems(List<ItemVenta> items) {
        this.items = items;
    }
}
