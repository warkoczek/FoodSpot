package pl.warkoczewski.foodspot.fetcher;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.warkoczewski.foodspot.model.PlaceQuery;

import java.util.List;

public class PlaceFetcherImpl implements PlaceFetcher {
    private static final String GOOGLE_APIS_PLACE_SEARCH = "https://maps.googleapis.com/maps/api/place/nearbysearch/";
    private static final String GOOGLE_APIS_PLACE_SEARCH_KEY = "AIzaSyAzjbfgQXOHrxMwqh7JS253V--zbXJtqmU";
    @Override
    public List<String> getPlaces() {
        RestTemplate restTemplate = new RestTemplate();

        return null;
    }
    private UriComponentsBuilder buildUri(PlaceQuery placeQuery){
        return UriComponentsBuilder.fromHttpUrl(GOOGLE_APIS_PLACE_SEARCH)
                .queryParams(addQueryParams(placeQuery));
    }

    private MultiValueMap<String, String> addQueryParams(PlaceQuery placeQuery) {
        MultiValueMap<String, String> queryParam = new LinkedMultiValueMap<>();
        queryParam.add("lat", placeQuery.getLocation().getLat());
        queryParam.add("lon", placeQuery.getLocation().getLon());
        queryParam.add("radius", String.valueOf(placeQuery.getRadius()));
        queryParam.add("type", String.valueOf(placeQuery.getPlace_type()));
        queryParam.add("keyword", placeQuery.getKeyword());
        queryParam.add("key",GOOGLE_APIS_PLACE_SEARCH_KEY);
        return queryParam;
    }
}
