package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.model.PLACE_TYPE;
import pl.warkoczewski.foodspot.service.PlaceServiceImpl;

@Controller
@RequestMapping("/place")
public class PlaceController {
    private final PlaceServiceImpl placeService;

    public PlaceController(PlaceServiceImpl placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/places")
    public String displayGetPlacesPage(Model model){
        model.addAttribute("placeQueryDTO", new PlaceQueryDTO());
        model.addAttribute("placeTypes", PLACE_TYPE.values());
        return "/place/places";
    }
    @PostMapping("/places")
    public String processPlaceQueryForm(@ModelAttribute PlaceQueryDTO placeQueryDTO){
        return "/place/places";
    }

}
