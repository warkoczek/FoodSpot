package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.warkoczewski.foodspot.service.PlaceServiceImpl;

@Controller
@RequestMapping("/place")
public class PlaceController {
    private final PlaceServiceImpl placeService;

    public PlaceController(PlaceServiceImpl placeService) {
        this.placeService = placeService;
    }

    @GetMapping
    public String displayGetPlacesPage(Model model){
        return "/place/places";
    }
}
