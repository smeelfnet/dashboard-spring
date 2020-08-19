
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
public class AlternativeTitle {

    @JsonProperty("source_type")
    public String sourceType;
    @JsonProperty("movie_id")
    public Long movieId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("source_id")
    public Long sourceId;
    @JsonProperty("votes")
    public Long votes;
    @JsonProperty("vote_count")
    public Long voteCount;
    @JsonProperty("language")
    public Language language;
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
