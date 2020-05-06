package com.project.weatherapp.Service;

import com.project.weatherapp.Model.WeatherReport;

import java.util.ArrayList;

public interface WeatherAPI {

   WeatherReport getCurrentWeather(String city);

   ArrayList<WeatherReport> getForecast(String city);

}
