package com.softtech.softtechspringboot.add.service.entityservice;

import com.softtech.softtechspringboot.add.dao.AddAddressDao;
import com.softtech.softtechspringboot.add.entity.AddAddress;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddAddressEntityService {
    private final AddAddressDao addAddressDao;

    public List<AddAddress> findAll(){
        return addAddressDao.findAll();
    }
    public Optional<AddAddress> findById(Long id){
        return addAddressDao.findById(id);
    }
    public AddAddress save(AddAddress addAddress){
        return addAddressDao.save(addAddress);
    }
    public void delete(AddAddress addAddress){
        addAddressDao.delete(addAddress);
    }
}
