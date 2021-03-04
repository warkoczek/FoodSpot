package pl.warkoczewski.foodspot.service.restaurant;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantDisplayDTO;
import pl.warkoczewski.foodspot.exception.RestaurantNotFoundException;

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
    @Test
    public void getRestaurantByNameShouldReturnRestaurantDisplayDTOWhereNameIsLaBamba(){
        //given
        String name = "La Bamba";
        String expectedName = "La Bamba";
        //when
        String actualName = restaurantService.getRestaurantByName(name)
                .map(RestaurantDisplayDTO::getName)
                .orElseThrow(() -> new RestaurantNotFoundException("Restaurant not found"));
        //then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getRestaurantByNameShouldReturnRestaurantDisplayDTOWithSeatListSize1(){
        //given
        String name = "La Rica";
        int expectedSize = 1;
        //when
        int actualSize = restaurantService
                .getRestaurantByName(name).map(restaurantDisplayDTO -> restaurantDisplayDTO.getSeats().size())
                .orElseThrow(() -> new RestaurantNotFoundException("Restaurant not found"));
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

}
