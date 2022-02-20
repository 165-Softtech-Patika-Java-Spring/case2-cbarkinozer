package com.softtech.softtechspringboot.cty.dao;

import com.softtech.softtechspringboot.cty.entity.CtyCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CtyCityDao extends JpaRepository<CtyCity,Long> {

    @Query("SELECT c.CITY_NAME FROM CTY_CITY AS c")
    List<CtyCity> getCityByPlateCode();

}