package org.ferdev.jdbc;

import org.ferdev.jdbc.model.Category;
import org.ferdev.jdbc.model.Product;
import org.ferdev.jdbc.repository.ProductRepositoryImpl;
import org.ferdev.jdbc.repository.Repository;
import org.ferdev.jdbc.util.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class ExampleUpdate {
    public static void main(String[] args) {
        try(Connection conn = ConnectionDB.getInstance()) {

            Repository<Product> repository = new ProductRepositoryImpl();
            System.out.println("=========== Listar ===========");
            repository.list().forEach(System.out::println);

            System.out.println();
            System.out.println("=========== Encontrar Por Id ===========");
            System.out.println( repository.byId(2L) );

            System.out.println();
            System.out.println("=========== Update ===========");
            Product product = new Product();
            product.setId(11L);
            product.setNombre("Teclado Razer Mecanico");
            product.setPrecio(3500);
            Category category = new Category();
            category.setId( 3L );
            product.setCategory( category );
            repository.create( product );
            System.out.println("Producto actualizado!");

            repository.list().forEach(System.out::println);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
