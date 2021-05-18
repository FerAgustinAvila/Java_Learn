package org.ferdev.appmockito.services;

import org.ferdev.appmockito.models.Exam;
import org.ferdev.appmockito.repositories.IExamRepository;
import org.ferdev.appmockito.repositories.IQuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExamServiceImplTest {

    @Mock
    IExamRepository repository;

    @Mock
    IQuestionRepository IQuestionRepository;

    @InjectMocks
    ExamServiceImpl service;

    @BeforeEach
    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        repository = mock(IExamRepository.class);
//        IQuestionRepository = mock(IQuestionRepository.class);
//        service = new ExamServiceImpl(repository, IQuestionRepository);
    }

    @Test
    void findExamenPorNombre() {

        when(repository.findAll()).thenReturn(Data.EXAMENES);
        Optional<Exam> examen = service.findExamenPorNombre("Matemáticas");

        assertTrue(examen.isPresent());
        assertEquals(5L, examen.orElseThrow().getId());
        assertEquals("Matemáticas", examen.get().getNombre());
    }

    @Test
    void findExamenPorNombreListaVacia() {
        List<Exam> datos = Collections.emptyList();

        when(repository.findAll()).thenReturn(datos);
        Optional<Exam> examen = service.findExamenPorNombre("Matemáticas");

        assertFalse(examen.isPresent());
    }

    @Test
    void testPreguntasExamen() {
        when(repository.findAll()).thenReturn(Data.EXAMENES);
        when(IQuestionRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Data.PREGUNTAS);
        Exam exam = service.findExamenPorNombreConPreguntas("Matemáticas");
        assertEquals(5, exam.getPreguntas().size());
        assertTrue(exam.getPreguntas().contains("integrales"));

    }

    @Test
    void testPreguntasExamenVerify() {
        when(repository.findAll()).thenReturn(Data.EXAMENES);
        when(IQuestionRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Data.PREGUNTAS);
        Exam exam = service.findExamenPorNombreConPreguntas("Matemáticas");
        assertEquals(5, exam.getPreguntas().size());
        assertTrue(exam.getPreguntas().contains("integrales"));
        verify(repository).findAll();
        verify(IQuestionRepository).findPreguntasPorExamenId(anyLong());

    }

    @Test
    void testNoExisteExamenVerify() {
        // given
        when(repository.findAll()).thenReturn(Collections.emptyList());
        when(IQuestionRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Data.PREGUNTAS);

        //when
        Exam exam = service.findExamenPorNombreConPreguntas("Matemáticas");

        //then
        assertNull(exam);
        verify(repository).findAll();
        verify(IQuestionRepository).findPreguntasPorExamenId(5L);
    }

    @Test
    void testGuardarExamen() {
        // Given
        Exam newExam = Data.EXAM;
        newExam.setPreguntas(Data.PREGUNTAS);

        when(repository.guardar(any(Exam.class))).then(new Answer<Exam>(){

            Long secuencia = 8L;

            @Override
            public Exam answer(InvocationOnMock invocation) throws Throwable {
                Exam exam = invocation.getArgument(0);
                exam.setId(secuencia++);
                return exam;
            }
        });

        // When
        Exam exam = service.guardar(newExam);

        // Then
        assertNotNull(exam.getId());
        assertEquals(8L, exam.getId());
        assertEquals("Física", exam.getNombre());

        verify(repository).guardar(any(Exam.class));
        verify(IQuestionRepository).guardarVarias(anyList());
    }
}