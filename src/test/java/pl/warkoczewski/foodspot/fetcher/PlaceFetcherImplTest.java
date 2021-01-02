package pl.warkoczewski.foodspot.fetcher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class PlaceFetcherImplTest {
    @Test
    void getApiURL_Should_Return_Given_Url() {
        //given
        String expectedUrl = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?" +
                "location=52.4064,16.9252&radius=150000&type=restaurant&" +
                "keyword=Italian&key=AIzaSyAzjbfgQXOHrxMwqh7JS253V--zbXJtqmU";
        //when
        //then

    }

    @Test
    void getResults() {
    }


}
