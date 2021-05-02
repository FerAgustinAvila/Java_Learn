package org.ferdev.examples.list;

import org.ferdev.examples.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example_List_Comparable {
    public static void main(String[] args) {

        List<Student> listStu = new ArrayList<>();

        listStu.add(new Student("Juli", 8));
        listStu.add(new Student("Fer", 6));
        listStu.add(new Student("Maxi", 10));
        listStu.add(new Student("Cristian", 2));
        listStu.add(new Student("Maria", 5));
        listStu.add(new Student("Rodri", 9));
        listStu.add(new Student("Ariel", 5));
        listStu.add(new Student("Ariel", 7));

        Collections.sort( listStu );
        System.out.println();
        listStu.forEach(System.out::println);
        System.out.println();

        System.out.println("Ordenado por nombre ASC");
        Collections.sort(listStu, Comparator.comparing(Student::getName));
        listStu.forEach(System.out::println);

        System.out.println();
        System.out.println("Ordenado por nombre DESC");
        listStu.sort((a,b) -> b.getName().compareTo(a.getName()));
        listStu.forEach(System.out::println);

        System.out.println();
        System.out.println("Ordenado por Nota DESC");
        listStu.sort(Comparator.comparing(Student::getQualification).reversed());
        listStu.forEach(System.out::println);


    }

}
