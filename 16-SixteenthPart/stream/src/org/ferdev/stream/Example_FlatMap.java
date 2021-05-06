package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.stream.Stream;

public class Example_FlatMap {
    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        // nombres.forEach(System.out::println);
        System.out.println(nombres.count());

    }
}
