package com.dashboard.api.controllers;

import com.dashboard.api.models.radarr.MovieRadarr;
import com.dashboard.api.services.radarr.MovieRadarrService;
import com.dashboard.api.services.tmdb.ActorTmdbService;
import com.dashboard.api.services.tmdb.MovieTmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {
    @Autowired
    private MovieTmdbService movieTmdbService;

    @Autowired
    private ActorTmdbService actorTmdbService;

    @Autowired
    private MovieRadarrService movieRadarrService;

    @GetMapping()
    public ModelAndView getMovie() {
        List<MovieRadarr> movieRadarrList = movieRadarrService.findMovies();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("movies", movieRadarrList);
        modelAndView.setViewName("/api/v1/movie");

        return modelAndView;
    }
}
