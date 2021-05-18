package org.ferdev.appmockito.repositories;

import java.util.List;

public interface IQuestionRepository {
    List<String> findPreguntasPorExamenId(Long id);

    void guardarVarias(List<String> preguntas);
}
