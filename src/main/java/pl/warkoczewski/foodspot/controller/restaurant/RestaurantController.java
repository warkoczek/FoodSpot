package pl.warkoczewski.foodspot.controller.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantDisplayDTO;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.service.restaurant.RestaurantService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public ModelAndView viewAllRestaurants(ModelAndView modelAndView){
        List<Restaurant> restaurants = restaurantService.showAllRestaurants();
        modelAndView.addObject("restaurants", restaurants);
        modelAndView.setViewName("restaurant/restaurants");
        return modelAndView;
    }
    @GetMapping("/restaurant/view/{name}")
    public ModelAndView viewRestaurant(@PathVariable("name") String name, ModelAndView modelAndView){
        restaurantService.getRestaurantByName(name)
                .ifPresent(restaurantDisplayDTO -> {
                    modelAndView
                            .addObject("restaurant", restaurantDisplayDTO)
                            .addObject("seats", restaurantDisplayDTO.getSeats());
                });
        modelAndView.setViewName("restaurant/restaurant");
        return modelAndView;
    }



}
