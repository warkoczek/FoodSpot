package pl.warkoczewski.foodspot.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
    public String displayWeather(){
        return "/weather/weather";
    }
    @PostMapping
    public ModelAndView processGetWeatherForm(@RequestParam("city") String city, ModelAndView modelAndView){
        WeatherDTO weatherDTO = weatherService.getWeather(city, 52.2298, 21.0118);
        modelAndView.addObject("weatherDTO", weatherDTO);
        modelAndView.setViewName("/weather/weather");
        return modelAndView;
    }

}
