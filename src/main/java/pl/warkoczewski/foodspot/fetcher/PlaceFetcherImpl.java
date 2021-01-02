package pl.warkoczewski.foodspot.fetcher;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.warkoczewski.foodspot.model.PlaceQuery;
import pl.warkoczewski.foodspot.model.place.Place;
import pl.warkoczewski.foodspot.model.place.Result;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

@Component
public class PlaceFetcherImpl implements PlaceFetcher {
    private static final String BASE_PLACE_SEARCH_GOOGLE_API_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
    private static final String GOOGLE_APIS_PLACE_SEARCH_KEY = "AIzaSyAzjbfgQXOHrxMwqh7JS253V--zbXJtqmU";

    @Override
    public List<Result> getResults(PlaceQuery placeQuery) {
        RestTemplate restTemplate = new RestTemplate();
        return Objects.requireNonNull(restTemplate.getForEntity(getApiURL(placeQuery), Place.class).getBody()).getResults();
    }
    public URI getApiURL(PlaceQuery placeQuery) {
        URI uri = null;
        try {
            URIBuilder uriBuilder =  new URIBuilder(BASE_PLACE_SEARCH_GOOGLE_API_URL)
                    .addParameter("location", placeQuery.getLocation().getLat() + ", " + placeQuery.getLocation().getLon())
                    .addParameter("radius", String.valueOf(placeQuery.getRadius()))
                    .addParameter("type", placeQuery.getPlace_type().name())
                    .addParameter("keyword", placeQuery.getKeyword())
                    .addParameter("key", GOOGLE_APIS_PLACE_SEARCH_KEY);
            uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }
    /*
    private String buildUri(PlaceQuery placeQuery){
        return UriComponentsBuilder.fromHttpUrl(BASE_PLACE_SEARCH_GOOGLE_API_URL)
                .queryParams(addQueryParams(placeQuery)).toUriString();
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

     */

}
