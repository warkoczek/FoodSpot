package pl.warkoczewski.foodspot.webclient.weather;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClientImpl implements WeatherClient {
    private static final String WEATHER_URL = "";
    private static final String API_KEY = "";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public String getWeatherForCity(String city) {
        return restTemplate.getForObject(WEATHER_URL + "", String.class, API_KEY);

    }
}
