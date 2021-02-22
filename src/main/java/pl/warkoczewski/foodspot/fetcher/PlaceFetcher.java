package pl.warkoczewski.foodspot.fetcher;

import pl.warkoczewski.foodspot.model.PlaceQuery;
import pl.warkoczewski.foodspot.model.place.Place;

import java.net.URISyntaxException;
import java.util.List;

public interface PlaceFetcher {
    List<Place> fetchPlaces(PlaceQuery placeQuery) throws URISyntaxException;
}
