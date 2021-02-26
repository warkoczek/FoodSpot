package pl.warkoczewski.foodspot.service.restaurant;

import org.springframework.cloud.client.ConditionalOnDiscoveryHealthIndicatorEnabled;
import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.repository.RestaurantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultRestaurantService implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public DefaultRestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    @Override
    public Restaurant createRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> addAllRestaurants(List<Restaurant> restaurants) {
        return restaurantRepository.saveAll(restaurants);
    }

    @Override
    public List<Restaurant> showAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> getRestaurantByName(String name) {
        return restaurantRepository.findByName(name);
    }


}
