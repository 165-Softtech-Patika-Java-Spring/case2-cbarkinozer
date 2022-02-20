package com.softtech.softtechspringboot.str.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class StrStreetDto {
    private Long id;
    private String streetId;
    private String streetName;
}
