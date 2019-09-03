package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    String nombre;
    List<Disco> discos;

    public Artista(String nombre) {
        this.nombre = nombre;
        this.discos = new ArrayList<>();
    }
}
