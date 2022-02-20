package com.softtech.softtechspringboot.dst.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Table(name="DST_DISTRICT")
public class DstDistrict {
    @Id
    @SequenceGenerator(name="DstDistrict",sequenceName = "DST_DISTRICT_ID_SEQ")
    @GeneratedValue(generator="DstDistrict")
    private Long id;

    @Column(name="DST_DISTRICT_ID",nullable = false)
    private Long districtId;

    @Column(name="DST_DISTRICT_NAME",nullable = false)
    private String districtName;
}
