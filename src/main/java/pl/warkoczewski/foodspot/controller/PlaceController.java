package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import pl.warkoczewski.foodspot.service.PlaceService;

@Controller
public class PlaceController {
    private final PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }
}
