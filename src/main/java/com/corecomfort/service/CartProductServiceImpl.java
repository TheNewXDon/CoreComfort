package com.corecomfort.service;

import com.corecomfort.model.CartProduct;
import com.corecomfort.repository.CartProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartProductServiceImpl implements CartProductService{
    @Autowired
    CartProductRepo cartProductRepo;


    @Override
    public List<CartProduct> getAll(){ return (List<CartProduct>) cartProductRepo.findAll(); }

    @Override
    public CartProduct findById(Long id){
        return cartProductRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("CartProduct Not Found"));
    }

    @Override
    public CartProduct save(CartProduct cartProduct) {
        return cartProductRepo.save(cartProduct);
    }

    @Override
    public CartProduct update(CartProduct cartProduct) {
        return cartProductRepo.save(cartProduct);
    }

    @Override
    public void delete(Long id) {
        cartProductRepo.deleteById(id);
    }
}
