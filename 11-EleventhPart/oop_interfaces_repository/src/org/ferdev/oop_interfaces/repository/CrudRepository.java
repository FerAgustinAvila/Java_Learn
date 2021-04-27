package org.ferdev.oop_interfaces.repository;

import org.ferdev.oop_interfaces.modelo.Client;

import java.util.List;

public interface CrudRepository {

    List<Client> list();
    Client getById(Integer id);
    void create(Client client);
    void edit(Client client);
    void delete(Integer id);

}
