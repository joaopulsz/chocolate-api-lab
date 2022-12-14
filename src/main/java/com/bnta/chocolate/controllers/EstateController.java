package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/estates")
public class EstateController {

    @Autowired
    EstateService estateService;

    @GetMapping
    public ResponseEntity<List<Estate>> getAllEstates() {
        List<Estate> estates = estateService.getAllEstates();
        return new ResponseEntity<>(estates, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estate> createEstate(@RequestBody Estate estate) {
        estateService.saveEstate(estate);
        return new ResponseEntity<>(estate, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Estate> getEstate(@PathVariable long id) {
        Estate estate = estateService.getEstateById(id).get();
        return new ResponseEntity<>(estate, HttpStatus.OK);
    }
}
