package pl.warkoczewski.foodspot.service.validation;

import java.math.BigDecimal;

public interface ValidationService {
    boolean isLatitudeBetween(Double latitude);
    boolean isLongitudeBetween(Double longitude);
}
