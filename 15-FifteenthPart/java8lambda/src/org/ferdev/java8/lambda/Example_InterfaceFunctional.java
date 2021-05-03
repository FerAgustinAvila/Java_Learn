package org.ferdev.java8.lambda;

import org.ferdev.java8.lambda.arithmetic.Arithmetic;
import org.ferdev.java8.lambda.arithmetic.Calculator;

public class Example_InterfaceFunctional {
    public static void main(String[] args) {

        Arithmetic suma = Double::sum;
        Arithmetic resta = (a, b) -> a - b;

        Calculator cal = new Calculator();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, (a ,b) -> a * b));

        System.out.println(cal.computarConBiFunction(10, 5, (a, b) -> a+b));
    }
}
