package pl.warkoczewski.foodspot.service.validation;


public interface ValidationService {
    boolean isLatitudeBetween(Double latitude);
    boolean isLongitudeBetween(Double longitude);
}
