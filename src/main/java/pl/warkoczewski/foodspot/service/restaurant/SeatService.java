package pl.warkoczewski.foodspot.service.restaurant;

import pl.warkoczewski.foodspot.dto.restaurant.RestaurantSeatDTO;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;

import java.util.List;


public interface SeatService {
    List<RestaurantSeatDTO> getAllByRestaurantName(String name);
    Seat addSeat(Seat seat, String name);
}
