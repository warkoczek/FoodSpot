package pl.warkoczewski.foodspot.dto.restaurant;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@Builder
public class RestaurantDisplayDTO {
    private String name;
    private List<RestaurantSeatDTO> seats;
}
