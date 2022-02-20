package com.softtech.softtechspringboot.str.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class StrStreetDto {
    private Long id;
    private Long streetId;
    private String streetName;
}
