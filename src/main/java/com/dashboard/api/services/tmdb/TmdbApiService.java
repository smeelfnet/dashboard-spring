package com.dashboard.api.services.tmdb;

import com.dashboard.api.models.tmdb.ActorCastTmdb;
import com.dashboard.api.models.tmdb.MovieTmdb;

import java.io.IOException;
import java.util.List;

public interface TmdbApiService {

    List<MovieTmdb> retrieveMovies() throws IOException;
    List<MovieTmdb> retrieveMovies(Integer primaryReleaseYear);
    List<MovieTmdb> retrieveMovies(List<Integer> favoriteActorIds);
    List<MovieTmdb> retrieveMovies(Integer primaryReleaseYear, List<Integer> favoriteActorIds);
    List<MovieTmdb> retrieveMovies(Integer primaryReleaseYear, Integer month, List<Integer> favoriteActorIds);
    List<ActorCastTmdb> findCastByMovie(String path);
}
