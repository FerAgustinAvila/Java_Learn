package org.ferdev.optional.models;

import java.util.Optional;

public class Computer {
    private String nombre;
    private String modelo;
    private Processor processor;

    public Computer(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Optional<Processor> getProcesador() {
        return Optional.ofNullable(processor);
    }

    public void setProcesador(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return nombre + ", " + modelo;
    }
}
