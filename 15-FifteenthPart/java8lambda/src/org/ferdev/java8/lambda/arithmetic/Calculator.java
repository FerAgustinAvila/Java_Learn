package org.ferdev.java8.lambda.arithmetic;

import java.util.function.BiFunction;

public class Calculator {

    public double computar(double a, double b, Arithmetic lambda){
        return lambda.operacion(a, b);
    }

    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a, b);
    }
}
