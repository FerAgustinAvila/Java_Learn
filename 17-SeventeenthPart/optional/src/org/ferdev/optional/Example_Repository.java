package org.ferdev.optional;

import org.ferdev.optional.models.Computer;
import org.ferdev.optional.repository.ComputerRepository;
import org.ferdev.optional.repository.Repository;

public class Example_Repository {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        repository.filtrar("rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));

        //Optional<Computer> pc = repository.filtrar("asus rog");

        /*if(pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/
    }
}
