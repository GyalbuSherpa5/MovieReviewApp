package com.don.movies.service.movieService;

import com.don.movies.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public List<Movie> getAllMovies();

    public Optional<Movie> getSingleMovie(String imdbId);
}
