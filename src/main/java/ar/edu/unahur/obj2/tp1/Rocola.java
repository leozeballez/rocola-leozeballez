package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Rocola {
    List<Disco> discos = new ArrayList<>();

    public Rocola(Disco disco) {
        this.discos.add(disco);
    }

    public void agregarDisco(Disco disco) {
        this.discos.add(disco);
    }

    public void sacarDisco(Disco disco) {
        this.discos.remove(disco);
    }

    public List<Cancion> canciones() {
        List<Cancion> canciones = new ArrayList<>();
        this.discos.stream().forEach( d -> {
            d.canciones.stream().forEach( c -> canciones.add(c));
        });
        canciones.stream().sorted();
        return canciones;
    }

    public List<Disco> discos() {
        discos.stream().sorted();
        return discos;
    }
}
