package pl.warkoczewski.foodspot.webclient.weather;

public interface WeatherClient {
    String getWeatherForCity(String city);
    String getForecastForCoordinates(Double lat, Double lon);
}
