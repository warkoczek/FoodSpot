package pl.warkoczewski.foodspot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class DisplayPlaceDTO {
    private String name;
    private String address;

    public DisplayPlaceDTO() {
    }

    public DisplayPlaceDTO(String name) {
        this.name = name;
    }

}
