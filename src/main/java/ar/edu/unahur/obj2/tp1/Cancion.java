package ar.edu.unahur.obj2.tp1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Cancion {
    String titulo;
    Time duracion;
    String autor;
    List<Disco> discos = new ArrayList<>();

    public Cancion(String titulo, Time duracion, String autor, Disco disco) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.discos.add(disco);
    }

    public void agregarDisco(Disco disco) {
        this.discos.add(disco);
    }
}
