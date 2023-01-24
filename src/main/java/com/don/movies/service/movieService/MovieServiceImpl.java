package com.don.movies.service.movieService;

import com.don.movies.entity.Movie;
import com.don.movies.repository.MovieRepo;
import com.don.movies.service.movieService.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepo movieRepo;
    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }

    @Override
    public Optional<Movie> getSingleMovie(String imdbId) {
        return movieRepo.findMovieByImdbId(imdbId);
    }
}
