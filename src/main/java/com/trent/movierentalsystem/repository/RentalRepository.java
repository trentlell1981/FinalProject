package com.trent.movierentalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trent.movierentalsystem.entity.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {

}
