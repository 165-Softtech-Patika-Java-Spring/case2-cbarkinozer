package com.softtech.softtechspringboot.add.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="ADD_ADDRESS")
@Data
public class AddAddress {
    @Id
    @SequenceGenerator(name="AddAddress",sequenceName = "ADD_ADDRESS_ID_SEQ")
    @GeneratedValue(generator="AddAddress")
    private Long id;

    @Column(name="COUNTRY_ID",nullable = false)
    private Long countryId;

    @Column(name="CITY_ID",nullable = false)
    private Long cityId;

    @Column(name="DISTRICT_ID",nullable = false)
    private Long districtId;

    @Column(name="NEIGHBORHOOD_ID",nullable = false)
    private Long neighborhoodId;

    @Column(name="STREET_ID",nullable = false)
    private Long streetId;

    @Column(name="BUILDING_ID",nullable = false)
    private Long buildingId;

    @Column(name="DOOR_ID",nullable = false)
    private Long doorId;

}
