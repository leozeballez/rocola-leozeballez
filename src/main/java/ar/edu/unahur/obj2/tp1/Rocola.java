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
}
