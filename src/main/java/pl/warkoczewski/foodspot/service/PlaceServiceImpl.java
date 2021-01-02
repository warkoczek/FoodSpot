package pl.warkoczewski.foodspot.service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.DisplayPlaceDTO;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.fetcher.PlaceFetcherImpl;
import pl.warkoczewski.foodspot.model.PLACE_TYPE;
import pl.warkoczewski.foodspot.model.PlaceQuery;
import pl.warkoczewski.foodspot.model.place.Place;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlaceServiceImpl implements PlaceService {
    private final PlaceFetcherImpl placeFetcher;
    private final ModelMapper modelMapper;

    public PlaceServiceImpl(PlaceFetcherImpl placeFetcher, ModelMapper modelMapper) {
        this.placeFetcher = placeFetcher;
        this.modelMapper = modelMapper;
    }

    public List<DisplayPlaceDTO> getResulPlaces(){
        PlaceQueryDTO placeQueryDTO = new PlaceQueryDTO("52.4064", "16.9252"
                , 15000l, PLACE_TYPE.RESTAURANT, "Italian");
        return getResults(placeQueryDTO);
    }

    @Override
    public List<DisplayPlaceDTO> getResults(PlaceQueryDTO placeQueryDTO) {
        return placeFetcher.getResults(modelMapper.map(placeQueryDTO, PlaceQuery.class))
                .stream()
                .map(result -> new DisplayPlaceDTO(result.getName())).collect(Collectors.toList());
    }
}
