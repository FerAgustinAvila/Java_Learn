package org.ferdev.appmockito.services;

import org.ferdev.appmockito.models.Exam;

import java.util.Optional;

public interface IExamService {
    Optional<Exam> findExamenPorNombre(String nombre);

    Exam findExamenPorNombreConPreguntas(String nombre);

    Exam guardar(Exam exam);
}
