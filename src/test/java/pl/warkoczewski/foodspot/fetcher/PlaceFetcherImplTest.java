package pl.warkoczewski.foodspot.fetcher;

import org.apache.http.client.utils.URIBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.warkoczewski.foodspot.model.Location;
import pl.warkoczewski.foodspot.model.PLACE_TYPE;
import pl.warkoczewski.foodspot.model.PlaceQuery;
import pl.warkoczewski.foodspot.model.entity.User;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest
class PlaceFetcherImplTest {

    @Test
    void fetchPlaces() {

    }

    @Test
    void getApiURI_Should_Return_URI_As_Expected() throws URISyntaxException {
        //given
        Location location = new Location(52.0d, 16.0d);
        PlaceQuery placeQuery = new PlaceQuery(location,15000L, PLACE_TYPE.RESTAURANT,"Italian");
        String googleApiURL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
        String googleApisPlaceSearchKey = "AIzaSyAzjbfgQXOHrxMwqh7JS253V--zbXJtqmU";
        String expectedURL =
                "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=52.0%2C+16.0&radius=15000&type=RESTAURANT" +
                        "&keyword=Italian&key=AIzaSyAzjbfgQXOHrxMwqh7JS253V--zbXJtqmU";
        //when
        String actualURI = new URIBuilder(googleApiURL)
                .addParameter("location", placeQuery.getLocation().getLat() + ", " + placeQuery.getLocation().getLon())
                .addParameter("radius", String.valueOf(placeQuery.getRadius()))
                .addParameter("type", placeQuery.getPlace_type().name())
                .addParameter("keyword", placeQuery.getKeyword())
                .addParameter("key", googleApisPlaceSearchKey)
                .build().toString();
        //then
        assertEquals(expectedURL, actualURI);
    }
}
