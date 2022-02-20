package com.softtech.softtechspringboot.ngh.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Table(name="NGH_NEIGHBORHOOD")
@RequiredArgsConstructor
public class NghNeighborhood {
    @Id
    @SequenceGenerator(name="NghNeighborhood",sequenceName = "NGH_NEIGHBORHOOD_ID_SEQ")
    @GeneratedValue(generator="NghNeighborhood")
    private Long id;

    @Column(name="NGH_NEIGHBORHOOD_ID",nullable = false)
    private String neighborhoodId;

    @Column(name="NGH_NEIGHBORHOOD_NAME",nullable = false)
    private String neighborhoodName;

    /* TODO create district
    @ManyToOne(
            fetch= FetchType.LAZY,
            cascade=CascadeType.ALL,
            optional=false)
    private DstDistrict dstDistrict;

     */
}
