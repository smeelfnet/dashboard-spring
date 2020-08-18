package com.dashboard.api.services.radarr;

import com.dashboard.api.models.radarr.MovieRadarr;

import java.io.IOException;
import java.util.List;

public interface RadarrApiService {
    List<MovieRadarr> retrieveMovies() throws IOException;
    List<MovieRadarr> retrieveMovies(Long id);
}
