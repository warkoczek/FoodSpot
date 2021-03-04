package pl.warkoczewski.foodspot.service.restaurant;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantDisplayDTO;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantSeatDTO;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;
import pl.warkoczewski.foodspot.repository.RestaurantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultRestaurantService implements RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final SeatService seatService;

    public DefaultRestaurantService(RestaurantRepository restaurantRepository, SeatService seatService) {
        this.restaurantRepository = restaurantRepository;
        this.seatService = seatService;
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
    public Optional<RestaurantDisplayDTO> getRestaurantByName(String name) {
        List<RestaurantSeatDTO> seats = seatService.getAllByRestaurantName(name);
        return restaurantRepository.findByName(name)
                        .map(restaurant -> RestaurantDisplayDTO.builder()
                                .name(restaurant.getName())
                                .seats(seats).build());

    }


}
