package pl.warkoczewski.foodspot.service.weather;

public interface WeatherService {
    String getWeather(String city);
    String getForecast(Double lat, Double lon);
}
