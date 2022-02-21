package com.softtech.softtechspringboot.cty.dao;

import com.softtech.softtechspringboot.cty.entity.CtyCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CtyCityDao extends JpaRepository<CtyCity,Long> {


}
