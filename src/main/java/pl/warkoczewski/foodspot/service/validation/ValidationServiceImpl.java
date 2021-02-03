package pl.warkoczewski.foodspot.service.validation;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.repository.UserRepository;
import pl.warkoczewski.foodspot.util.Coordinates;


@Service
public class ValidationServiceImpl implements ValidationService {
    private final UserRepository userRepository;

    public ValidationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isLatitudeBetween(Double latitude){
        return latitude.compareTo(Coordinates.LATITUDE_MIN) >= 0 && latitude.compareTo(Coordinates.LATITUDE_MAX) <= 0;
    }
    @Override
    public boolean isLongitudeBetween(Double longitude) {
        return longitude.compareTo(Coordinates.LONGITUDE_MIN) >= 0 && longitude.compareTo(Coordinates.LONGITUDE_MAX) <= 0;
    }

    @Override
    public boolean isUsernameUnique(String username) {
        return !userRepository.existsByUsername(username);
    }
}
