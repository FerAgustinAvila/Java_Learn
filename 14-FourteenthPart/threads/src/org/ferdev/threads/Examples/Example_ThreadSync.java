package org.ferdev.threads.Examples;

import org.ferdev.threads.Examples.runnable.PrintPhrases;

public class Example_ThreadSync {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new PrintPhrases("Hola ", "que tal!")).start();
        new Thread(new PrintPhrases("¿Quién eres ", "tú?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new PrintPhrases("Muchas ", "gracias amigo!"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());

    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frase2);
    }
}
