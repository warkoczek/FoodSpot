package pl.warkoczewski.foodspot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PLACE_TYPE {
    @JsonProperty("RESTAURANT") RESTAURANT ,
    @JsonProperty("CHURCH")CHURCH;
}
