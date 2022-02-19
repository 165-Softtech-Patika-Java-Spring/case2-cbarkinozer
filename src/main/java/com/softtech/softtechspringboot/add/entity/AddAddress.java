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

    @Column(name="ID_CNT_COUNTRY",nullable = false)
    private Long countryId;

    @Column(name="ID_CTY_CITY",nullable = false)
    private Long cityId;

    @Column(name="ID_DST_DISTRICT",nullable = false)
    private Long districtId;

    @Column(name="ID_NGH_NEIGHBORHOOD",nullable = false)
    private Long neighborhoodId;

    @Column(name="ID_STR_STREET",nullable = false)
    private Long streetId;

    @Column(name="ID_BLD_BUILDING",nullable = false)
    private Long buildingId;

    @Column(name="ID_DOR_DOOR",nullable = false)
    private Long doorId;

}
