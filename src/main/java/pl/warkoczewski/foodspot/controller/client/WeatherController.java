package pl.warkoczewski.foodspot.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.warkoczewski.foodspot.dto.weather.WeatherDTO;
import pl.warkoczewski.foodspot.service.weather.WeatherService;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping
    public String displayWeather(Model model){
        WeatherDTO weatherDTO = weatherService.getWeather("Warszawa", 52.2298, 21.0118);
        model.addAttribute("weatherDTO", weatherDTO);
        return "/weather/weather";
    }
}
