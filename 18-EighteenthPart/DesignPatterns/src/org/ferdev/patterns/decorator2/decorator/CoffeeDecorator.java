package org.ferdev.patterns.decorator2.decorator;

import org.ferdev.patterns.decorator2.Configurable;

abstract public class CoffeeDecorator implements Configurable {
    protected Configurable cafe;

    public CoffeeDecorator(Configurable cafe) {
        this.cafe = cafe;
    }
}
