package com.dashboard.api.models.tmdb;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GenreTmdb {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
}
