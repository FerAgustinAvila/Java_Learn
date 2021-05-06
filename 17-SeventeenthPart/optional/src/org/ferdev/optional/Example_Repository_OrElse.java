package org.ferdev.optional;

import org.ferdev.optional.models.Computer;
import org.ferdev.optional.repository.ComputerRepository;
import org.ferdev.optional.repository.Repository;

public class Example_Repository_OrElse {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        // Computer defecto = new Computer("HP Omen", "LA0001");

        Computer pc = repository.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repository.filtrar("macbook pro").orElseGet(Example_Repository_OrElse::valorDefecto);
        System.out.println(pc);

    }

    public static Computer valorDefecto(){
        System.out.println("Obteniendo valor por defecto!!!");
        return new Computer("HP Omen", "LA0001");
    }
}
