package main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import generator.DomicilioGenerator;

public class Main {
    public static void main(String[] args) {
        DomicilioGenerator dG = new DomicilioGenerator();

        Gson gson = new Gson();
        try (FileWriter fW = new FileWriter("prueba.json")) {
            gson.toJson(dG.generadorDomiciliosAleatorios(), fW);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
