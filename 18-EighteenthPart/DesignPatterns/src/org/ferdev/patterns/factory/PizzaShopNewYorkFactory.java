package org.ferdev.patterns.factory;

import org.ferdev.patterns.factory.product.PizzaNewYorkItalian;
import org.ferdev.patterns.factory.product.PizzaNewYorkPepperoni;
import org.ferdev.patterns.factory.product.PizzaNewYorkVegetarian;

public class PizzaShopNewYorkFactory extends PizzaShopZoneAbstractFactory {
    @Override
    PizzaProduct crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetarian();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItalian();
            default -> null;
        };
    }
}
