package org.ferdev.patterns.factory;

import org.ferdev.patterns.factory.product.PizzaCaliforniaPepperoni;
import org.ferdev.patterns.factory.product.PizzaCaliforniaCheese;
import org.ferdev.patterns.factory.product.PizzaCaliforniaVegetarian;

public class PizzaShopCaliforniaFactory extends PizzaShopZoneAbstractFactory {
    @Override
    PizzaProduct crearPizza(String tipo) {
        PizzaProduct producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaCheese();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetarian();
                break;
        }
        return producto;
    }
}
