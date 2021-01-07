package pl.warkoczewski.foodspot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Location {
    private Double lat;
    private Double lon;

    public Location() {
    }

}
