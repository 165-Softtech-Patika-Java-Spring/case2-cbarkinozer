package com.softtech.softtechspringboot.dor.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="DOR_DOOR")
@Data
public class DorDoor {
    @Id
    @SequenceGenerator(name="DorDoor",sequenceName = "DOR_DOOR_ID_SEQ")
    @GeneratedValue(generator="DorDoor")
    private Long id;

    @Column(name="DOR_DOOR_ID",nullable = false)
    private Long buildingId;

    @Column(name="DOR_DOOR_NAME",nullable = true)
    private Long buildingName;
}
