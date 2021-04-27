package org.ferdev.oop_interfaces.repository;

import org.ferdev.oop_interfaces.modelo.Client;

import java.util.List;

public interface PageableRepository {

    List<Client> list(int since, int until);
}
