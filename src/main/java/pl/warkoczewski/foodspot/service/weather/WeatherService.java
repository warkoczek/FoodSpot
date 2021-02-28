package pl.warkoczewski.foodspot.service.weather;

import pl.warkoczewski.foodspot.dto.weather.WeatherDTO;

public interface WeatherService {
    WeatherDTO getWeather(String city, Double lat, Double lon);
}
