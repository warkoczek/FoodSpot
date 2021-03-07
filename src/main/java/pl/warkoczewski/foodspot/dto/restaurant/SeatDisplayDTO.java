package pl.warkoczewski.foodspot.dto.restaurant;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
@Builder
public class SeatDisplayDTO {
    private String name;
    private Long amount;
}
