package pl.warkoczewski.foodspot.dto.weather;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class WeatherDTO {
    private float temperature;
    private int pressure;
    private int humidity;
    private float windSpeed;
}
