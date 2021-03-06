package pl.warkoczewski.foodspot.controller.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantBookingDTO;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;

@Controller
@RequestMapping("/restaurants/restaurant")
public class BookingController {
    /*@GetMapping("/book")
    public String displayBookingPage(Model model){
        model.addAttribute("restaurantBookingDTO", new RestaurantBookingDTO());
        model.addAttribute("seatNames", SEAT_NAME.values());
        return "/restaurant/book";
    }
    @PostMapping("/book")
    public String processBookingForm(@ModelAttribute RestaurantBookingDTO restaurantBookingDTO){
        return "/restaurant/book";
    }*/
}
