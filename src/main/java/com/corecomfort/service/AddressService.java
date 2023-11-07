package com.corecomfort.service;

import com.corecomfort.model.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();
    public Address findById(Long id);
    public Address save(Address address);
    public Address update(Address address);
    public void deleteById(Long id);
}
