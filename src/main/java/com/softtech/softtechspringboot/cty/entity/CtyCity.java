package com.softtech.softtechspringboot.cty.entity;

import com.softtech.softtechspringboot.cnt.entity.CntCountry;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Table(name="CTY_CITY")
public class CtyCity {
    @Id
    @SequenceGenerator(name="CtyCity",sequenceName = "CTY_CITY_ID_SEQ")
    @GeneratedValue(generator="CtyCity")
    private Long id;

    @Column(name="CTY_CITY_ID",nullable = false)
    private Long cityId;

    @Column(name="CTY_CITY_NAME",nullable = false)
    private String cityName;

    @Column(name="CTY_CITY_CODE",length=20, nullable = false)
    private String cityCode;

    @ManyToOne(
            fetch= FetchType.LAZY,
            cascade=CascadeType.ALL,
            optional=false)
    private CntCountry cntCountry;


}
