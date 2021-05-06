package org.ferdev.patterns.decorator2.decorator;

import org.ferdev.patterns.decorator2.Configurable;

public class WithChocolateDecorator extends CoffeeDecorator {
    public WithChocolateDecorator(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }
}
