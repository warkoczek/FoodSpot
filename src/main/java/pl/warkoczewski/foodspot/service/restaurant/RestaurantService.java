package pl.warkoczewski.foodspot.service.restaurant;

import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantDisplayDTO;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    List<Restaurant> addAllRestaurants(List<Restaurant> restaurants);
    List<Restaurant> showAllRestaurants();
    Optional<RestaurantDisplayDTO> getRestaurantByName(String name);

}
