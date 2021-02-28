package pl.warkoczewski.foodspot.dto.weather;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDTO {
    private float temperature;
    private int pressure;
    private int humidity;
    private float windSpeed;
}
