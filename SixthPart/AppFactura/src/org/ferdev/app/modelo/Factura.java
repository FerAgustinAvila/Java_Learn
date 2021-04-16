package org.ferdev.app.modelo;

import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItem;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public ItemFactura[] getItem() {
        return items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItem < MAX_ITEMS) {
            this.items[indiceItem++] = item;
        }

    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nCliente: ").append(this.cliente.getNombre())
                .append("\nNIF: ").append(this.cliente.getNif())
                .append("\nDescripcion: ").append(this.descripcion)
                .append("n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        return sb.toString();
    }
}
