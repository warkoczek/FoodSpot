package pl.warkoczewski.foodspot.webclient.weather;

import pl.warkoczewski.foodspot.dto.weather.WeatherDTO;

public interface WeatherClient {
    WeatherDTO getWeatherForCity(String city);
    String getForecastForCoordinates(Double lat, Double lon);
}
