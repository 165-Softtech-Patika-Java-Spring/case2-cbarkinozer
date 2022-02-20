package com.softtech.softtechspringboot.cnt.service.entityservice;

import com.softtech.softtechspringboot.cnt.dao.CntCountryDao;
import com.softtech.softtechspringboot.cnt.entity.CntCountry;
import com.softtech.softtechspringboot.cnt.enums.CntErrorMessage;
import com.softtech.softtechspringboot.gen.exceptions.ItemNotFoundException;
import com.softtech.softtechspringboot.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CntCountryEntityService extends BaseEntityService<CntCountry, CntCountryDao> {
    public CntCountryEntityService(CntCountryDao cntCountryDao) {
        super(cntCountryDao);
    }

    /*
    public CntCountry getByCountryCodeWithControl(String countryCode) {
        Optional<CntCountry> entityOptional = findByString(countryCode);
        CntCountry cntCountry;
        if (entityOptional.isPresent()){
            cntCountry = entityOptional.get();
        } else {
            throw new ItemNotFoundException(CntErrorMessage.COUNTRY_ERROR_MESSAGE);
        }
        return cntCountry;
    }
    */
}
