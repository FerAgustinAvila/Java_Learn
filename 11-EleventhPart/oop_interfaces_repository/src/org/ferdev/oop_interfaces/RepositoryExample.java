package org.ferdev.oop_interfaces;

import org.ferdev.oop_interfaces.modelo.Client;
import org.ferdev.oop_interfaces.repository.*;

import java.util.List;

public class RepositoryExample {
    public static void main(String[] args) {

        CrudRepository repo = new ClientListRepository();
        repo.create(new Client("Glady", "Gomez"));
        repo.create(new Client("Ross", "Torres"));
        repo.create(new Client("Fernando", "Avila"));
        repo.create(new Client("Pichi", "Gomez"));

        List<Client> clients = repo.list();
//        clients.forEach( c -> System.out.println(c));
//        Mismo pero mas abreviado
        clients.forEach( System.out::println );

        System.out.println("\n===== Paginar =====\n");
        List<Client> pageable = ((PageableRepository ) repo).list(1, 3);
        pageable.forEach( System.out::println );

        System.out.println("\n===== Ordenar =====\n");
        List<Client> orderAsc = ((SortableRepository ) repo).list("apellido", OrderBy.ASC);
//        order.forEach( System.out::println );
        for (Client c : orderAsc) {
            System.out.println( c );
        }

        System.out.println("\n===== Editar =====\n");
        Client pichiUpdate = new Client("Pichi", "Avila");
        pichiUpdate.setId( 4 );
        repo.edit( pichiUpdate );
        Client pichi = repo.getById( 4 );
        System.out.println( pichi );

        System.out.println();
        ((SortableRepository ) repo).list("id", OrderBy.ASC)
                .forEach (System.out::println);

        System.out.println("\n===== Eliminar =====\n");
        repo.delete( 3 );
        repo.list().forEach(System.out::println);
    }
}
