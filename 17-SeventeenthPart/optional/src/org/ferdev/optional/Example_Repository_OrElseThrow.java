package org.ferdev.optional;

import org.ferdev.optional.models.Computer;
import org.ferdev.optional.repository.ComputerRepository;
import org.ferdev.optional.repository.Repository;

import java.util.Optional;

public class Example_Repository_OrElseThrow {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        Computer pc = repository.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);


    }
}
