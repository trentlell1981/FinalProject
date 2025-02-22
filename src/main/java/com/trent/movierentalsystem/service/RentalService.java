package com.trent.movierentalsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trent.movierentalsystem.entity.Rental;
import com.trent.movierentalsystem.repository.RentalRepository;

@Service
public class RentalService {

	private final RentalRepository rentalRepository;

	@Autowired
	public RentalService(RentalRepository rentalRepository) {
		this.rentalRepository = rentalRepository;
	}

	public Rental saveRental(Rental rental) {
		return rentalRepository.save(rental);
	}

	public List<Rental> getAllRentals() {
		return rentalRepository.findAll();
	}

	public Optional<Rental> getRentalById(Long id) {
		return rentalRepository.findById(id);
	}

	public void deleteRental(Long id) {
		rentalRepository.deleteById(id);
	}
}
