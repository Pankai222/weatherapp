package com.project.weatherapp.Service;

import com.project.weatherapp.Model.WeatherReport;

public interface WeatherAPI {

   WeatherReport getCurrentWeather(String city);

}
