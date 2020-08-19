package com.dashboard.api.models.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class MovieTmdb {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("spoken_language")
    private List<LanguageTmdb> spokenLanguage;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("revenue")
    private Long revenue;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("video")
    private String video;
    @JsonProperty("title")
    private String title;
    @JsonProperty("production_countries")
    private List<ProductionCountryTmdb> productionCountries;
    @JsonProperty("production_companies")
    private List<ProductionCompanyTmdb> productionCompanies;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("genre_ids")
    private List<Long> genreIds;
    @JsonProperty("genres")
    private List <GenreTmdb> genres;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("vote_average")
    private BigDecimal voteAverage;
    @JsonProperty("popularity")
    private BigDecimal popularity;
    @JsonProperty("adult")
    private Boolean adult;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("belongs_to_collection")
    private Object belongsToCollection;
    @JsonProperty("budget")
    private Long budget;
    @JsonProperty("runtime")
    private Long runtime;
    @JsonProperty("vote_count")
    private Long voteCount;
    @JsonProperty("status")
    private String status;

}
