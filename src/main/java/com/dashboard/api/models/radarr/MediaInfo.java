
package com.dashboard.api.models.radarr;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MediaInfo {

    @JsonProperty("container_format")
    public String containerFormat;
    @JsonProperty("video_format")
    public String videoFormat;
    @JsonProperty("video_codec_id")
    public String videoCodecID;
    @JsonProperty("video_profile")
    public String videoProfile;
    @JsonProperty("video_codec_library")
    public String videoCodecLibrary;
    @JsonProperty("video_bitrate")
    public Long videoBitrate;
    @JsonProperty("video_bit_depth")
    public Long videoBitDepth;
    @JsonProperty("video_multi_view_count")
    public Long videoMultiViewCount;
    @JsonProperty("video_colour_primaries")
    public String videoColourPrimaries;
    @JsonProperty("video_transfer_characteristics")
    public String videoTransferCharacteristics;
    @JsonProperty("width")
    public Long width;
    @JsonProperty("height")
    public Long height;
    @JsonProperty("audio_format")
    public String audioFormat;
    @JsonProperty("audio_codec_id")
    public String audioCodecID;
    @JsonProperty("audio_codec_library")
    public String audioCodecLibrary;
    @JsonProperty("audio_additional_features")
    public String audioAdditionalFeatures;
    @JsonProperty("audio_bitrate")
    public Long audioBitrate;
    @JsonProperty("run_time")
    public String runTime;
    @JsonProperty("audio_stream_count")
    public Long audioStreamCount;
    @JsonProperty("audio_channels")
    public Long audioChannels;
    @JsonProperty("audio_channel_positions")
    public String audioChannelPositions;
    @JsonProperty("audio_channel_positions_text")
    public String audioChannelPositionsText;
    @JsonProperty("audio_profile")
    public String audioProfile;
    @JsonProperty("video_fps")
    public Float videoFps;
    @JsonProperty("audio_languages")
    public String audioLanguages;
    @JsonProperty("subtitles")
    public String subtitles;
    @JsonProperty("scan_type")
    public String scanType;
    @JsonProperty("schema_revision")
    public Long schemaRevision;
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
