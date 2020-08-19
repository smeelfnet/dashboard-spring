package com.dashboard.api.models.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LanguageTmdb {
    @JsonProperty("name")
    private String name;
    @JsonProperty("iso_639_1")
    private String iso_639_1;
}
