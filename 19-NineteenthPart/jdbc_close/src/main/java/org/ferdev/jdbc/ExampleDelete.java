package org.ferdev.jdbc;

import org.ferdev.jdbc.model.Product;
import org.ferdev.jdbc.repository.ProductRepositoryImpl;
import org.ferdev.jdbc.repository.Repository;
import org.ferdev.jdbc.util.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class ExampleDelete {
    public static void main(String[] args) {
        Repository<Product> repository = new ProductRepositoryImpl();
        System.out.println("=========== Listar ===========");
        repository.list().forEach(System.out::println);

        System.out.println();
        System.out.println("=========== Encontrar Por Id ===========");
        System.out.println( repository.byId(2L) );

        System.out.println();
        System.out.println("=========== Eliminar ===========");
        repository.delete( 3L );
        System.out.println("Producto eliminado!");

        repository.list().forEach(System.out::println);

    }
}
