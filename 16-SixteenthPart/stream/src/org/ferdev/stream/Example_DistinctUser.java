package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.stream.Stream;

public class Example_DistinctUser {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Gomez", "Pato Gomez")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);
    }
}
