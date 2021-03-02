package pl.warkoczewski.foodspot.controller.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {
    @GetMapping()
    public ModelAndView viewAllRestaurants(ModelAndView modelAndView){
        modelAndView.setViewName("/restaurant/restaurants");
        return modelAndView;
    }

}
