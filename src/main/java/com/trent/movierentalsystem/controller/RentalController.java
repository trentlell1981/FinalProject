package com.trent.movierentalsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trent.movierentalsystem.entity.Rental;
import com.trent.movierentalsystem.service.RentalService;

@RestController
@RequestMapping("/rentals")
public class RentalController {

	private final RentalService rentalService;

	@Autowired
	public RentalController(RentalService rentalService) {
		this.rentalService = rentalService;
	}

	@PostMapping
	public Rental createRental(@RequestBody Rental rental) {
		return rentalService.saveRental(rental);
	}

	@GetMapping
	public List<Rental> getAllRentals() {
		return rentalService.getAllRentals();
	}

	@GetMapping("/{id}")
	public Optional<Rental> getRentalById(@PathVariable Long id) {
		return rentalService.getRentalById(id);
	}

	@PutMapping("/{id}")
	public Rental updateRental(@PathVariable Long id, @RequestBody Rental rental) {
		rental.setId(id);
		return rentalService.saveRental(rental);
	}

	@DeleteMapping("/{id}")
	public void deleteRental(@PathVariable Long id) {
		rentalService.deleteRental(id);
	}
}
