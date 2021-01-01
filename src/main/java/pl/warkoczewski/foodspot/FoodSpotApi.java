package pl.warkoczewski.foodspot;

import org.springframework.web.bind.annotation.GetMapping;

public class FoodSpotApi {
    @GetMapping
    public String sayHello(){
        return "Hello";
    }
}
