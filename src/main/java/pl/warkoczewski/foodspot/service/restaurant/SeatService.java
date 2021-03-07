package pl.warkoczewski.foodspot.service.restaurant;

import pl.warkoczewski.foodspot.dto.restaurant.SeatDisplayDTO;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;

import java.util.List;


public interface SeatService {
    List<SeatDisplayDTO> getAllByRestaurantName(String name);
    List<Seat> addAll(List<Seat> seats);
    Seat addSeat(Seat seat, String name);
}
