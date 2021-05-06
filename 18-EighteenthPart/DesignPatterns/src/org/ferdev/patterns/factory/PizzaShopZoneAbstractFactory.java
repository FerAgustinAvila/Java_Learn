package org.ferdev.patterns.factory;

abstract public class PizzaShopZoneAbstractFactory {

    public PizzaProduct ordenarPizza(String tipo){
        PizzaProduct pizza = crearPizza(tipo);
        System.out.println("------Fabricando la pizza " + pizza.getNombre() + "------" );
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProduct crearPizza(String tipo);
}
