package com.trent.movierentalsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trent.movierentalsystem.entity.Movie;
import com.trent.movierentalsystem.repository.MovieRepository;

@Service
public class MovieService {

	private final MovieRepository movieRepository;

	@Autowired
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	public Optional<Movie> getMovieById(Long id) {
		return movieRepository.findById(id);
	}

	public void deleteMovie(Long id) {
		movieRepository.deleteById(id);
	}
}
