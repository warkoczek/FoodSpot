package pl.warkoczewski.foodspot.service.restaurant;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.repository.RestaurantRepository;

@Service
public class DefaultBookingService implements BookingService {
    private final RestaurantRepository restaurantRepository;

    public DefaultBookingService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void bookRestaurant(RestaurantBookingDTO restaurantBookingDTO){
        Restaurant restaurant = new Restaurant();
        restaurantRepository.save(restaurant);
    }
}
