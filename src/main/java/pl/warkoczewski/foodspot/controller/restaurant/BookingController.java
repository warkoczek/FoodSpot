package pl.warkoczewski.foodspot.controller.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;

@Controller
@RequestMapping("/restaurants/restaurant")
public class BookingController {
    @GetMapping("/book")
    public ModelAndView displayBookingPage(ModelAndView modelAndView){
        modelAndView.addObject("restaurantBookingDTO", new RestaurantBookingDTO());
        modelAndView.setViewName("/restaurant/book");
        return modelAndView;

    }
    @PostMapping("/book")
    public ModelAndView processBookingForm(@ModelAttribute RestaurantBookingDTO restaurantBookingDTO, ModelAndView modelAndView, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            modelAndView.setViewName("/restaurant/book");
        }
        modelAndView.setViewName("restaurant/book");
        return modelAndView;
    }
}
