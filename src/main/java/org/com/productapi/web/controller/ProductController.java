package org.com.productapi.web.controller;

import org.com.productapi.model.Product;
import org.com.productapi.web.dao.ProductDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }


    @GetMapping("/api/products")
    public List<Product> getProducts(){
        return productDao.findAll();
    }

    @GetMapping("/api/products/{id}")
    public Product getProduct(@PathVariable Integer id){
        return productDao.findById(id);
    }

    @PostMapping("/api/products")
    public void addProduct(@RequestBody Product product){
        productDao.save(product);
    }

    @DeleteMapping("/api/products/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productDao.deleteById(id);
    }

    @PutMapping("/api/products/{id}")
    public void updateProduct(@PathVariable Integer id,@RequestBody Product product){
        productDao.updateProduct(id,product);
    }
}
