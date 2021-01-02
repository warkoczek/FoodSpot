package pl.warkoczewski.foodspot.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.DisplayPlaceDTO;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.fetcher.PlaceFetcherImpl;
import pl.warkoczewski.foodspot.model.PlaceQuery;

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
    @Override
    public List<DisplayPlaceDTO> getPlaces(PlaceQueryDTO placeQueryDTO) {
        return placeFetcher.fetchPlaces(modelMapper.map(placeQueryDTO, PlaceQuery.class))
                .stream()
                .map(place -> new DisplayPlaceDTO(place.getName(), place.getVicinity())).collect(Collectors.toList());
    }
}
