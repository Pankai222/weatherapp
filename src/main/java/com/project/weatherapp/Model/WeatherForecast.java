package com.project.weatherapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class WeatherForecast {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private ArrayList<WeatherReport> weatherReport;

    public ArrayList<WeatherReport> getWeatherReport() {
        return weatherReport;
    }

    public void setWeatherReport(ArrayList<WeatherReport> weatherReport) {
        this.weatherReport = weatherReport;
    }
}
