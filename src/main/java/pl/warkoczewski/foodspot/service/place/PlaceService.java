package pl.warkoczewski.foodspot.service.place;

import pl.warkoczewski.foodspot.dto.DisplayPlaceDTO;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;

import java.util.List;

public interface PlaceService {
    List<DisplayPlaceDTO> getPlaces(PlaceQueryDTO placeQueryDTO);
}
