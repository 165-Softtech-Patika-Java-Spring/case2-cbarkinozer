package com.softtech.softtechspringboot.bld.dao;

import com.softtech.softtechspringboot.bld.entity.BldBuilding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BldBuildingDao extends JpaRepository<BldBuilding,Long> {
}
