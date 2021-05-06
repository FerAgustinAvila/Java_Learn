package org.ferdev.optional;

import org.ferdev.optional.models.Computer;
import org.ferdev.optional.models.Maker;
import org.ferdev.optional.models.Processor;
import org.ferdev.optional.repository.ComputerRepository;
import org.ferdev.optional.repository.Repository;

public class Example_Repository_MapFilter {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        String f = repository.filtrar("asus")
                .flatMap(Computer::getProcesador)
                .flatMap(Processor::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Maker::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }

}
