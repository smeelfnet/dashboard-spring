package com.dashboard.api.models.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductionCountryTmdb {
    @JsonProperty("iso_3166_1")
    private String iso_3166_1;
    @JsonProperty("name")
    private String name;
}
