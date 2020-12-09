package com.lamba.carSelling.repositories;

import com.lamba.carSelling.models.CarReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarReservationRepository extends JpaRepository<CarReservation,Long> {
}
