package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example_Filter {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        List<User> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

    }
}
