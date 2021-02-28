package pl.warkoczewski.foodspot.dto.place;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.warkoczewski.foodspot.model.enums.PLACE_TYPE;
import pl.warkoczewski.foodspot.validation.constraints.Latitude;
import pl.warkoczewski.foodspot.validation.constraints.Longitude;
@AllArgsConstructor
@Data
public class PlaceQueryDTO {
    @Latitude
    private Double lat;
    @Longitude
    private Double lon;
    private Long radius;
    private PLACE_TYPE place_type;
    private String keyword;

    public PlaceQueryDTO() {
    }

}
