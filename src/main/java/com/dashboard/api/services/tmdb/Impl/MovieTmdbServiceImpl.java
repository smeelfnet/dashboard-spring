package com.dashboard.api.services.tmdb.Impl;

import com.dashboard.api.models.tmdb.MovieTmdb;
import com.dashboard.api.services.tmdb.MovieTmdbService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static com.dashboard.api.services.tmdb.Impl.TmdbApiServiceImpl.TmdbConstants.*;

@Service
public class MovieTmdbServiceImpl implements MovieTmdbService {

    @Value("${tmdb.v3.apiKey}")
    private String tmdbApiKey;

    @Value("${tmdb.language}")
    private String tmdbLanguage;

    @Value("${tmdb.api.base.url}")
    private String tmdbApiBaseUrl;

    @Override
    public List<MovieTmdb> findNowPlaying() {
        try {
            String uriBuilder = createTmdbUrl(NOW_PLAYING_MOVIE);
            HttpResponse<JsonNode> jsonResponse = Unirest.get(uriBuilder).asJson();

            if(jsonResponse.getStatus() != HttpStatus.SC_OK) {
                return null;
            }
            String jsonList = jsonResponse.getBody().getObject().get("results").toString();
            ObjectMapper objectMapper = new ObjectMapper();
            List<MovieTmdb> movieTmdbList = objectMapper.readValue(jsonList, new TypeReference<List<MovieTmdb>>(){} );

            return movieTmdbList;
        } catch (URISyntaxException | UnirestException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public MovieTmdb findById(Long id) {
        try {
            String uriBuilder = createTmdbUrl(FIND_MOVIE_BY_ID + "/" + id);
            HttpResponse<JsonNode> jsonResponse = Unirest.get(uriBuilder).asJson();

            if(jsonResponse.getStatus() != HttpStatus.SC_OK) {
                return null;
            }
            String jsonObject = jsonResponse.getBody().getObject().toString();
            ObjectMapper objectMapper = new ObjectMapper();
            MovieTmdb movieTmdb = objectMapper.readValue(jsonObject, MovieTmdb.class);
            return movieTmdb;
        } catch (URISyntaxException | UnirestException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String createTmdbUrl(String path) throws URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder(tmdbApiBaseUrl + path);
        uriBuilder.addParameter(LANGUAGE, tmdbLanguage);
        uriBuilder.addParameter(API_KEY, tmdbApiKey);
        return uriBuilder.build().toString();
    }
}
