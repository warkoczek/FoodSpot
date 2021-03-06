package pl.warkoczewski.foodspot.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SEAT_NAME {
    @JsonProperty("ONE") ONE,
    @JsonProperty("TWO")TWO,
    @JsonProperty("THREE")THREE,
    @JsonProperty("FOUR")FOUR,
    @JsonProperty("FIVE")FIVE,
    @JsonProperty("SIX")SIX;
}
