package com.corecomfort.repository;

import com.corecomfort.model.CartProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepo extends CrudRepository<CartProduct, Long> {

}
