package com.lamba.carSelling.controllers;

import com.lamba.carSelling.models.CarReservation;
import com.lamba.carSelling.repositories.CarReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CarReservationRestController {

    @Autowired
    CarReservationRepository carReservationRepository;

    @GetMapping("/reservations")
    public List<CarReservation> getCars(){
        return carReservationRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createReservation(@RequestBody CarReservation car){
        carReservationRepository.save(car);
    }
    @GetMapping("/{id}")
    public CarReservation getCar(@PathVariable("id") long id){
        return carReservationRepository.getOne(id);
    }
}
