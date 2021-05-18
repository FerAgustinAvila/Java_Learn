package org.ferdev.appmockito.repositories;

import org.ferdev.appmockito.models.Exam;

import java.util.List;

public interface IExamRepository {
    Exam guardar(Exam exam);
    List<Exam> findAll();
}
