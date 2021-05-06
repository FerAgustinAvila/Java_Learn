package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.stream.Stream;

public class Example_FilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);
    }
}
