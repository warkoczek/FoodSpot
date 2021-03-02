package pl.warkoczewski.foodspot.webclient.weather.dto;

import lombok.Getter;

@Getter
public class OpenWeatherDTO {
    private OpenWeatherMainDTO main;
    private OpenWeatherWindDTO wind;
}
