package org.ferdev.optional.models;

public class Maker {
    private String nombre;

    public Maker(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
