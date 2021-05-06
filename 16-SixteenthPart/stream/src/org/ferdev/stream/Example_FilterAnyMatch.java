package org.ferdev.stream;

import org.ferdev.stream.models.User;

import java.util.stream.Stream;

public class Example_FilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream
                .of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(1));

        System.out.println(existe);

        /*List<User> lista = Arrays.asList(new User("Pato", "Gomez"),
                new User("Paco", "Gonzalez"),
                new User("Pepa", "Gutierrez"),
                new User("Pepe", "Mena"),
                new User("Pepe", "Garcia"));

        boolean resultado = false;
        for(User u: lista){
            if(u.getId().equals(3)){
                resultado = true;
                break;
            }
        }

        System.out.println(resultado);

         */
    }
}
