package pl.warkoczewski.foodspot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.warkoczewski.foodspot.dto.DisplayPlaceDTO;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.model.PLACE_TYPE;
import pl.warkoczewski.foodspot.service.place.PlaceServiceImpl;
import pl.warkoczewski.foodspot.util.Messages;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/searchPlaces")@Slf4j
public class PlaceController {
    private final PlaceServiceImpl placeService;
    public PlaceController(PlaceServiceImpl placeService) {
        this.placeService = placeService;
    }
    @GetMapping("/byCoordinates")
    public String displayPlaceQueryPage(Model model, Principal principal){
        model.addAttribute("placeQueryDTO", new PlaceQueryDTO());
        model.addAttribute("placeTypes", PLACE_TYPE.values());
        model.addAttribute("authenticatedUser", Messages.HI_USER + principal.getName());
        return "place/foodPlacesByCoordinates";
    }
    @PostMapping("/byCoordinates")
    public String processPlaceQueryForm(@ModelAttribute("placeQueryDTO") @Valid PlaceQueryDTO placeQueryDTO, BindingResult bindingResult, Model model){
        log.debug("Place query data: {}", placeQueryDTO);
        if(bindingResult.hasErrors()){
            return "place/foodPlacesByCoordinates";
        }
        List<DisplayPlaceDTO> results = placeService.getPlaces(placeQueryDTO);
        model.addAttribute("places", results);
        log.info("Places in your range shown");
        return "place/foodPlacesByCoordinates";
    }

}
