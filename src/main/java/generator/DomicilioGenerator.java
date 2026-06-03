package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Domicilio;

public class DomicilioGenerator {
    private Random rand = new Random();
    private String[] calles = {
            "25 de Mayo", "9 de Julio", "17 de Agosto",
            "Avenida San Martin", "Belgrano", "Sarmiento",
            "Moreno", "Rivadavia", "Mitre", "Yrigoyen"
    };
    private String[] localidades = {
            "San miguel", "San Justo", "San Fernando",
            "Santa Rosa", "San Fernando", "Monte grande",
            "Punta alta"
    };
    private String[] provincias = {
            "Provincia de Buenos Aires", "Chubut", "Misiones",
            "Salta", "Jujuy", "Santiago del Estero"
    };

    public List<Domicilio> generadorDomiciliosAleatorios() {
        List<Domicilio> domiciliosAleatorios = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            domiciliosAleatorios.add(new Domicilio(
                    rand.nextInt(100) + 1,
                    calles[rand.nextInt(calles.length)],
                    localidades[rand.nextInt(localidades.length)],
                    provincias[rand.nextInt(provincias.length)]
            ));
        }
        return domiciliosAleatorios;
    }
}