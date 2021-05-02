package org.ferdev.threads.Examples_Sync.runnable;

import org.ferdev.threads.Examples_Sync.Bakery;

public class Consumer implements Runnable{
    private Bakery bakery;

    public Consumer(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10; i++){
            bakery.consumir();
        }
    }
}
