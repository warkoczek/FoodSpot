package pl.warkoczewski.foodspot.fetcher;

import pl.warkoczewski.foodspot.model.PlaceQuery;
import pl.warkoczewski.foodspot.model.place.Result;

import java.util.List;

public interface PlaceFetcher {
    List<Result> getResults(PlaceQuery placeQuery);
}
