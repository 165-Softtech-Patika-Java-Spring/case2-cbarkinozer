package com.softtech.softtechspringboot.cty.service.entityservice;

import com.softtech.softtechspringboot.cty.dao.CtyCityDao;
import com.softtech.softtechspringboot.cty.entity.CtyCity;
import com.softtech.softtechspringboot.cty.enums.CtyErrorMessage;
import com.softtech.softtechspringboot.gen.exceptions.ItemNotFoundException;
import com.softtech.softtechspringboot.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CtyCityEntityService extends BaseEntityService<CtyCity, CtyCityDao> {
    public CtyCityEntityService(CtyCityDao ctyCityDao) {
        super(ctyCityDao);
    }
        /*
        public CtyCity getByPlateCodeWithControl(String plateCode) {
        Optional<CtyCity> entityOptional = findByString(plateCode);
        CtyCity ctyCity;
        if (entityOptional.isPresent()){
            ctyCity = entityOptional.get();
        } else {
            throw new ItemNotFoundException(CtyErrorMessage.CITY_ERROR_MESSAGE);
        }
        return ctyCity;
    }

    */
}
