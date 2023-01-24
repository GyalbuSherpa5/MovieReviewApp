package com.don.movies.service.reviewService;

import com.don.movies.entity.Review;

public interface ReviewService {
    public Review createReview(String reviewBody, String imdbId);
}
