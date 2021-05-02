package org.ferdev.threads.Examples_Sync.runnable;

import org.ferdev.threads.Examples_Sync.Bakery;

import java.util.concurrent.ThreadLocalRandom;

public class Baker implements Runnable{
    private Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            bakery.hornear("Pan nº: " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
