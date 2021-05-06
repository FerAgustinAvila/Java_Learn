package org.ferdev.patterns.factory.example;

import org.ferdev.patterns.factory.PizzaProduct;
import org.ferdev.patterns.factory.PizzaShopCaliforniaFactory;
import org.ferdev.patterns.factory.PizzaShopNewYorkFactory;
import org.ferdev.patterns.factory.PizzaShopZoneAbstractFactory;

public class ExampleFactory {
    public static void main(String[] args) {
        PizzaShopZoneAbstractFactory ny = new PizzaShopNewYorkFactory();
        PizzaShopZoneAbstractFactory california = new PizzaShopCaliforniaFactory();
        
        PizzaProduct pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());
        
        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());
        
        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
