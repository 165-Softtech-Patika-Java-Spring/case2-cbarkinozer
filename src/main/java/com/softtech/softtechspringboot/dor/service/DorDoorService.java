package com.softtech.softtechspringboot.dor.service;

import com.softtech.softtechspringboot.add.converter.AddAddressConverter;
import com.softtech.softtechspringboot.add.service.entityservice.AddAddressEntityService;
import com.softtech.softtechspringboot.dor.service.entityservice.DorDoorEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DorDoorService {
    private final DorDoorEntityService dorDoorEntityService;

}
