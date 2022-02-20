package com.softtech.softtechspringboot.cty.controller;

import com.softtech.softtechspringboot.cty.dto.CtyCityDto;
import com.softtech.softtechspringboot.cty.dto.CtyCitySaveRequestDto;
import com.softtech.softtechspringboot.cty.service.CtyCityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cities")
@RequiredArgsConstructor
public class CtyCityController {
    private final CtyCityService ctyCityService;
    //3. City is savable
    public ResponseEntity save(@RequestBody CtyCitySaveRequestDto ctyCitySaveRequestDto){
        CtyCityDto ctyCityDto = ctyCityService.save(ctyCitySaveRequestDto);
        return ResponseEntity.ok(ctyCityDto);
    }
    //4. Query city from plateCode
    @GetMapping("/{plateCode}")
    public ResponseEntity findByPlateCode(@PathVariable String plateCode){
        CtyCityDto ctyCityDto =ctyCityService.findOne(plateCode);
        return ResponseEntity.ok(ctyCityDto);
    }

}