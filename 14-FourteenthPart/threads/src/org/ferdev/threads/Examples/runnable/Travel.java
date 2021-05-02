package org.ferdev.threads.Examples.runnable;

public class Travel implements Runnable{
    private String nombre;

    public Travel(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for(int i=0; i < 10; i++){
            System.out.println(i + " - " + nombre);
            try {
                Thread.sleep( (long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalmente me voy de viaje a: " + nombre);

    }
}
