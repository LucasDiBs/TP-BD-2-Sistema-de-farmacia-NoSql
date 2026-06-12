package model;

import java.util.List;

public class Sucursal {

    private int puntoVenta;
    private Direccion direccion;
    private List<Empleado> empleados;
    private Empleado encargado;

    public Sucursal(int puntoVenta,
                    Direccion direccion,
                    List<Empleado> empleados,
                    Empleado encargado) {

        this.puntoVenta = puntoVenta;
        this.direccion = direccion;
        this.empleados = empleados;
        this.encargado = encargado;
    }

    public int getPuntoVenta() {
        return puntoVenta;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado getEncargado() {
        return encargado;
    }
}
