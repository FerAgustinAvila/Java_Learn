package org.ferdev.patterns.decorator2.decorator;

import org.ferdev.patterns.decorator2.Configurable;

public class WithMilkDecorator extends CoffeeDecorator {
    public WithMilkDecorator(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Leche";
    }
}
