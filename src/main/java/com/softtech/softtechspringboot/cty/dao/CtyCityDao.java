package com.softtech.softtechspringboot.cty.dao;

import com.softtech.softtechspringboot.cty.entity.CtyCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CtyCityDao extends JpaRepository<CtyCity,Long> {

    @Query(value="SELECT city FROM CTY_CITY city WHERE city.CTY_CITY_CODE LIKE %:cityCode%")
    CtyCity getCityByCityCode(@Param("cityCode") String cityCode);

}
