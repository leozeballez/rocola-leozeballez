package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Disco {
    String titulo;
    String autor;
    String genero;
    List<Cancion> canciones;

    public Disco(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.canciones = new ArrayList<>();
    }
}
