package pl.warkoczewski.foodspot.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.fetcher.PlaceFetcherImpl;
import pl.warkoczewski.foodspot.model.PlaceQuery;
import pl.warkoczewski.foodspot.model.place.Place;

import java.util.List;
@Service
public class PlaceServiceImpl implements PlaceService {
    private final PlaceFetcherImpl placeFetcher;
    private final ModelMapper modelMapper;

    public PlaceServiceImpl(PlaceFetcherImpl placeFetcher, ModelMapper modelMapper) {
        this.placeFetcher = placeFetcher;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Place> getPlaces(PlaceQueryDTO placeQueryDTO) {
        return placeFetcher.getPlaces(modelMapper.map(placeQueryDTO, PlaceQuery.class));
    }
}