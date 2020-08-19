
package com.dashboard.api.models.radarr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieRadarr {

    @JsonProperty("title")
    public String title;
    @JsonProperty("alternative_titles")
    public List<AlternativeTitle> alternativeTitles = null;
    @JsonProperty("secondary_year_source_id")
    public Long secondaryYearSourceId;
    @JsonProperty("sort_title")
    public String sortTitle;
    @JsonProperty("size_on_disk")
    public Long sizeOnDisk;
    @JsonProperty("status")
    public String status;
    @JsonProperty("overview")
    public String overview;
    @JsonProperty("in_cinemas")
    public String inCinemas;
    @JsonProperty("physical_release")
    public String physicalRelease;
    @JsonProperty("images")
    public List<Image> images = null;
    @JsonProperty("website")
    public String website;
    @JsonProperty("downloaded")
    public Boolean downloaded;
    @JsonProperty("year")
    public Long year;
    @JsonProperty("has_file")
    public Boolean hasFile;
    @JsonProperty("you_tube_trailer_id")
    public String youTubeTrailerId;
    @JsonProperty("studio")
    public String studio;
    @JsonProperty("path")
    public String path;
    @JsonProperty("profile_id")
    public Long profileId;
    @JsonProperty("monitored")
    public Boolean monitored;
    @JsonProperty("minimum_availability")
    public String minimumAvailability;
    @JsonProperty("is_available")
    public Boolean isAvailable;
    @JsonProperty("folder_name")
    public String folderName;
    @JsonProperty("runtime")
    public Long runtime;
    @JsonProperty("last_info_sync")
    public String lastInfoSync;
    @JsonProperty("clean_title")
    public String cleanTitle;
    @JsonProperty("imdb_id")
    public String imdbId;
    @JsonProperty("tmdb_id")
    public Long tmdbId;
    @JsonProperty("title_slug")
    public String titleSlug;
    @JsonProperty("certification")
    public String certification;
    @JsonProperty("genres")
    public List<String> genres = null;
    @JsonProperty("tags")
    public List<Object> tags = null;
    @JsonProperty("added")
    public String added;
    @JsonProperty("ratings")
    public Ratings ratings;
    @JsonProperty("movie_file")
    public MovieFile movieFile;
    @JsonProperty("quality_profile_id")
    public Long qualityProfileId;
    @JsonProperty("id")
    public Long id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
