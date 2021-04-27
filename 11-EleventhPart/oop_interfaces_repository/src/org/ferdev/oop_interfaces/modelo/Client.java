package org.ferdev.oop_interfaces.modelo;

import java.util.Objects;

public class Client {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Client() {
        this.id = ++ultimoId;
    }

    public Client(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        String sb =  "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
        return sb.replaceAll("\'", "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
