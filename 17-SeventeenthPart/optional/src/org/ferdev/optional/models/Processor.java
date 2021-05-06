package org.ferdev.optional.models;

import java.util.Optional;

public class Processor {
    private String nombre;
    private Maker maker;

    public Processor(String nombre, Maker maker) {
        this.nombre = nombre;
        this.maker = maker;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Optional<Maker> getFabricante() {
        return Optional.ofNullable(maker);
    }

    public void setFabricante(Maker maker) {
        this.maker = maker;
    }
}
