package org.ferdev.jdbc.repository;

import java.util.List;

public interface Repository<T> {

    List<T> list();

    T byId(Long id);

    void create(T t);

    void delete(Long id);
}
