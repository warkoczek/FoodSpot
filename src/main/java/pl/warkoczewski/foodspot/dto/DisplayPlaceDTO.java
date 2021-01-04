package pl.warkoczewski.foodspot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class DisplayPlaceDTO {
    private BigDecimal lon;
    private BigDecimal lat;
    private String name;
    private String address;

    public DisplayPlaceDTO() {
    }

}
