package com.corecomfort.service;

import com.corecomfort.model.Address;
import com.corecomfort.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Override
    public List<Address> getAll() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id).orElseThrow(() -> new RuntimeException("Address not found"));
    }

    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public Address update(Address address) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        addressRepository.deleteById(id);
    }
}
