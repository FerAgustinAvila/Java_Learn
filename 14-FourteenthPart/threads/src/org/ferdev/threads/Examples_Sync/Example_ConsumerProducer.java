package org.ferdev.threads.Examples_Sync;

import org.ferdev.threads.Examples_Sync.runnable.Baker;
import org.ferdev.threads.Examples_Sync.runnable.Consumer;

public class Example_ConsumerProducer {
    public static void main(String[] args) {
        Bakery p = new Bakery();
        new Thread(new Baker(p)).start();
        new Thread(new Consumer(p)).start();
    }
}
