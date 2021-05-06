package org.ferdev.patterns.singleton;

public class ConnectionDBSingleton {

    private static ConnectionDBSingleton instancia;

    private ConnectionDBSingleton(){
        System.out.println("Conectandose algún motor de base de datos");
    }

    public static ConnectionDBSingleton getInstancia(){
        if(instancia == null){
            instancia = new ConnectionDBSingleton();
        }
        return instancia;
    }

}
