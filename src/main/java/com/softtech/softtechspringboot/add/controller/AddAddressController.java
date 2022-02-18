package com.softtech.softtechspringboot.add.controller;


import com.softtech.softtechspringboot.add.dto.AddAddressDto;
import com.softtech.softtechspringboot.add.service.AddAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/addresses")
@RequiredArgsConstructor
public class AddAddressController {

    private final AddAddressService addAddressService;

    @GetMapping
    public ResponseEntity findAll(){
        List<AddAddressDto> addAddressDaoList=addAddressService.findAll();
        return new ResponseEntity(addAddressDaoList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody AddAddressDto addAddressDto){
        AddAddressDto addAddressDto1 = addAddressService.save(addAddressDto);
        return new ResponseEntity(addAddressDto1, HttpStatus.OK);
    }

}
