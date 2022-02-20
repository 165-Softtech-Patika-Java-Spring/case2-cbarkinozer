package com.softtech.softtechspringboot.ngh.dao;

import com.softtech.softtechspringboot.ngh.entity.NghNeighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NghNeighborhoodDao extends JpaRepository<NghNeighborhood,Long> {
}
