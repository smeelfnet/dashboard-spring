package com.dashboard.api.services.tmdb.Impl;

import com.dashboard.api.models.actor.Actor;
import com.dashboard.api.models.tmdb.ActorCastTmdb;
import com.dashboard.api.models.tmdb.ActorTmdb;
import com.dashboard.api.services.tmdb.ActorTmdbService;
import com.dashboard.api.services.tmdb.TmdbApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorTmdbServiceImpl implements ActorTmdbService {

    @Autowired
    private TmdbApiService tmdbApiService;

    private final String pathToImage = "https://image.tmdb.org/t/p/original";

    @Override
    public List<Actor> findActorsdByMovies(Long movieId) {
        String path = "/movie/" + movieId + "/credits";
        List<ActorCastTmdb> castByMovie = tmdbApiService.findCastByMovie(path);
        return castByMovie.stream().map(this::toActor).collect(Collectors.toList());
    }

    @Override
    public ActorTmdb findByActorId(Long actor_id) {
        String path = "/person/" + actor_id;
        return null;
    }

    private Actor toActor(ActorCastTmdb castTmdb) {
        Actor actor = new Actor();
        actor.setActive((long) 1);
        actor.setFullName(castTmdb.getFullActorName());
        actor.setTmdbId(castTmdb.getActorId());
        if(castTmdb.getProfilePath() != null) {
            actor.setPicturePath("/image/no-image-available.jpg");
        } else {
            actor.setPicturePath(castTmdb.getProfilePath());
        }

        actor.setPicturePath(castTmdb.getProfilePath());
        return actor;
    }
}
