package org.ferdev.threads.Examples;

import org.ferdev.threads.Examples.runnable.Travel;

public class Example_InterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new Travel("Isla de Pascua")).start();
        new Thread(new Travel("Robinson Crusoe")).start();
        new Thread(new Travel("Juan Fernandez")).start();
        new Thread(new Travel("Isla de Chiloe")).start();
    }
}
