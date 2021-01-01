package pl.warkoczewski.foodspot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodSpotController {
    @GetMapping
    public String foodSpot(){
        return "home";
    }
}
