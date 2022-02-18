package com.softtech.softtechspringboot.add.service;

import com.softtech.softtechspringboot.add.converter.AddAddressConverter;
import com.softtech.softtechspringboot.add.converter.AddAddressMapper;
import com.softtech.softtechspringboot.add.dto.AddAddressDto;
import com.softtech.softtechspringboot.add.entity.AddAddress;
import com.softtech.softtechspringboot.add.service.entityservice.AddAddressEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddAddressService {

    private final AddAddressEntityService addAddressEntityService;
    private final AddAddressConverter addAddressConverter;

    public List<AddAddressDto> findAll() {
        List<AddAddress> addAddressList = addAddressEntityService.findAll();
        return addAddressConverter.convertToAddAddressDtoList(addAddressList);
    }


    public AddAddressDto save(AddAddressDto addAddressDto) {
       AddAddress addAddress = AddAddressMapper.INSTANCE.convertToAddAddress(addAddressDto);
       addAddress = addAddressEntityService.save(addAddress);
       return AddAddressMapper.INSTANCE.convertToAddAddressDto(addAddress);
    }
}
