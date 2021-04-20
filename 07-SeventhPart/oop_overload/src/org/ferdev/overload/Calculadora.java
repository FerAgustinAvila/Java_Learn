package org.ferdev.overload;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

    public static float sumar(int a, float b){
        return a + b;
    }

    public static float sumar(float a, int b){
        return a + b;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch ( NumberFormatException e ){
            resultado = 0;
        }
        return resultado;
    }

    public static int sumar( int x, int y, int z){
        return x + y + z;
    }


    public static int sumar(int... args){
        int total = 0;
        for(int i : args){
            total += i;
        }
        return total;
    }

    public static float sumar(float a, int... args){
        float total = 0;
        for(int i : args){
            total += i;
        }
        return total;
    }
}
