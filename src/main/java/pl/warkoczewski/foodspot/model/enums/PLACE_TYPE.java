package pl.warkoczewski.foodspot.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PLACE_TYPE {
    @JsonProperty("RESTAURANT") RESTAURANT ,
    @JsonProperty("BAR")BAR,
    @JsonProperty("BAKERY")BAKERY,
    @JsonProperty("CAFE")CAFE,
    @JsonProperty("CONVENIENCE_STORE")CONVENIENCE_STORE,
    @JsonProperty("LIQUOR_STORE")LIQUOR_STORE,
    @JsonProperty("MEAL_DELIVERY")MEAL_DELIVERY,
    @JsonProperty("MEAL_TAKEAWAY")MEAL_TAKEAWAY;
}
