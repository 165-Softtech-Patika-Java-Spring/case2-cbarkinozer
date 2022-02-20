package com.softtech.softtechspringboot.bld.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="BLD_BUILDING")
public class BldBuilding {
    @Id
    @SequenceGenerator(name="BldBuilding",sequenceName = "BLD_BUILDING_ID_SEQ")
    @GeneratedValue(generator="BldBuilding")
    private Long id;
    @Column(name="BLD_BUILDING_ID",nullable = false)
    private Long buildingId;

    @Column(name="BLD_BUILDING_NAME",nullable = true)
    private Long buildingName;
}
