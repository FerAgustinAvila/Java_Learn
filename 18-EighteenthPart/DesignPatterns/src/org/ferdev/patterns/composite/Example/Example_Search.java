package org.ferdev.patterns.composite.Example;

import org.ferdev.patterns.composite.File;
import org.ferdev.patterns.composite.Directory;

public class Example_Search {
    public static void main(String[] args) {

        Directory doc = new Directory("Documentos");
        Directory java = new Directory("Java");

        java.addComponente(new File("patron-composite.docx"));
        Directory stream = new Directory("Api Stream");
        stream.addComponente(new File("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new File("cv.docx"));
        doc.addComponente(new File("logo.jpeg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado \"patron-composite.docx\": " + encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println("Encontrado Api Stream: " + encontrado);

        encontrado = doc.buscar("cv.docx");
        System.out.println("Encontrado cv.docx: "+ encontrado);
    }
}
