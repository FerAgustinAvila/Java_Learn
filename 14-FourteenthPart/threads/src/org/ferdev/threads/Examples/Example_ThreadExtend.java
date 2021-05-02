package org.ferdev.threads.Examples;

import org.ferdev.threads.Examples.threads.NameThread;

public class Example_ThreadExtend {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NameThread("Jhon Doe");
        hilo.start();
        // Thread.sleep(2);
        Thread hilo2 = new NameThread("Maria");
        hilo2.start();

        NameThread hilo3 = new NameThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
