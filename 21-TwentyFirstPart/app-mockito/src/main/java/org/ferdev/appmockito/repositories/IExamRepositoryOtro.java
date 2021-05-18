package org.ferdev.appmockito.repositories;

import org.ferdev.appmockito.models.Exam;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IExamRepositoryOtro implements IExamRepository {
    @Override
    public Exam guardar(Exam exam) {
        return null;
    }

    @Override
    public List<Exam> findAll() {
        try {
            System.out.println("IExamRepositoryOtro");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
