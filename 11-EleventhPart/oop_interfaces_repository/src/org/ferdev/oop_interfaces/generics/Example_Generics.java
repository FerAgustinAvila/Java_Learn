package org.ferdev.oop_interfaces.generics;

import org.ferdev.oop_interfaces.modelo.Client;
import org.ferdev.oop_interfaces.modelo.ClientPremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_Generics {
    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Marcelo", "Cejas"));

//        Client marcelo = (Client) clients.get(0);
        Client marcelo = clients.iterator().next();

        Client[] clientesArray = {
                new Client("Seba", "Gonzalez"),
                new Client("Flor", "Mariani")
        };

        Integer[] ints = {1, 2, 3};

        List<Client> clients2 = fromArrayToList( clientesArray );
        System.out.println( clients2 );
        clients2.forEach(System.out::println);
        System.out.println();

        List<Integer> ints2 = fromArrayToList( ints );
        System.out.println( ints2 );
        ints2.forEach(System.out::println);
        System.out.println();

        List< String > names = fromArrayToList( new String[]{"Fernando", "Agustin", "Juan", "Cruz"}, ints);
        names.forEach(System.out::println);

        System.out.println("========== Ejemplo de metodos Genericos ==========");

        List<ClientPremium> clientPremiums = fromArrayToList(
                new ClientPremium[]{
                        new ClientPremium("Francisco", "Gomez"),
                        new ClientPremium("Herminia", "Sanchez")
                }
        );

        printClients( clientPremiums );
    }

    public static <T> List<T> fromArrayToList( T[] c){
        return Arrays.asList( c );
    }

    public static <T extends Number> List<T> fromArrayToList( T[] c){
        return Arrays.asList( c );
    }

    public static <T extends Client & Comparable<T>> List<T> fromArrayToList( T[] c){
        return Arrays.asList( c );
    }

    public static <T, G> List<T> fromArrayToList( T[] c, G[] x){
        for (G element: x){
            System.out.println( element );
        }
        return Arrays.asList( c );
    }

    public static void printClients( List<? extends Client> clients){
        clients.forEach(System.out::println);
    }
}
