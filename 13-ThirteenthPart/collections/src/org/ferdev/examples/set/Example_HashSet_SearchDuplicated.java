package org.ferdev.examples.set;

import java.util.HashSet;
import java.util.Set;

public class Example_HashSet_SearchDuplicated {
    public static void main(String[] args) {

        String[] fishes = {"Carpa", "Carpa", "Pejerrey", "Mojarra", "Trucha", "Bagre"};

        Set<String> unique = new HashSet<>();
        for (String fish: fishes){
            if(!unique.add(fish)){
                System.out.println("Elemento duplicado: " + fish);
            }
        }
        System.out.println( unique.size() + " elementos no duplicados: " + unique );
    }
}
