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

import com.trent.movierentalsystem.entity.Movie;
import com.trent.movierentalsystem.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	private final MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@PostMapping
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}

	@GetMapping
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}

	@GetMapping("/{id}")
	public Optional<Movie> getMovieById(@PathVariable Long id) {
		return movieService.getMovieById(id);
	}

	@PutMapping("/{id}")
	public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
		movie.setId(id);
		return movieService.saveMovie(movie);
	}

	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable Long id) {
		movieService.deleteMovie(id);
	}
}
