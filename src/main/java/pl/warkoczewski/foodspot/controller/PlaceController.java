package pl.warkoczewski.foodspot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.DisplayPlaceDTO;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.model.PLACE_TYPE;
import pl.warkoczewski.foodspot.service.PlaceServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/place")@Slf4j
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
    public ModelAndView processPlaceQueryForm(@ModelAttribute("placeQueryDTO") PlaceQueryDTO placeQueryDTO, ModelAndView modelAndView){
        log.debug("Place query data: {}", placeQueryDTO);
        List<DisplayPlaceDTO> results = placeService.getPlaces(placeQueryDTO);
        modelAndView.setViewName("/place/places");
        modelAndView.addObject("places", results);
        log.info("Places in your range shown");
        return modelAndView;
    }

}
