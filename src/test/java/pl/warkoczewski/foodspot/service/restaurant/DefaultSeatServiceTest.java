package pl.warkoczewski.foodspot.service.restaurant;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class DefaultSeatServiceTest {
    @Autowired
    private DefaultSeatService seatService;

    public DefaultSeatServiceTest() {
    }

    @Test
    void addSeatShouldReturnSeatId2ForAddedSeatWithSeat_NameOneAndAmount2ForRestaurantWithUniqueNameLaRica() {
        //given
        String restaurantName = "La Rica";
        Seat seat = new Seat(SEAT_NAME.ONE, 2l);
        Long expectedId = 2l;
        //seat.setSEAT_name(SEAT_NAME.ONE);
        //seat.setAmount(2l);
        //when
        Long actualId = seatService.addSeat(seat, restaurantName).getId();
        //then
        Assert.assertEquals(expectedId, actualId);
    }
}
