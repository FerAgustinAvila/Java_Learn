package org.ferdev.examples.set;

import java.util.HashSet;
import java.util.Set;

public class Example_HashSet_SearchDuplicated_Two {
    public static void main(String[] args) {

        String[] fishes = {"Carpa", "Carpa", "Pejerrey", "Mojarra", "Trucha", "Bagre"};

        Set<String> unique = new HashSet<>();
        Set<String> duplicated = new HashSet<>();
        for (String fish: fishes){
            if(!unique.add(fish)){
                duplicated.add(fish);
            }
        }
        unique.removeAll( duplicated );
        System.out.println( "Unicos: " + unique );
        System.out.println( "Duplicados: " + duplicated );
    }
}
