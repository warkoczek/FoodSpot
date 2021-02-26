package pl.warkoczewski.foodspot.service.restaurant;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.exception.RestaurantNotFoundException;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;
import pl.warkoczewski.foodspot.repository.SeatRepository;



@Service
public class DefaultSeatService implements SeatService {
    private final SeatRepository seatRepository;
    private final RestaurantService restaurantService;

    public DefaultSeatService(SeatRepository seatRepository, RestaurantService restaurantService) {
        this.seatRepository = seatRepository;
        this.restaurantService = restaurantService;
    }

    @Override
    public Seat addSeat(Seat seat, String name) {
        return restaurantService.getRestaurantByName(name).map(restaurant -> {
                seat.setRestaurant(restaurant);
                return seatRepository.save(seat);
    }).orElseThrow(() -> new RestaurantNotFoundException("Restaurant with name: " + name + "Does not exists"));
    }


}
