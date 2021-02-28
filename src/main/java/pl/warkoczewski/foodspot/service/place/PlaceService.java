package pl.warkoczewski.foodspot.service.place;

import pl.warkoczewski.foodspot.dto.place.DisplayPlaceDTO;
import pl.warkoczewski.foodspot.dto.place.PlaceQueryDTO;

import java.net.URISyntaxException;
import java.util.List;

public interface PlaceService {
    List<DisplayPlaceDTO> getPlaces(PlaceQueryDTO placeQueryDTO) throws URISyntaxException;
}
