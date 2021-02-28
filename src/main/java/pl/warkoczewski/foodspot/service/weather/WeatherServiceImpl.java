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
    public String getWeather(String city, Double lat, Double lon) {
        String weather = weatherClient.getWeatherForCity(city);
        String forecast = weatherClient.getForecastForCoordinates(lat, lon);
        return null;
    }
    /*
    @Override
    public String getForecast(Double lat, Double lon) {
        return weatherClient.getForecastForCoordinates(lat, lon);
    }*/
}
