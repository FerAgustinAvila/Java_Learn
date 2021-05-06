package org.ferdev.stream;

import java.util.stream.Stream;

public class Example_FilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Gomez", "Paco Gonzalez", "", "Pepe Mena",
                        "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);

        
    }
}
