package com.project.weatherapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeatherForecast {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private WeatherReport[] weatherReports;

    public WeatherForecast() {
        weatherReports = new WeatherReport[40];
    }
    public WeatherReport[] getWeatherReport() {
        return weatherReports;
    }

    public void setWeatherReport(WeatherReport[] weatherReports) {
        this.weatherReports = weatherReports;
    }
}
