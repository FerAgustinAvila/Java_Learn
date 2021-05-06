package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.stream.Stream;

public class Example_FilterSingle_2 {
    public static void main(String[] args) {

        User user = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(4))
                .findFirst().orElseGet(() -> new User("John", "Doe"));

        System.out.println(user);

    }
}
