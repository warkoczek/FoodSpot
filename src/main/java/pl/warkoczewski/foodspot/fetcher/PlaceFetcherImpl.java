package pl.warkoczewski.foodspot.fetcher;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public class PlaceFetcherImpl implements PlaceFetcher {
    @Override
    public List<String> getPlaces() {
        RestTemplate restTemplate = new RestTemplate();

        return null;
    }
    private UriComponentsBuilder buildUri(){
        return null;
    }
}
