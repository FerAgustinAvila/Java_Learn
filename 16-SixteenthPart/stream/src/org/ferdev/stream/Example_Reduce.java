package org.ferdev.stream;

import java.util.stream.Stream;

public class Example_Reduce {
    public static void main(String[] args) {

        Stream<String> nombres =  Stream.of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();
        
        String resultado = nombres.reduce("resultado concatenación ", (a, b) -> a+ " # " + b);
        System.out.println(resultado);



    }
}
