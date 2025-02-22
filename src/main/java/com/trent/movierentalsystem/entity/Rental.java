package com.trent.movierentalsystem.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rental")
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String rentalDate;
	private String returnDate;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonIgnore
	private Customer customer;

	@ManyToMany
	@JoinTable(name = "rental_movie", joinColumns = @JoinColumn(name = "rental_id"), inverseJoinColumns = @JoinColumn(name = "movie_id"))
	@JsonIgnore
	private List<Movie> movies;

}
