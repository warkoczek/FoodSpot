package pl.warkoczewski.foodspot.service.weather;

public interface WeatherService {
    String getWeather(String city, Double lat, Double lon);
}
