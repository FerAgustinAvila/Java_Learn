package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example_ListToStream {
    public static void main(String[] args) {

        List<User> lista = new ArrayList<>();
        lista.add(new User("Fernando", "Guzmán"));
        lista.add(new User("Luci", "Martínez"));
        lista.add(new User("Pepe", "Fernández"));
        lista.add(new User("Cata", "Pérez"));
        lista.add(new User("Lalo", "Mena"));
        lista.add(new User("Exequiel", "Doe"));
        lista.add(new User("Bruce", "Lee"));
        lista.add(new User("Bruce", "Willis"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());
    }
}
