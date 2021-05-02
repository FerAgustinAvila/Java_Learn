package org.ferdev.threads.Examples.threads;

public class NameThread extends Thread {
    public NameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("se inicia el método run del hilo " + getName());

        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName());
        }
        System.out.println("finaliza el hilo");
    }
}
