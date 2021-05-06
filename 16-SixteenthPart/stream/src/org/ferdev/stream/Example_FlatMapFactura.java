package org.ferdev.stream;

import org.ferdev.stream.models.Ticket;
import org.ferdev.stream.models.User;

import java.util.Arrays;
import java.util.List;

public class Example_FlatMapFactura {
    public static void main(String[] args) {

        User u1 = new User("John", "Doe");
        User u2 = new User("Pepe", "Pérez");

        u1.addFactura(new Ticket("compras tecnologías"));
        u1.addFactura(new Ticket("compras muebles"));

        u2.addFactura(new Ticket("bicicleta"));
        u2.addFactura(new Ticket("notebook gamer"));

        List<User> users = Arrays.asList(u1, u2);
        users.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                .concat(f.getUsuario().toString())));

        /*for(User u: users){
            for(Ticket f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
