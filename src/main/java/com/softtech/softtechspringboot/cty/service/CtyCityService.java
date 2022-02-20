package com.softtech.softtechspringboot.cty.service;

import com.softtech.softtechspringboot.cty.converter.CtyCityMapper;
import com.softtech.softtechspringboot.cty.dto.CtyCityDto;
import com.softtech.softtechspringboot.cty.dto.CtyCitySaveRequestDto;
import com.softtech.softtechspringboot.cty.entity.CtyCity;
import com.softtech.softtechspringboot.cty.service.entityservice.CtyCityEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CtyCityService {
    private final CtyCityEntityService ctyCityEntityService;

    public CtyCityDto save(CtyCitySaveRequestDto ctyCitySaveRequestDto) {
        CtyCity ctyCity = CtyCityMapper.INSTANCE.convertToCtyCity(ctyCitySaveRequestDto);
        ctyCity = ctyCityEntityService.save(ctyCity);
        return CtyCityMapper.INSTANCE.convertToCtyCityDto(ctyCity);
    }
    /*
    public CtyCityDto findOne(String plateCode) {
        CtyCity ctyCity = ctyCityEntityService.getByPlateCodeWithControl(plateCode);
        return CtyCityMapper.INSTANCE.convertToCtyCityDto(ctyCity);
    }
    */
}