package com.softtech.softtechspringboot.dst.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class DstDistrictDto {
    private Long id;
    private Long districtId;
    private String districtName;

}
