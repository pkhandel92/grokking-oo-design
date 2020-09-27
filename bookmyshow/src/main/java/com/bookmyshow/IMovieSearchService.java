package com.bookmyshow;

import com.bookmyshow.movie.Movie;
import com.bookmyshow.movie.MovieGenre;

import java.util.Date;
import java.util.List;

public interface IMovieSearchService {
    public List<Movie> searchByName(String movieName);
    public List<Movie> searchByReleaseDate(Date releaseDate);
    public List<Movie> searchByGenre(MovieGenre genre);
    public List<Movie> searchByLocation(String location);
}
