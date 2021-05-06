package org.ferdev.patterns.decorator2;

import org.ferdev.patterns.decorator2.decorator.WithChocolateDecorator;
import org.ferdev.patterns.decorator2.decorator.WhitCreamDecorator;
import org.ferdev.patterns.decorator2.decorator.WithMilkDecorator;

public class Example_Coffee {
    public static void main(String[] args) {
        Configurable cafe = new Coffee("Coffee Mocha", 7);
        WhitCreamDecorator conCrema = new WhitCreamDecorator(cafe);
        WithMilkDecorator conLeche = new WithMilkDecorator(conCrema);
        WithChocolateDecorator conChoco = new WithChocolateDecorator(conLeche);

        System.out.println("El precio del cafe moca es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        Configurable capuchino = new Coffee("Coffee Capuchino", 4);
        conCrema = new WhitCreamDecorator(capuchino);
        conLeche = new WithMilkDecorator(conCrema);
        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los Ingredientes " + conLeche.getIngredientes());

        Configurable espresso = new Coffee("Coffee Espresso", 3);
        System.out.println("El precio del cafe Espresso es " + espresso.getPrecioBase());
        System.out.println("Los ingredientes del cafe Espresso es: " + espresso.getIngredientes());

    }
}
