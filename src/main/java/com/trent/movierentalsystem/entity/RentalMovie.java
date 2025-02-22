package com.trent.movierentalsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rental_movie")
public class RentalMovie {

	@Id
	@ManyToOne
	@JoinColumn(name = "rental_id")
	private Rental rental;

	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
}
