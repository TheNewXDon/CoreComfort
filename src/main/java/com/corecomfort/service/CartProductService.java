package com.corecomfort.service;

import com.corecomfort.model.CartProduct;

import java.util.List;

public interface CartProductService {
    public List<CartProduct> getAll();
    public CartProduct findById(Long id);
    public CartProduct save(CartProduct cartProduct);
    public CartProduct update(CartProduct cartProduct);
    public void delete(Long id);
}
