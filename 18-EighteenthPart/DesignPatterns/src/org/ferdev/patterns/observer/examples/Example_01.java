package org.ferdev.patterns.observer.examples;

import org.ferdev.patterns.observer.Corporation;

public class Example_01 {
    public static void main(String[] args) {
        Corporation google = new Corporation("Google", 1000);
        google.addObserver( (observable, obj) -> {
            System.out.println("John: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andrés: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria: " + observable );
        });
        google.modificaPrecio(2000);
    }
}
