package org.ferdev.oop_interfaces.repository;

import org.ferdev.oop_interfaces.modelo.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientListRepository implements CrudRepository, SortableRepository, PageableRepository{

    private List<Client> datasource;

    public ClientListRepository() {
        this.datasource = new ArrayList<>();
    }
    
    @Override
    public List<Client> list() {
        return datasource;
    }

    @Override
    public Client getById(Integer id) {
        Client res = null;
        for (Client cli : datasource ) {
            if ( cli.getId()!= null && cli.getId().equals( id )){
                res = cli;
                break;
            }
        }
        return res;
    }

    @Override
    public void create(Client client) {
        this.datasource.add( client );
    }

    @Override
    public void edit(Client client) {
        Client res = this.getById( client.getId() );
        res.setNombre( client.getNombre() );
        res.setApellido( client.getApellido() );


//      this.datasource.set( datasource.indexOf(client), client);
    }

    @Override
    public void delete(Integer id) {
        this.datasource.remove( this.getById( id ) );
    }

    @Override
    public List<Client> list(int since, int until) {
        return datasource.subList(since, until);
    }

    @Override
    public List<Client> list(String field, OrderBy orderBy) {
        List<Client> orderedList = new ArrayList<>(
                this.datasource
        );
//        orderedList.sort(new Comparator<Client>() {
//            @Override
//            public int compare(Client a, Client b) {
//                int result = 0;
//                if( orderBy == OrderBy.ASC){
//                    result = this.order(a, b);
//                } else if( orderBy == OrderBy.DESC){
//                    result = this.order(b, a);
//                }
//                return result;
//            }
//
//            private int order(Client a, Client b){
//                int res = 0;
//                switch ( field ){
//                    // case "id": Java 8
//                    case "id"->
//                            res = a.getId().compareTo(b.getId());
//                    case "nombre"->
//                            res = a.getNombre().compareTo(b.getNombre());
//                    case "apellido"->
//                            res = a.getApellido().compareTo(b.getApellido());
//                }
//                return res;
//            }
//        });


//        Expresion lambda
        orderedList.sort(( a, b) ->{
                int result = 0;
                if( orderBy == OrderBy.ASC){
                    result = order(a, b, field);
                } else if( orderBy == OrderBy.DESC){
                    result = order(a, b, field);
                }
                return result;
            });

//        Expresion lambda
//        orderedList.sort(( a, b) ->{
//                int res = 0;
//                if( orderBy == OrderBy.ASC){
//                    switch ( field ){
//                        // case "id": Java 8
//                        case "id"->
//                                res = a.getId().compareTo(b.getId());
//                        case "nombre"->
//                                res = a.getNombre().compareTo(b.getNombre());
//                        case "apellido"->
//                                res = a.getApellido().compareTo(b.getApellido());
//                    }
//                } else if( orderBy == OrderBy.DESC){
//                    switch ( field ){
//                        // case "id": Java 8
//                        case "id"->
//                                res = b.getId().compareTo(a.getId());
//                        case "nombre"->
//                                res = b.getNombre().compareTo(a.getNombre());
//                        case "apellido"->
//                                res = b.getApellido().compareTo(a.getApellido());
//                    }
//                }
//                return res;
//            });

        return orderedList;
    }

//    public static int order(Client a, Client b, String field){
//        int res = 0;
//        switch ( field ){
//            // case "id": Java 8
//            case "id"->
//                    res = a.getId().compareTo(b.getId());
//            case "nombre"->
//                    res = a.getNombre().compareTo(b.getNombre());
//            case "apellido"->
//                    res = a.getApellido().compareTo(b.getApellido());
//        }
//        return res;
//    }
}
