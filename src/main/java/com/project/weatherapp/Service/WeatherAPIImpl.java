package com.project.weatherapp.Service;

import com.project.weatherapp.Model.WeatherForecast;
import com.project.weatherapp.Model.WeatherReport;
import com.project.weatherapp.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

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
        final String currentUrl = "https://api.openweathermap.org/data/2" +
                ".5/weather?&units=metric&appid=3ea66d80fa3cf9b52c7595bd617484d2&q=" + city.strip();
        return restTemplate.getForObject(currentUrl, WeatherReport.class);
    }

    @Override
    public ArrayList<WeatherReport> getForecast(String city) {
        ArrayList<WeatherReport> weatherList = new ArrayList<>();
        final String forecastUrl = "https://api.openweathermap.org/data/2" +
                ".5/forecast?&units=metric&appid=3ea66d80fa3cf9b52c7595bd617484d2&q=" + city.strip();
        WeatherForecast forecast = restTemplate.getForObject(forecastUrl,
                WeatherForecast.class);

        /*for (WeatherReport weatherReport : weatherForDays) {
            weatherList.add(weatherReport);
        }
        System.out.println(weatherForDays); */
        return weatherList;
    }

    public void create(WeatherReport weatherRep) {
        weatherRepository.save(weatherRep);
    }


}
