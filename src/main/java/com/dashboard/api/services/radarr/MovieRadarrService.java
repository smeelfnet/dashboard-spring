package com.dashboard.api.services.radarr;

import com.dashboard.api.models.radarr.MovieRadarr;

import java.util.List;

public interface MovieRadarrService {

    List<MovieRadarr> findMovies();
    MovieRadarr findById(Long id);
}
