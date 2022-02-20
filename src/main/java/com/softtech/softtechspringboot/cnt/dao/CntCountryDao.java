package com.softtech.softtechspringboot.cnt.dao;

import com.softtech.softtechspringboot.cnt.entity.CntCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CntCountryDao extends JpaRepository<CntCountry,Long> {
    @Query(value="SELECT c.COUNTRY_NAME FROM CNT_COUNTRY AS c ")
    List<CntCountry> getCountryByCountryCode();

}
