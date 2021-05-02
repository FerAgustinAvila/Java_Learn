package org.ferdev.examples.set;

import org.ferdev.examples.model.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example_TreeSet_Comparable {
    public static void main(String[] args) {

        // Si la clase Student no implementa metodo Comparable daria error si fuese TreeSet. Con ashMap no daria el error

        // Forma ascendente
//        Set<Student> ss = new TreeSet<>(Comparator.comparing(Student::getName));

//        Forma descendente
        Set<Student> ss = new TreeSet<>((a, b) -> b.getName().compareTo(a.getName()));
//        Set<Student> ss = new TreeSet<>();
        ss.add(new Student("Juli", 8));
        ss.add(new Student("Fer", 6));
        ss.add(new Student("Maxi", 10));
        ss.add(new Student("Cristian", 2));
        ss.add(new Student("Maria", 5));
        ss.add(new Student("Rodri", 9));
        ss.add(new Student("Ariel", 5));
        ss.add(new Student("Ariel", 7));

        System.out.println( ss );

        System.out.println();
        ss.forEach(System.out::println);
    }
}
