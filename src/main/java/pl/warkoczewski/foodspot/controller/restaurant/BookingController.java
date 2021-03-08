package pl.warkoczewski.foodspot.controller.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;
import pl.warkoczewski.foodspot.service.restaurant.RestaurantService;

@Controller
@RequestMapping("/restaurants/restaurant")
public class BookingController {
    private final RestaurantService restaurantService;

    public BookingController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


}
