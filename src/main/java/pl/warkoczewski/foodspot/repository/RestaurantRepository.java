package pl.warkoczewski.foodspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
