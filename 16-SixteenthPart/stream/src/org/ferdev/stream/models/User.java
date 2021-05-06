package org.ferdev.stream.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimoId;

    private List<Ticket> tickets;

    public User(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId;
        this.tickets = new ArrayList<>();
    }

    public List<Ticket> getFacturas() {
        return tickets;
    }

    public void addFactura(Ticket ticket) {
        this.tickets.add(ticket);
        ticket.setUsuario(this);
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
        return nombre + " " + apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nombre, user.nombre) &&
                Objects.equals(apellido, user.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
