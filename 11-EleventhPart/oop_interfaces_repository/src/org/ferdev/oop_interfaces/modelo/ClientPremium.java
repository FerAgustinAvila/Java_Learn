package org.ferdev.oop_interfaces.modelo;

// For generic example
public class ClientPremium extends Client implements Comparable<ClientPremium>{
    public ClientPremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientPremium o) {
        return 0;
    }
}
