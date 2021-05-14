package org.ferdev.jdbc.repository;

import org.ferdev.jdbc.model.Category;
import org.ferdev.jdbc.model.Product;
import org.ferdev.jdbc.util.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements Repository<Product>{

    private Connection getConnection() throws SQLException {
        return ConnectionDB.getInstance();
    }

    @Override
    public List<Product> list() {
        List<Product> products = new ArrayList<>();

        try (
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id)")){
            while ( rs.next() ){
                Product p = setProduct(rs);
                products.add( p );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product byId(Long id) {
        Product p = null;
        try(
                PreparedStatement stmt = getConnection().prepareStatement("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id) WHERE p.id = ?");
            ) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    p = setProduct(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public void create(Product product) {
        String sql;
        if ( product.getId() != null && product.getId() > 0 ) {
            sql = "UPDATE productos SET nombre=?, precio=?, categoria_id=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, categoria_id, fecha_registro) VALUES(?, ?, ?, ?)";
        }

        try(
                PreparedStatement stmt = getConnection().prepareStatement( sql )
            ) {
            stmt.setString(1, product.getNombre() );
            stmt.setLong(2, product.getPrecio() );
            stmt.setLong(3, product.getCategory().getId() );

            if ( product.getId() != null && product.getId() > 0 ) {
                stmt.setLong(4, product.getId());
            } else {
                stmt.setDate(4, new Date( product.getFechaRegistro().getTime()) );
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Long id) {
        try (
                PreparedStatement stmt =
                        getConnection().prepareStatement("DELETE FROM productos WHERE id=?")
            ){
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Product setProduct(ResultSet rs) throws SQLException {
        Product p = new Product();
        p.setId( rs.getLong("id") );
        p.setNombre( rs.getString("nombre") );
        p.setPrecio( rs.getInt("precio") );
        p.setFechaRegistro( rs.getDate("fecha_registro") );

        Category c = new Category();
        c.setId( rs.getLong("categoria_id") );
        c.setNombre( rs.getString("categoria") );

        p.setCategory( c );
        return p;
    }
}
