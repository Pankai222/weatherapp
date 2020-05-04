package com.project.weatherapp.Controller;

import com.project.weatherapp.Model.WeatherReport;
import com.project.weatherapp.Service.WeatherAPI;
import com.project.weatherapp.Service.WeatherAPIImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final WeatherAPI weatherAPI;

    @Autowired
    WeatherAPIImpl weatherService;

    public HomeController(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/current")
    public String current(Model model, String city) {
        WeatherReport weatherRep = weatherAPI.getCurrentWeather(city);
        weatherService.create(weatherRep);
        model.addAttribute("weather",weatherRep);
        return "current";
    }
}
