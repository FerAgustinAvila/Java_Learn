package org.ferdev.patterns.composite.Example;

import org.ferdev.patterns.composite.File;
import org.ferdev.patterns.composite.Directory;

public class Example {
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

        System.out.println(doc.mostrar(0));
    }
}
