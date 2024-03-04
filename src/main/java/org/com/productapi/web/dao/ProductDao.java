package org.com.productapi.web.dao;

import org.com.productapi.model.Product;

import java.util.List;

public interface ProductDao {

    //returns the list of all products
    List<Product> findAll();

    //returns a product by its id
    Product findById(Integer id);

    //saves a product
    void save(Product product);

    //deletes a product by its id
    void deleteById(Integer id);

    //Updates an existing product
    void updateProduct(Integer id,Product product);
}
