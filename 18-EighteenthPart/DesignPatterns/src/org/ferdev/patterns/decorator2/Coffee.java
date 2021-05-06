package org.ferdev.patterns.decorator2;

public class Coffee implements Configurable{
    private float precio;
    private String nombre;

    public Coffee(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }
}
