package org.ferdev.stream;

import java.util.stream.Stream;

public class Example_ReduceInt {
    public static void main(String[] args) {

        Stream<Integer> nombres =  Stream.of(5, 10, 15, 20);
        
        int resultado = nombres.reduce(0, Integer::sum);
        System.out.println(resultado);



    }
}
