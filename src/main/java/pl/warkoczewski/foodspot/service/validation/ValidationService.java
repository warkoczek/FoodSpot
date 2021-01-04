package pl.warkoczewski.foodspot.service.validation;

import java.math.BigDecimal;

public interface ValidationService {
    boolean isLatitudeBetween(BigDecimal latitude);
    boolean isLongitudeBetween(BigDecimal longitude);
}
