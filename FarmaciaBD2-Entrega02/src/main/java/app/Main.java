package app;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ObraSocial osde = new ObraSocial("OSDE", "458796");

        Cliente cliente1 = new Cliente("Serrano", "Santiago", "45000000",
                new Direccion("San Martin", 123, "Lomas de Zamora", "Buenos Aires"),
                osde);
        Empleado empleado1 = new Empleado("Lopez", "Maximiliano", "31111222", "20-31111222-3",
                new Direccion("Rivadavia", 100, "Lanus", "Buenos Aires"), osde, true);

        Empleado empleado2 = new Empleado("Perez", "Ramiro", "41111222", "20-41111222-4",
                new Direccion("Rivadavia", 100, "Lanus", "Buenos Aires"), osde, false);


        Producto producto1 = new Producto(1001, "Ibuprofeno 600mg", "Bayer",
                                        "Medicamento", 5000);

        Producto producto2 = new Producto(1002, "Shampoo Sedal", "Unilever",
                                        "Perfumeria", 3500);

        ItemVenta item1 = new ItemVenta(
                producto1,
                2,
                producto1.getPrecio()
        );

        ItemVenta item2 = new ItemVenta(
                producto2,
                1,
                producto2.getPrecio()
        );

        List<ItemVenta> items = Arrays.asList(
                item1,
                item2
        );

        List<Empleado> listaEmpleados = Arrays.asList(empleado1, empleado2);
        Sucursal sucursal1 = new Sucursal(1,
                        new Direccion("Hipolito Yrigoyen", 2500, "Lanus", "Buenos Aires")
                        ,listaEmpleados, empleado1);

        double totalVenta = 0;

        for (ItemVenta item : items) {

            totalVenta += item.getTotal();
        }

        Venta venta1 = new Venta(
                "2026-05-22",
                "0001-00000001",
                totalVenta,
                "Tarjeta",
                cliente1,
                empleado1,
                empleado2,
                sucursal1,
                items

        );

        List<Venta> ventas = new ArrayList<>();

        ventas.add(venta1);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();


        //------- Creacion del JSON -------

        String json = gson.toJson(ventas);

        try {

            FileWriter writer = new FileWriter(
                    "ventas.json"
            );

            writer.write(json);

            writer.close();

            System.out.println(
                    "Archivo JSON generado correctamente"
            );

        } catch (IOException e) {

            e.printStackTrace();
        }



    }
}