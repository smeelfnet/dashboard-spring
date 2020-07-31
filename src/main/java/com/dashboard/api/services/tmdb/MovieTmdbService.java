package com.dashboard.api.services.tmdb;

import com.dashboard.api.models.tmdb.MovieTmdb;

import java.util.List;

public interface MovieTmdbService {
    List<MovieTmdb> findNowPlaying();
    MovieTmdb findById(Long id);
}
