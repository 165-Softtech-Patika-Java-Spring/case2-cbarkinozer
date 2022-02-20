package com.softtech.softtechspringboot.dst.service.entityservice;


import com.softtech.softtechspringboot.dst.dao.DstDistrictDao;
import com.softtech.softtechspringboot.dst.entity.DstDistrict;
import com.softtech.softtechspringboot.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;


@Service
public class DstDistrictEntityService extends BaseEntityService<DstDistrict, DstDistrictDao> {

    public DstDistrictEntityService(DstDistrictDao dstDistrictDao) {
        super(dstDistrictDao);
    }

}
