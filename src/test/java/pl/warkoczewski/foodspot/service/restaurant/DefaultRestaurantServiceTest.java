package pl.warkoczewski.foodspot.service.restaurant;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class DefaultRestaurantServiceTest {
    @Autowired
    private DefaultRestaurantService restaurantService;

    @Test
    public void showAllRestaurantsShouldReturnListSize1() {
        //given
        int expectedSize = 2;
        //when
        int actualSize = restaurantService.showAllRestaurants().size();
        //then
        Assert.assertEquals(expectedSize, actualSize);

    }
}
