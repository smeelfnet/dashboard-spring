package com.dashboard.api.models.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ActorCastTmdb {
    @JsonProperty("cast_id")
    private Long castId;
    @JsonProperty("character")
    private String character;
    @JsonProperty("credit_id")
    private String creditId;
    @JsonProperty("gender")
    private Long gender;
    @JsonProperty("id")
    private Long actorId;
    @JsonProperty("name")
    private String fullActorName;
    @JsonProperty("order")
    private Long order;
    @JsonProperty("profile_path")
    private String profilePath;
}
