package com.project.weatherapp.Service;

import com.project.weatherapp.Model.WeatherReport;
import com.project.weatherapp.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAPIImpl implements WeatherAPI {

    @Autowired
    WeatherRepository weatherRepository;

    private final RestTemplate restTemplate;

    public WeatherAPIImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherReport getCurrentWeather(String city) {
        final String url = "https://api.openweathermap.org/data/2" +
                ".5/weather?&units=metric&appid=3ea66d80fa3cf9b52c7595bd617484d2&q=" + city.strip();
        return restTemplate.getForObject(url, WeatherReport.class);
    }

    public void create(WeatherReport weatherRep) {
        weatherRepository.save(weatherRep);
    }


}
