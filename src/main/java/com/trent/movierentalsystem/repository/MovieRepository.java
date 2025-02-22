package com.trent.movierentalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trent.movierentalsystem.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
