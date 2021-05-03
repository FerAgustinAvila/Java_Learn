package org.ferdev.java8.lambda;

import org.ferdev.java8.lambda.models.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example_Consumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");

        consumidorBi.accept("pepe", 20);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("francisco", "pepe", "luz", "paco");
        nombres.forEach(consumidor2);

        Supplier<User> creaUsuario = User::new;
        User user = creaUsuario.get();

        BiConsumer<User, String> asignarNombre = User::setNombre;
        asignarNombre.accept(user, "Fer");
        System.out.println("Nombre user: " + user.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";

        System.out.println(proveedor.get());
    }
}
