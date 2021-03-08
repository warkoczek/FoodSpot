package pl.warkoczewski.foodspot.service.restaurant;

import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;

public interface BookingService {
    boolean bookRestaurant(RestaurantBookingDTO restaurantBookingDTO );
}
