package org.ferdev.overload;

import static org.ferdev.overload.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int : " + sumar( 10, 5));
        System.out.println("sumar float : " + sumar( 2.5F, 5F));
        System.out.println("sumar float-int : " + sumar( 2.5F, 8));
        System.out.println("sumar int-float : " + sumar( 23, 1f));



        System.out.println("sumar 5 int : " + sumar( 23, 1, 3, 6, 2));
        System.out.println("sumar float + n int : " + sumar( 4F, 1, 3, 6, 2, 10));
    }
}
