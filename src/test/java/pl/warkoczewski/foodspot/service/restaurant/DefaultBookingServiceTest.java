package pl.warkoczewski.foodspot.service.restaurant;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;

import static org.junit.Assert.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class DefaultBookingServiceTest {
    @Autowired
    DefaultBookingService bookingService;

    @Test
    public void bookRestaurant_Should_Book_ONE_Seat_In_Restaurant_La_Rica_And_Return_Available_ONE_Seat_Amount_Equal_3() {
        RestaurantBookingDTO bookingDTO = new RestaurantBookingDTO();
        boolean b = bookingService.bookRestaurant(bookingDTO);
    }
}
