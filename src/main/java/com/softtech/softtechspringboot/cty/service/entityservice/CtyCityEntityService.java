package com.softtech.softtechspringboot.cty.service.entityservice;

import com.softtech.softtechspringboot.cty.dao.CtyCityDao;
import com.softtech.softtechspringboot.cty.entity.CtyCity;
import com.softtech.softtechspringboot.cty.enums.CtyErrorMessage;
import com.softtech.softtechspringboot.gen.exceptions.ItemNotFoundException;
import com.softtech.softtechspringboot.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;


@Service
public class CtyCityEntityService extends BaseEntityService<CtyCity, CtyCityDao> {
    private final CtyCityDao ctyCityDao;
    public CtyCityEntityService(CtyCityDao ctyCityDao) {
        super(ctyCityDao);
        this.ctyCityDao = ctyCityDao;
    }

    public CtyCity getByCityCodeWithControl(String plateCode) {
        CtyCity ctyCity= ctyCityDao.getCityByCityCode(plateCode);
        if (ctyCity==null){
            throw new ItemNotFoundException(CtyErrorMessage.CITY_ERROR_MESSAGE);
        }
        return ctyCity;
    }

}
