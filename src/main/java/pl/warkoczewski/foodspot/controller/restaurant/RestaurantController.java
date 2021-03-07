package pl.warkoczewski.foodspot.controller.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantDisplayDTO;
import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;
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
    }/*
    @GetMapping("/restaurant/book/{name}")
    public ModelAndView displayBookingPage(@PathVariable(value = "name") String name, ModelAndView modelAndView){
        restaurantService.getRestaurantByName(name).ifPresent(restaurantDisplayDTO
                -> { modelAndView.addObject("restaurantDisplayDTO", restaurantDisplayDTO);
                     modelAndView.addObject("restaurantBookingDTO", new RestaurantBookingDTO());
                     modelAndView.addObject("seatNames", SEAT_NAME.values());
                     modelAndView.setViewName("restaurant/book");
        });
        return modelAndView;
    }
    @PostMapping("restaurant/book")
    public ModelAndView processBookingPage(@ModelAttribute RestaurantBookingDTO bookingDTO, ModelAndView modelAndView, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            modelAndView.setViewName("restaurant/book");
            return modelAndView;
        }
        return modelAndView;
    }
    */




}
