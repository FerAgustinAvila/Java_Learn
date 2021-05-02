package org.ferdev.threads.Examples_Sync;

import java.util.concurrent.ThreadLocalRandom;

public class Example_ConsumerProducerJava8 {
    public static void main(String[] args) {
        Bakery p = new Bakery();

        new Thread( () -> {
            for(int i = 0; i < 10; i++){
                p.hornear("Pan nº: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread( () -> {
            for(int i = 0 ; i < 10; i++){
                p.consumir();
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
