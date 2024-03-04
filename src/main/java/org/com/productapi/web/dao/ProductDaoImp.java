package org.com.productapi.web.dao;

import org.com.productapi.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductDaoImp implements ProductDao{

    public static List<Product> products=new ArrayList<>();

    static {
        products.add(new Product(1,"iPhone Pro","Apple iPhone Pro",1000,"Smartphone","Apple","Green"));
        products.add(new Product(2,"iPad Pro","Apple iPad Pro",1300,"Tablet","Apple","Silver"));
        products.add(new Product(3,"MacBook Pro","Apple MacBook Pro",2000,"Laptop","Apple","Space Gray"));

    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Integer id) {
        for (Product product : products){
            if (id.equals(product.getId())){
                return product;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void deleteById(Integer id) {
        products.removeIf( product -> id.equals(product.getId()));
    }

    @Override
    public void updateProduct(Integer id, Product product) {
        for (int i=0;i< products.size();i++){
            Product p=products.get(i);
            if(id.equals(p.getId())){
                products.set(i,product);
                return;
            }
        }
    }
}
