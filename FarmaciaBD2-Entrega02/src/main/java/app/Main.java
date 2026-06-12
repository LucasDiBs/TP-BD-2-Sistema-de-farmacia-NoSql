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

        /* EMPLEADOS */

        Empleado empleado1 = new Empleado(
                "Lopez",
                "Maximiliano",
                "31111222",
                "20-31111222-3",
                new Direccion("Rivadavia", 100, "Lanus", "Buenos Aires"),
                osde,
                true
        );

        Empleado empleado2 = new Empleado(
                "Perez",
                "Ramiro",
                "41111222",
                "20-41111222-4",
                new Direccion("Rivadavia", 120, "Lanus", "Buenos Aires"),
                osde,
                false
        );

        Empleado empleado3 = new Empleado(
                "Gomez",
                "Lucas",
                "32111222",
                "20-32111222-5",
                new Direccion("Belgrano", 200, "Lanus", "Buenos Aires"),
                osde,
                false
        );

        /* CLIENTES */

        List<Cliente> clientes = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {

            clientes.add(
                    new Cliente(
                            "Apellido" + i,
                            "Cliente" + i,
                            "4000000" + i,
                            new Direccion(
                                    "Calle " + i,
                                    100 + i,
                                    "Lanus",
                                    "Buenos Aires"
                            ),
                            osde
                    )
            );
        }

        /* PRODUCTOS */

        List<Producto> productos = Arrays.asList(

                new Producto(1001,"Ibuprofeno","Bayer","Medicamento",5000),
                new Producto(1002,"Paracetamol","Bago","Medicamento",3500),
                new Producto(1003,"Amoxicilina","Roemmers","Medicamento",6000),
                new Producto(1004,"Aspirina","Bayer","Medicamento",2500),
                new Producto(1005,"Omeprazol","Bago","Medicamento",4500),
                new Producto(1006,"Diclofenac","Genomma","Medicamento",4000),
                new Producto(1007,"Tafirol","Sidus","Medicamento",3000),

                new Producto(2001,"Shampoo Sedal","Unilever","Perfumeria",3500),
                new Producto(2002,"Desodorante Rexona","Unilever","Perfumeria",2800),
                new Producto(2003,"Jabon Dove","Unilever","Perfumeria",2000)
        );

        /* SUCURSALES */

        List<Empleado> empleadosSucursal =
                Arrays.asList(empleado1, empleado2, empleado3);

        Sucursal sucursal1 = new Sucursal(
                1,
                new Direccion(
                        "Hipolito Yrigoyen",
                        2500,
                        "Lanus",
                        "Buenos Aires"
                ),
                empleadosSucursal,
                empleado1
        );

        Sucursal sucursal2 = new Sucursal(
                2,
                new Direccion(
                        "Mitre",
                        1800,
                        "Banfield",
                        "Buenos Aires"
                ),
                empleadosSucursal,
                empleado1
        );

        Sucursal sucursal3 = new Sucursal(
                3,
                new Direccion(
                        "Alsina",
                        900,
                        "Lomas de Zamora",
                        "Buenos Aires"
                ),
                empleadosSucursal,
                empleado1
        );

        /* VENTAS */

        List<Venta> ventas = new ArrayList<>();

        for (int i = 1; i <= 90; i++) {

            Cliente cliente =
                    clientes.get(i % clientes.size());

            Producto producto =
                    productos.get(i % productos.size());

            ItemVenta item = new ItemVenta(
                    producto,
                    (i % 3) + 1,
                    producto.getPrecio()
            );

            List<ItemVenta> items =
                    Arrays.asList(item);

            double totalVenta = item.getTotal();

            Sucursal sucursal;

            if (i <= 30) {
                sucursal = sucursal1;
            } else if (i <= 60) {
                sucursal = sucursal2;
            } else {
                sucursal = sucursal3;
            }

            Venta venta = new Venta(
                    "2026-05-" + String.format("%02d", (i % 28) + 1),
                    String.format(
                            "%04d-%08d",
                            sucursal.getPuntoVenta(),
                            i
                    ),
                    totalVenta,
                    "Tarjeta",
                    cliente,
                    empleado1,
                    empleado2,
                    sucursal,
                    items
            );

            ventas.add(venta);
        }

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