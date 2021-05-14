package org.ferdev.jdbc;

import org.ferdev.jdbc.model.Category;
import org.ferdev.jdbc.model.Product;
import org.ferdev.jdbc.repository.ProductRepositoryImpl;
import org.ferdev.jdbc.repository.Repository;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

            Repository<Product> repository = new ProductRepositoryImpl();
            System.out.println("=========== Listar ===========");
            repository.list().forEach(System.out::println);

            System.out.println();
            System.out.println("=========== Encontrar Por Id ===========");
            System.out.println( repository.byId(2L) );

            System.out.println();
            System.out.println("=========== Crear/Insertar ===========");
            Product product = new Product();
            product.setNombre("Piano electrico");
            product.setPrecio(2500);
            product.setFechaRegistro( new Date() );
            Category category = new Category();
            category.setId( 3L );
            product.setCategory( category );
            repository.create( product );
            System.out.println("Producto guardado!");

            repository.list().forEach(System.out::println);

    }
}