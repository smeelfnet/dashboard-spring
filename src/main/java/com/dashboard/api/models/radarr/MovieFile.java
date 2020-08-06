
package com.dashboard.api.models.radarr;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
public class MovieFile {

    @JsonProperty("movie_id")
    public Long movieId;
    @JsonProperty("relative_path")
    public String relativePath;
    public Long size;
    @JsonProperty("date_added")
    public String dateAdded;
    @JsonProperty("scene_name")
    public String sceneName;
    @JsonProperty("quality")
    public Quality quality;
    @JsonProperty("edition")
    public String edition;
    @JsonProperty("media_info")
    public MediaInfo mediaInfo;
    @JsonProperty("id")
    public Long id;
    @JsonProperty("release_group")
    public String releaseGroup;
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
