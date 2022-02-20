package com.softtech.softtechspringboot.ngh.controller;


import com.softtech.softtechspringboot.add.dto.AddAddressDto;
import com.softtech.softtechspringboot.ngh.dto.NghNeighborhoodDto;
import com.softtech.softtechspringboot.ngh.dto.NghNeighborhoodSaveRequestDto;
import com.softtech.softtechspringboot.ngh.service.NghNeighborhoodService;
import com.softtech.softtechspringboot.str.dto.StrStreetDto;
import com.softtech.softtechspringboot.str.dto.StrStreetSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/neighborhoods")
public class NghNeighborhoodController {
    private final NghNeighborhoodService nghNeighborhoodService;

    //7. Neighborhood is savable
    public ResponseEntity save(@RequestBody NghNeighborhoodSaveRequestDto nghNeighborhoodSaveRequestDto){
        NghNeighborhoodDto nghNeighborhoodDto = nghNeighborhoodService.save(nghNeighborhoodSaveRequestDto);
        return ResponseEntity.ok(nghNeighborhoodDto);
    }
    //8. Neighborhood name is updatable
    @PutMapping
    public ResponseEntity update(@RequestBody NghNeighborhoodDto nghNeighborhoodDto){
        NghNeighborhoodDto nghNeighborhoodDtoUpdated = nghNeighborhoodService.update(nghNeighborhoodDto);
        return ResponseEntity.ok(nghNeighborhoodDtoUpdated);
    }
    //9. Query neighborhoods that belongs to a district
    @GetMapping("/{districtId}")
    public ResponseEntity findByDistrictId(@PathVariable Long districtId){
        NghNeighborhoodDto nghNeighborhoodDto =nghNeighborhoodService.findById(districtId);
        return ResponseEntity.ok(nghNeighborhoodDto);
    }


}
