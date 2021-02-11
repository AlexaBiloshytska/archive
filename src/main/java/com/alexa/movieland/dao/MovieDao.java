package com.alexa.movieland.dao;

import com.alexa.movieland.entity.Movie;
import com.alexa.movieland.entity.SortingEnum;

import java.util.List;

public interface MovieDao {
    List<Movie> getAll(List<SortingEnum> sortingEnums);
    List<Movie> getRandom(int randomCount);
    List<Movie> getMoviesByGenre(int genreId, List<SortingEnum> sortingEnums);
}
