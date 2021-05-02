package org.ferdev.examples.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example_TreeSet {
    public static void main(String[] args) {

//        Utilizando los metodos propios
//        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());

//        Forma manual
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("TS String \n" + ts + "\n");

        Set<Integer> numbersTs = new TreeSet<>();
        numbersTs.add(1);
        numbersTs.add(2);
        numbersTs.add(5);
        numbersTs.add(6);
        numbersTs.add(3);
        numbersTs.add(4);
        System.out.println("TS Integer \n" +  numbersTs + "\n");

        Set<Integer> numbersRev = new TreeSet<>(Comparator.reverseOrder());
        numbersRev.add(1);
        numbersRev.add(2);
        numbersRev.add(5);
        numbersRev.add(6);
        numbersRev.add(3);
        numbersRev.add(4);
        System.out.println("TS Integer Reverse \n" +  numbersRev + "\n");
    }
}
