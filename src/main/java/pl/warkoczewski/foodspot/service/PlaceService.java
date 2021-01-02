package pl.warkoczewski.foodspot.service;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.DisplayPlaceDTO;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.model.place.Place;

import java.util.List;

public interface PlaceService {
    List<DisplayPlaceDTO> getResults(PlaceQueryDTO placeQueryDTO);
}
