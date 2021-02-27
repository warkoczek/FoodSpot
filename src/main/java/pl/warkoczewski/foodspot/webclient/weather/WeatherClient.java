package pl.warkoczewski.foodspot.webclient.weather;

public interface WeatherClient {
    String getWeatherForCity(String city);
    String getForecastForCity(String city);
}
