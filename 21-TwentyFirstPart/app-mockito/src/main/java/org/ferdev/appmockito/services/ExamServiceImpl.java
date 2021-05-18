package org.ferdev.appmockito.services;

import org.ferdev.appmockito.models.Exam;
import org.ferdev.appmockito.repositories.IExamRepository;
import org.ferdev.appmockito.repositories.IQuestionRepository;

import java.util.List;
import java.util.Optional;

public class ExamServiceImpl implements IExamService {
    private IExamRepository IExamRepository;
    private IQuestionRepository IQuestionRepository;

    public ExamServiceImpl(IExamRepository IExamRepository, IQuestionRepository IQuestionRepository) {
        this.IExamRepository = IExamRepository;
        this.IQuestionRepository = IQuestionRepository;
    }

    @Override
    public Optional<Exam> findExamenPorNombre(String nombre) {
        return IExamRepository.findAll()
                .stream()
                .filter(e -> e.getNombre().contains(nombre))
                .findFirst();
    }

    @Override
    public Exam findExamenPorNombreConPreguntas(String nombre) {
        Optional<Exam> examenOptional = findExamenPorNombre(nombre);
        Exam exam = null;
        if (examenOptional.isPresent()) {
            exam = examenOptional.orElseThrow();
            List<String> preguntas = IQuestionRepository.findPreguntasPorExamenId(exam.getId());
            exam.setPreguntas(preguntas);
        }
        return exam;
    }

    @Override
    public Exam guardar(Exam exam) {
        if(!exam.getPreguntas().isEmpty()){
            IQuestionRepository.guardarVarias(exam.getPreguntas());
        }
        return IExamRepository.guardar(exam);
    }
}
