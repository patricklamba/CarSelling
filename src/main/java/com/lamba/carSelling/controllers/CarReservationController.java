package com.lamba.carSelling.controllers;

import com.lamba.carSelling.models.CarReservation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarReservationController {
    @GetMapping
    public List<CarReservation> getCars(){
        List<CarReservation> cars = new ArrayList<>();
        return cars;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createReservation(@RequestBody CarReservation car){
    }
    @GetMapping("/{id}")
    public CarReservation getCar(@PathVariable("id") long id){
        return new CarReservation();
    }
}
