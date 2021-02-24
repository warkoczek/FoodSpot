package pl.warkoczewski.foodspot.service.restaurant;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.repository.RestaurantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }


    @Override
    public Optional<Restaurant> getRestaurantByName(String name) {
        return restaurantRepository.findByName(name);
    }

    @Override
    public List<Restaurant> addAllRestaurants(List<Restaurant> restaurants) {
        return restaurantRepository.saveAll(restaurants);
    }
}
