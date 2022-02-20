package com.softtech.softtechspringboot.add.converter;

import com.softtech.softtechspringboot.add.dto.AddAddressDto;
import com.softtech.softtechspringboot.add.entity.AddAddress;
import com.softtech.softtechspringboot.add.service.AddAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/*
*   Example convertions without using mappers.
*
*/

@Service
@RequiredArgsConstructor
public class AddAddressConverter {

    private final AddAddressService addAddressService;

    public List<AddAddressDto> convertToAddAddressDtoList(List<AddAddress> addAddressList) {
        List<AddAddressDto> addAddressDtoList = new ArrayList<>();
        for(AddAddress addAddress: addAddressList){
            AddAddressDto addAddressDto = convertToAddAddressDto(addAddress);
            addAddressDtoList.add(addAddressDto);
        }
        return addAddressDtoList;
    }

    private AddAddressDto convertToAddAddressDto(AddAddress addAddress) {
        AddAddressDto addAddressDto = new AddAddressDto();
        addAddressDto.setCountryId(addAddress.getCountryId());
        addAddressDto.setCityId(addAddress.getCityId());
        addAddressDto.setDistrictId(addAddress.getDistrictId());
        addAddressDto.setNeighborhoodId(addAddress.getNeighborhoodId());
        addAddressDto.setStreetId(addAddress.getStreetId());
        addAddressDto.setBuildingId(addAddress.getBuildingId());
        addAddressDto.setDoorId(addAddress.getDoorId());
        return addAddressDto;
    }
}
