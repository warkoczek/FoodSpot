package pl.warkoczewski.foodspot.setup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;
import pl.warkoczewski.foodspot.service.restaurant.RestaurantService;
import pl.warkoczewski.foodspot.service.restaurant.SeatService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Slf4j
public class OnStartRestaurantInitializer implements ApplicationRunner {
    private final RestaurantService restaurantService;
    private final SeatService seatService;

    public OnStartRestaurantInitializer(RestaurantService restaurantService, SeatService seatService) {
        this.restaurantService = restaurantService;
        this.seatService = seatService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Restaurant> restaurants = addRestaurants();
        log.info("After restaurants creation {}", restaurants);
        List<Seat> seats = addSeats();
        log.info("After seats creation {}", seats);
    }
    private List<Restaurant> addRestaurants(){
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("La Rica"));
        restaurants.add(new Restaurant("La Bamba"));
        return restaurantService.addAllRestaurants(restaurants);
    }
    private List<Seat> addSeats(){
        Seat seat = new Seat(SEAT_NAME.ONE, 4L);
        String name = "La Rica";
        //Restaurant restaurant = restaurantRepository.findById(1l).get();
        return Collections.singletonList(seatService.addSeat(seat, name));
    }
}
