package pl.warkoczewski.foodspot.dto.restaurant;

import lombok.Data;

@Data
public class RestaurantBookingDTO {

    private String restaurantName;
    private String seatName;
    private String amount;
}
