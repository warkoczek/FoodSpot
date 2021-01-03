package pl.warkoczewski.foodspot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class DisplayPlaceDTO {
    private Double lon;
    private Double lat;
    private String name;
    private String address;

    public DisplayPlaceDTO() {
    }

}
