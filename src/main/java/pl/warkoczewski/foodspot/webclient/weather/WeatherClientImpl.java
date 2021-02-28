package pl.warkoczewski.foodspot.webclient.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.warkoczewski.foodspot.util.Weather;

@Component
@Slf4j
public class WeatherClientImpl implements WeatherClient {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public String getWeatherForCity(String city) {
         String response = restTemplate.getForObject(Weather.WEATHER_URL + "weather?q={city}&appid={apiKey}", String.class, city, Weather.API_KEY);
         log.info("Your city weather: {}", response);
        return response;

    }
    @Override
    public String getForecastForCity(Double lat, Double lon) {
        String response = restTemplate.getForObject(Weather.FORECAST_URL + "onecall/?lat={lat}&lon={lon}&appid={apiKey}", String.class, lat, lon, Weather.API_KEY);
        log.info("Your city forecast: {}", response);
        return response;
    }
}
