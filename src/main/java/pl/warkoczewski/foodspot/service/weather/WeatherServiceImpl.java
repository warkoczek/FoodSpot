package pl.warkoczewski.foodspot.service.weather;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.weather.WeatherDTO;
import pl.warkoczewski.foodspot.webclient.weather.WeatherClient;
@Service
public class WeatherServiceImpl implements WeatherService {
    private final WeatherClient weatherClient;

    public WeatherServiceImpl(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @Override
    public WeatherDTO getWeather(String city, Double lat, Double lon) {
        return weatherClient.getWeatherForCity(city);
    }

    @Override
    public String getForecast(Double lat, Double lon) {
        return weatherClient.getForecastForCoordinates(lat, lon);
    }
}
