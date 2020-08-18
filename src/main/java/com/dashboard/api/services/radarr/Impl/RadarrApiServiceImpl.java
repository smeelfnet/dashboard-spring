package com.dashboard.api.services.radarr.Impl;

import com.dashboard.api.models.radarr.MovieRadarr;
import com.dashboard.api.services.radarr.RadarrApiService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static com.dashboard.api.services.radarr.Impl.RadarrApiServiceImpl.RadarrConstants.*;

public class RadarrApiServiceImpl implements RadarrApiService {

    @Value("${radarr.v1.apikey}")
    private String radarrApiKey;

    @Value("${radarr.api.base.url}")
    private String radarrApiBaseUrl;

    @Override
    public List<MovieRadarr> retrieveMovies() throws IOException {
        return callToRadarr(FIND_MOVIE, null);
    }

    @Override
    public List<MovieRadarr> retrieveMovies(Long id) {
        return callToRadarr(FIND_MOVIE, id);
    }

    private List<MovieRadarr> callToRadarr(String path, Long id) {
        try {
            String url = createRadarrUrl(path, id);
            HttpResponse<JsonNode> jsonResponse = Unirest.get(url).asJson();

            if(jsonResponse.getStatus() != HttpStatus.SC_OK) {
                return null;
            }
            String jsonList = jsonResponse.getBody().getObject().toString();
            ObjectMapper objectMapper = new ObjectMapper();
            List<MovieRadarr> movieRadarrList = objectMapper.readValue(jsonList, new TypeReference<List<MovieRadarr>>(){} );

            return movieRadarrList;
        } catch (URISyntaxException | UnirestException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String createRadarrUrl(String path, Long id) throws URISyntaxException {

        URIBuilder uriBuilder;

        if (id != null) {
            uriBuilder = new URIBuilder(radarrApiBaseUrl + path + "/" + id);
        } else {
            uriBuilder = new URIBuilder(radarrApiBaseUrl + path);
        }
        uriBuilder.addParameter(API_KEY, radarrApiKey);

        return uriBuilder.build().toString();
    }

    static class RadarrConstants {
        public static final String API_KEY = "apikey";
        public static final String FIND_MOVIE = "/movie";
    }
}
