package com.lamba.carSelling;

import com.lamba.carSelling.models.CarReservation;
import com.lamba.carSelling.repositories.CarReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class CarSellingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSellingApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData( CarReservationRepository repository) {
		return (args) -> {
			// save a couple of car reservations
			repository.save(new CarReservation("Patrick","patricklamba@gmail.com",
					"0488525653","Toyota","1VHP-756",new BigDecimal(35000)));

		};
	}
}
