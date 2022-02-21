package com.softtech.softtechspringboot.dst.dao;

import com.softtech.softtechspringboot.dst.entity.DstDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DstDistrictDao extends JpaRepository<DstDistrict,Long> {
    @Query(value="SELECT district FROM DstDistrict district LEFT JOIN CtyCity city ON district.districtId = city.cityId; ")
    DstDistrict getDistrictByCityCode(@Param("cityId") Long cityId);
}
