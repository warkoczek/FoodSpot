package pl.warkoczewski.foodspot.fetcher;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public class PlaceFetcherImpl implements PlaceFetcher {
    private static final String GOOGLE_APIS_PLACE_SEARCH = "https://maps.googleapis.com/maps/api/place/nearbysearch/";
    @Override
    public List<String> getPlaces() {
        RestTemplate restTemplate = new RestTemplate();

        return null;
    }
    private UriComponentsBuilder buildUri(){

        return UriComponentsBuilder.fromHttpUrl(GOOGLE_APIS_PLACE_SEARCH);
    }
}
