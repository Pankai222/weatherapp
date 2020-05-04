package com.project.weatherapp.Repository;


import com.project.weatherapp.Model.WeatherReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends CrudRepository<WeatherReport, Long> {
}
