package pl.warkoczewski.foodspot.service.restaurant;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;

@Service
public class DefaultBookingService implements BookingService {
    private final RestaurantService restaurantService;

    public DefaultBookingService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @Override
    public boolean bookRestaurant(RestaurantBookingDTO restaurantBookingDTO) {
        return false;
    }
}
