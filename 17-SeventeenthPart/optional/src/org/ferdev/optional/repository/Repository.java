package org.ferdev.optional.repository;

import org.ferdev.optional.models.Computer;

import java.util.Optional;

public interface Repository<T> {

    Optional<Computer> filtrar(String nombre);

}
