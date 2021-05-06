package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example_DistinctUserSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Gomez", "Pato Gomez")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt( u -> u.toString().length())
                .peek(System.out::println);

        //largoNombres.forEach(System.out::println);
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("total: " + stats.getSum());
        System.out.println("max: " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("promedio :" + stats.getAverage());
    }
}
