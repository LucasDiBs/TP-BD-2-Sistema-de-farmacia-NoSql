package app;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CargarVentasMongo {

    public static void main(String[] args) {

        try {

            // Leer archivo JSON
            String json = Files.readString(
                    Paths.get("ventas.json")
            );

            // Parsear array JSON
            JsonArray ventasJson =
                    JsonParser.parseString(json)
                            .getAsJsonArray();

            // Conectar a Mongo
            MongoClient mongoClient =
                    MongoClients.create(
                            "mongodb://localhost:27017"
                    );

            MongoDatabase database =
                    mongoClient.getDatabase("farmacia");

            MongoCollection<Document> ventas =
                    database.getCollection("ventas");

            // Borrar datos viejos
            ventas.drop();

            // Insertar todas las ventas
            for (JsonElement venta : ventasJson) {

                Document documento =
                        Document.parse(
                                venta.toString()
                        );

                ventas.insertOne(documento);
            }

            System.out.println(
                    "Ventas cargadas correctamente."
            );

            System.out.println(
                    "Cantidad cargada: "
                            + ventas.countDocuments()
            );

            mongoClient.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
