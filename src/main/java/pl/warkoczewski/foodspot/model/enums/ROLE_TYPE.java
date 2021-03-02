package pl.warkoczewski.foodspot.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ROLE_TYPE {
    @JsonProperty("ROLE_USER")ROLE_USER,
    @JsonProperty("ROLE_MANAGER")ROLE_MANAGER,
    @JsonProperty("ROLE_ADMIN")ROLE_ADMIN,
    @JsonProperty("ROLE_ADMIN_HEAD")ROLE_ADMIN_HEAD,
}
