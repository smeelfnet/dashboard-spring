package com.dashboard.api.services.radarr;

import com.dashboard.api.models.radarr.MovieRadarr;

public interface MovieRadarrService {

    MovieRadarr findById(Long id);
}
