package org.ferdev.examples.list;

import org.ferdev.examples.model.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Example_LinkedList {
    public static void main(String[] args) {

        LinkedList<Student> sll = new LinkedList<>();
        sll.add(new Student("Juli", 8));
        sll.add(new Student("Fer", 6));
        sll.add(new Student("Maxi", 10));
        sll.add(new Student("Cristian", 2));
        sll.add(new Student("Gustavo", 4));
        sll.add(new Student("Carlos", 4));

        System.out.println();
        System.out.println("TAMAÑO: " + sll.size());
        sll.forEach(System.out::println);
        System.out.println();

        sll.addFirst(new Student("Zeus", 4));
        sll.addLast(new Student("LastStudent", 4));

        System.out.println();
        System.out.println("TAMAÑO: " + sll.size());
        sll.forEach(System.out::println);
        System.out.println();

        System.out.println("Primer elemento " + sll.getFirst());
        System.out.println("Primer elemento PEEK " + sll.peekFirst());
        System.out.println("Ultimo elemento " + sll.getLast());
        System.out.println("Ultimo elemento PEEK " + sll.peekLast());
        System.out.println("Indice 2 " + sll.get(2));


        // List Iterator
        System.out.println();
        ListIterator<Student> li = sll.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println();
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }


    }

}
