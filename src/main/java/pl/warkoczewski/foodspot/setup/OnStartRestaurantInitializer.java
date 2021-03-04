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
        List<Seat> seat1 = addSeat1();
        log.info("After seats creation {}", seat1);
        List<Seat> seat2 = addSeat2();
        log.info("After seats creation {}", seat2);
        List<Seat> seat3 = addSeat3();
        log.info("After seats creation {}", seat3);
    }
    private List<Restaurant> addRestaurants(){
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("La Rica"));
        restaurants.add(new Restaurant("La Bamba"));
        restaurants.add(new Restaurant("La Luna"));
        return restaurantService.addAllRestaurants(restaurants);
    }
    private List<Seat> addSeat1(){
        Seat seat1 = new Seat(SEAT_NAME.ONE, 4L);
        String name1 = "La Rica";

        return Collections.singletonList(seatService.addSeat(seat1, name1));
    }
    private List<Seat> addSeat2(){
        Seat seat2 = new Seat(SEAT_NAME.THREE, 2l);
        String name2 = "La Bamba";
        return Collections.singletonList(seatService.addSeat(seat2, name2));
    }
    private List<Seat> addSeat3(){
        Seat seat3 = new Seat(SEAT_NAME.FIVE, 1l);
        String name3 = "La Luna";
        return Collections.singletonList(seatService.addSeat(seat3, name3));
    }
}
