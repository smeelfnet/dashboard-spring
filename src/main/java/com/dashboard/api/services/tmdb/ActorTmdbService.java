package com.dashboard.api.services.tmdb;

import com.dashboard.api.models.actor.Actor;
import com.dashboard.api.models.tmdb.ActorTmdb;

import java.util.List;

public interface ActorTmdbService {

    List<Actor> findActorsdByMovies(Long movieId);
    ActorTmdb findByActorId(Long actor_id);
}
