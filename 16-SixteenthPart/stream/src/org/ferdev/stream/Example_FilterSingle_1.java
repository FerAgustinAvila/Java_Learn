package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class Example_FilterSingle_1 {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<User> usuario = nombres.findFirst();
        // System.out.println(usuario.orElse(new User("John", "Doe")).getNombre());
        // System.out.println(usuario.orElseGet(() -> new User("John", "Doe")).getNombre());
        if(usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontró el objeto!");
        }
        //nombres.forEach(System.out::println);

    }
}
