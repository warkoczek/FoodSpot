package pl.warkoczewski.foodspot.service.restaurant;

import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    Optional<Restaurant> getRestaurantByName(String name);
    List<Restaurant> addAllRestaurants(List<Restaurant> restaurants);
}
