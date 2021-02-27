package pl.warkoczewski.foodspot.service.weather;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.webclient.weather.WeatherClient;
@Service
public class WeatherServiceImpl implements WeatherService {
    private final WeatherClient weatherClient;

    public WeatherServiceImpl(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @Override
    public String getWeather(String city) {
        return weatherClient.getWeatherForCity(city);
    }

    @Override
    public String getForecast(String city) {
        return weatherClient.getForecastForCity(city);
    }
}
