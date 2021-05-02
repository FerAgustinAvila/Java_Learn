package org.ferdev.examples.list;

import org.ferdev.examples.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example_List_Methods {
    public static void main(String[] args) {

        List<Student> listStu = new ArrayList<>();

        System.out.println("Size = " + listStu.size());
        System.out.println("Esta vacia? " + listStu.isEmpty());
        listStu.add(new Student("Juli", 8));
        listStu.add(new Student("Fer", 6));
        listStu.add(new Student("Maxi", 10));
        listStu.add(new Student("Cristian", 2));
        listStu.add(2, new Student("Gustavo", 4));
        listStu.set(3, new Student("Carlos", 4));

        System.out.println();
        listStu.forEach(System.out::println);
        System.out.println();
        System.out.println("Size = " + listStu.size());

        listStu.remove(new Student("Juli", 8));
        System.out.println();
        listStu.forEach(System.out::println);

        listStu.remove(2);
        System.out.println();
        listStu.forEach(System.out::println);

        System.out.println();
        boolean b = listStu.contains(new Student("Cristian", 2));
        System.out.println(b);

        System.out.println();
        Object a[] = listStu.toArray();
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
