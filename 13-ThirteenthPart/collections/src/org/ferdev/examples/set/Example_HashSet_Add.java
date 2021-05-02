package org.ferdev.examples.set;

import java.util.*;

public class Example_HashSet_Add {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("Quinto");
        hs.add("Primero");
        hs.add("Segundo");
        hs.add("Cuarto");
        hs.add("Tercero");
        System.out.println( hs );

        hs.add("Tercero");
        boolean b = hs.add("Tercero");
        System.out.println( hs );
        System.out.println("Permite elementos duplicados = " + b );

        System.out.println("=========== Para ordenar ============");
        List<String> list = new ArrayList<>( hs );
        Collections.sort( list );
        System.out.println( list );

    }
}
