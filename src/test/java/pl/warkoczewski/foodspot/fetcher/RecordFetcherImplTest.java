package pl.warkoczewski.foodspot.fetcher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.warkoczewski.foodspot.dto.PlaceQueryDTO;
import pl.warkoczewski.foodspot.model.PLACE_TYPE;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class RecordFetcherImplTest {
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
        PlaceQueryDTO placeQueryDTO = new PlaceQueryDTO("52.4064", "16.9252"
                , 15000l, PLACE_TYPE.RESTAURANT, "Italian");
    }


}
