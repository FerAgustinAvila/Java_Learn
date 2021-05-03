package org.ferdev.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example_Function {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String resultado = f1.apply("agustin");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("agustin"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("agustin", "david");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo;// (a, b) -> a.compareTo(b);
        System.out.println(f4.apply("agustin", "agustin"));

        BiFunction<String, String, String> f5 = String::concat;// (a, b) -> a.concat(b);
        System.out.println(f5.apply("agustin", "jose"));
    }
}
