package org.ferdev.threads.Examples.runnable;

import static org.ferdev.threads.Examples.Example_ThreadSync.imprimirFrases;

public class PrintPhrases implements Runnable {
    private String frase1, frase2;

    public PrintPhrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1, this.frase2);
    }
}
