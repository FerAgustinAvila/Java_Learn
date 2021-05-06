package org.ferdev.patterns.decorator2.decorator;

import org.ferdev.patterns.decorator2.Configurable;

public class WhitCreamDecorator extends CoffeeDecorator {
    public WhitCreamDecorator(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Crema";
    }
}
