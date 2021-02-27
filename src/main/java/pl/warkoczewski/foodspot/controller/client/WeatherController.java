package pl.warkoczewski.foodspot.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.warkoczewski.foodspot.service.weather.WeatherService;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public String displayWeather(){
        weatherService.getWeather("Warszawa");
        return "/weather/weather";
    }
}
