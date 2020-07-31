package com.dashboard.api.models.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class MovieTmdb {

    private Long id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("spoken_language")
    private List<LanguageTmdb> spokenLanguage;

    @JsonProperty("backdrop_path")
    private String backdropPath;
    @JsonProperty("original_language")
    private String originalLanguage;
    private Long revenue;
    @JsonProperty("original_title")
    private String originalTitle;
    private String video;
    private String title;
    @JsonProperty("production_countries")
    private List<ProductionCountryTmdb> productionCountries;
    @JsonProperty("production_companies")
    private List<ProductionCompanyTmdb> productionCompanies;
    private String overview;
    @JsonProperty("genre_ids")
    private List<Long> genreIds;
    private List <GenreTmdb> genres;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("vote_average")
    private BigDecimal voteAverage;
    private BigDecimal popularity;
    private Boolean adult;

    private String tagline;
    private String homepage;
    @JsonProperty("belongs_to_collection")
    private Object belongsToCollection;
    private Long budget;
    private Long runtime;
    @JsonProperty("vote_count")
    private Long voteCount;
    private String status;

}
