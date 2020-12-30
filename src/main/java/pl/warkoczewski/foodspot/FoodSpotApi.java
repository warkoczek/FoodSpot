package pl.warkoczewski.foodspot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodSpotApi {
    @GetMapping
    public String sayHello(){
        return "Hello";
    }
}
