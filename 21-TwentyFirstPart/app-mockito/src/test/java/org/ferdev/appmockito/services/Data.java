package org.ferdev.appmockito.services;

import org.ferdev.appmockito.models.Exam;

import java.util.Arrays;
import java.util.List;

public class Data {
    public final static List<Exam> EXAMENES = Arrays.asList(new Exam(5L, "Matemáticas"),
            new Exam(6L, "Lenguaje"),
            new Exam(7L, "Historia"));

    public final static List<String> PREGUNTAS = Arrays.asList("aritmética","integrales",
            "derivadas", "trigonometría", "geometría");
    public final static Exam EXAM = new Exam(null, "Física");
}
