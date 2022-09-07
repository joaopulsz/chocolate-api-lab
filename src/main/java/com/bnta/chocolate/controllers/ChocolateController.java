package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/chocolate")
public class ChocolateController {

    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolates() {
        List<Chocolate> chocolates =
    }
}
