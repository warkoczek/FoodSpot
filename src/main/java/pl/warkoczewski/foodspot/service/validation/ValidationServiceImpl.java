package pl.warkoczewski.foodspot.service.validation;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.util.Coordinates;

import java.math.BigDecimal;

@Service
public class ValidationServiceImpl implements ValidationService {
    public boolean isLatitudeBetween(BigDecimal latitude){
        return latitude.compareTo(Coordinates.LATITUDE_MIN) >= 0 && latitude.compareTo(Coordinates.LATITUDE_MAX) <= 0;
    }
    @Override
    public boolean isLongitudeBetween(BigDecimal longitude) {
        return longitude.compareTo(Coordinates.LONGITUDE_MIN) >= 0 && longitude.compareTo(Coordinates.LONGITUDE_MAX) <= 0;
    }
}
