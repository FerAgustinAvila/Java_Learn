package org.ferdev.optional.repository;

import org.ferdev.optional.models.Computer;
import org.ferdev.optional.models.Maker;
import org.ferdev.optional.models.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer> {
    private List<Computer> dataSource;

    public ComputerRepository() {
        dataSource = new ArrayList<>();
        Processor proc = new Processor("I9-9880H", new Maker("Intel"));
        Computer asus = new Computer("Asus ROG", "Strix G512");
        asus.setProcesador(proc);
        dataSource.add(asus);
        dataSource.add(new Computer("MacBook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computer> filtrar(String nombre) {
        return dataSource.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
        /*for(Computer c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }

}
