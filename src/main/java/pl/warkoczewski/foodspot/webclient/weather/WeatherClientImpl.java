package pl.warkoczewski.foodspot.webclient.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.warkoczewski.foodspot.dto.weather.WeatherDTO;
import pl.warkoczewski.foodspot.util.Weather;
import pl.warkoczewski.foodspot.webclient.weather.dto.OpenWeatherDTO;


@Component
@Slf4j
public class WeatherClientImpl implements WeatherClient {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public WeatherDTO getWeatherForCity(String city) {
        OpenWeatherDTO openWeatherDTO = getObject("weather?q={city}&appid={apiKey}&units=metric", OpenWeatherDTO.class, city, Weather.API_KEY);
        WeatherDTO weatherDTO = WeatherDTO.builder()
                .temperature(openWeatherDTO.getMain().getTemp())
                .pressure(openWeatherDTO.getMain().getPressure())
                .humidity(openWeatherDTO.getMain().getHumidity())
                .windSpeed(openWeatherDTO.getWind().getSpeed())
                .build();
        log.info("Your city weather: {}", weatherDTO);
        return weatherDTO;
    }
    @Override
    public String getForecastForCoordinates(Double lat, Double lon) {
        String forecast = getObject("onecall?lat={lat}&lon={lon}&appid={apiKey}", String.class, lat, lon , Weather.API_KEY);
        log.info("Your coordinates forecast: {}", forecast);
        return forecast;
    }

    private <T> T getObject(String url, Class<T> responseType, Object...objects) {
        return restTemplate.getForObject(Weather.WEATHER_URL + url, responseType, objects);
    }
}
