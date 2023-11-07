package com.corecomfort.service;

import com.corecomfort.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public Product findById(Long id);
    public Product save(Product product);
    public Product update(Product product);
    public void delete(Long id);
}
