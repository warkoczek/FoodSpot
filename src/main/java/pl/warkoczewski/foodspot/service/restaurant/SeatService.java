package pl.warkoczewski.foodspot.service.restaurant;

import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;



public interface SeatService {
    Seat addSeat(Seat seat, String name);
}
