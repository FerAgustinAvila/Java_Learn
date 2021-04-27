package org.ferdev.oop_interfaces.repository;

import org.ferdev.oop_interfaces.modelo.Client;

import java.util.List;

public interface SortableRepository {

    List<Client> list(String field, OrderBy orderBy);

    default int order(Client a, Client b, String field){
        int res = 0;
        switch ( field ){
            // case "id": Java 8
            case "id"->
                    res = a.getId().compareTo(b.getId());
            case "nombre"->
                    res = a.getNombre().compareTo(b.getNombre());
            case "apellido"->
                    res = a.getApellido().compareTo(b.getApellido());
        }
        return res;
    }
}
