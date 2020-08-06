package com.dashboard.api.services.radarr.Impl;

import com.dashboard.api.models.radarr.MovieRadarr;
import com.dashboard.api.services.radarr.MovieRadarrService;
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

import static com.dashboard.api.services.radarr.Impl.RadarrApiServiceImpl.RadarrConstants.*;

@Service
public class MovieRadarrServiceImpl implements MovieRadarrService {


    @Value("${radarr.v1.apikey}")
    private String radarrApiKey;

    @Value("${radarr.api.base.url}")
    private String radarrApiBaseUrl;

    @Override
    public List<MovieRadarr> findMovie() {
        try {
            String uriBuilder = createRadarrUrl(FIND_MOVIE);
            HttpResponse<JsonNode> jsonResponse = Unirest.get(uriBuilder).asJson();

            if(jsonResponse.getStatus() != HttpStatus.SC_OK) {
                return null;
            }
            String jsonList = jsonResponse.getBody().getObject().toString();
            ObjectMapper objectMapper = new ObjectMapper();
            List<MovieRadarr> movieRadarrList = objectMapper.readValue(jsonList, new TypeReference<List<MovieRadarr>>() {
            } );

            return movieRadarrList;
        } catch (URISyntaxException | UnirestException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public MovieRadarr findById(Long id) {
        try {
            String urlBuilder = createRadarrUrl(FIND_MOVIE + "/" + id);
            HttpResponse<JsonNode> jsonResponse = Unirest.get(urlBuilder).asJson();

            if(jsonResponse.getStatus() != HttpStatus.SC_OK) {
                return null;
            }
            String jsonObject = jsonResponse.getBody().getObject().toString();
            ObjectMapper objectMapper = new ObjectMapper();
            MovieRadarr movieRadarr = objectMapper.readValue(jsonObject, MovieRadarr.class);
            return movieRadarr;
        } catch (URISyntaxException | UnirestException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String createRadarrUrl(String path) throws URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder(radarrApiBaseUrl + path + "?apikey=" + radarrApiKey);
        return uriBuilder.build().toString();
    }
}
