package com.dashboard.api.models.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ActorTmdb {
    private Boolean adult = false;
    @JsonProperty("also_known_as")
    private List<String> alsoKnownAs = new ArrayList<String>();
    private String biography;
    private String birthday;
    private String deathday;
    private String homepage;
    @JsonProperty("place_of_birth")
    private String birthplace;
    @JsonProperty("imdb_id")
    private String imdbId;
    private float popularity = 0.0f;
    private Long gender;
}
