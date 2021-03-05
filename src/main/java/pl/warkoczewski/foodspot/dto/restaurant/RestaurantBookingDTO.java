package pl.warkoczewski.foodspot.dto.restaurant;

import lombok.Getter;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;

@Getter
public class RestaurantBookingDTO {
    private String restaurantName;
    private SEAT_NAME seatName;
    private Long amount;
}
