package com.softtech.softtechspringboot.ngh.service.entityservice;

import com.softtech.softtechspringboot.gen.service.BaseEntityService;
import com.softtech.softtechspringboot.ngh.dao.NghNeighborhoodDao;
import com.softtech.softtechspringboot.ngh.entity.NghNeighborhood;
import org.springframework.stereotype.Service;

@Service
public class NgrNeighborhoodEntityService extends BaseEntityService<NghNeighborhood, NghNeighborhoodDao> {
    public NgrNeighborhoodEntityService(NghNeighborhoodDao nghNeighborhoodDao) {
        super(nghNeighborhoodDao);
    }
}
